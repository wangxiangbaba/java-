package StreamAPI;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import org.junit.Test;
import org.omg.CORBA.PUBLIC_MEMBER;
import 方法引用.Employee;
import 方法引用.EmployeeData;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * @author wangxiang
 * @create 2021/1/4
 */
public class SteamAPITest {
    //    创建Stream方式一：通过集合
    @Test
    public void test1() {

        List<Employee> employees1 = EmployeeData.getEmployees();

//        default Stream<E> stream():返回一个顺序流

        Stream<Employee> stream1 = employees1.stream();

//        default Stream<E> parallelStream():返回一个顺序流
        Stream<Employee> employeeStream = employees1.parallelStream();

//    创建Stream方式一：通过数组
        int[] arr1 = new int[]{1, 2, 3, 4, 5, 6};
        IntStream stream = Arrays.stream(arr1);

        Employee employee2 = new Employee(1001, "TPM");
        Employee employee3 = new Employee(1002, "rose");
        Employee[] arr2 = new Employee[]{employee2, employee3};

        Stream<Employee> stream2 = Arrays.stream(arr2);

//    创建Stream方式三：通过Stream的of()
        Stream<Integer> integerStream = Stream.of(1, 2, 3, 4, 5, 6);

//    创建Stream方式四：创建无限流
//        迭代
        Stream.iterate(0, t -> t + 2).limit(10).forEach(System.out::println);
//        生成
        Stream.generate(Math::random).limit(10).forEach(System.out::println);
    }

    //    筛选与切片
    @Test
    public void test2() {
        List<Employee> employees1 = EmployeeData.getEmployees();

        Stream<Employee> stream = employees1.stream();
        stream.filter(e -> e.getSalary() > 7000).forEach(System.out::println);

        System.out.println();

        employees1.stream().limit(3).forEach(System.out::println);

        System.out.println();

        employees1.stream().skip(3).forEach(System.out::println);

        System.out.println();

        employees1.add(new Employee(1010, "刘强东", 40, 8000));
        employees1.add(new Employee(1010, "刘强东", 40, 8000));
        employees1.add(new Employee(1010, "刘强东", 40, 8000));
        employees1.add(new Employee(1010, "刘强东", 40, 8000));
        employees1.add(new Employee(1010, "刘强东", 40, 8000));

        employees1.stream().distinct().forEach(System.out::println);

    }

    //    映射
    @Test
    public void test3() {
        List<String> list = Arrays.asList("aa", "bb", "cc", "dd");
        list.stream().map(str -> str.toUpperCase()).forEach(System.out::println);

//        练习：获取员工姓名长度大于3的员工的姓名
        List<Employee> employees = EmployeeData.getEmployees();
        Stream<String> namesStream = employees.stream().map(e -> e.getName());
        namesStream.filter(name -> name.length() > 3).forEach(System.out::println);

        ArrayList list1 = new ArrayList();
        list1.add(1);
        list1.add(2);
        list1.add(3);

        ArrayList list2 = new ArrayList();
        list2.add(4);
        list2.add(5);
        list2.add(6);

        list1.addAll(list2);
        System.out.println(list1);

        System.out.println();
//        练习2：
        Stream<Stream<Character>> streamStream = list.stream().map(SteamAPITest::fromStringToStream);
        streamStream.forEach(s -> {
            s.forEach(System.out::println);
        });

        System.out.println();

//        flatMap
        Stream<Character> characterStream = list.stream().flatMap(SteamAPITest::fromStringToStream);
        characterStream.forEach(System.out::println);

        System.out.println();
        List<Integer> list3 = Arrays.asList(12, 34, 56, 854, 8845, 8135, 123);
        list3.stream().sorted().forEach(System.out::println);

        System.out.println();
        List<Employee> employees1 = EmployeeData.getEmployees();
        employees1.stream().sorted((e1, e2) -> {
            int ageValue = Integer.compare(e1.getAge(), e2.getAge());
            if (ageValue != 0) {
                return ageValue;
            } else {
                return -Double.compare(e1.getSalary(), e2.getSalary());
            }
        }).forEach(System.out::println);

    }

    //    将字符串中的多个字符构成的集合转换为对用的Stream的实例
    public static Stream<Character> fromStringToStream(String str) {
        ArrayList<Character> list = new ArrayList<>();
        for (Character c : str.toCharArray()) {
            list.add(c);
        }
        return list.stream();
    }

    //    Stream的终止操作
    @Test
    public void test4() {
//        练习：是否所有的员工的年龄都大于18
        List<Employee> employees = EmployeeData.getEmployees();
        boolean allMatch = employees.stream().allMatch(e -> e.getAge() > 18);
        System.out.println(allMatch);

//        练习：是否存在员工的工作大于1000
        boolean b = employees.stream().anyMatch(e -> e.getSalary() > 10000);
        System.out.println(b);

//        练习:是否存在员工姓"雷"
        boolean lei = employees.stream().noneMatch(e -> e.getName().startsWith("雷"));
        System.out.println(lei);

        Optional<Employee> first = employees.stream().findFirst();
        System.out.println(first);

        Optional<Employee> any = employees.parallelStream().findAny();
        System.out.println(any);

    }

    @Test
    public void test5() {
        List<Employee> employees = EmployeeData.getEmployees();

        long count = employees.stream().filter(e -> e.getSalary() > 5000).count();
        System.out.println(count);

//      练习：返回最高的工资
        Stream<Double> salaryStream = employees.stream().map(e -> e.getSalary());
        Optional<Double> max = salaryStream.max(Double::compare);
        System.out.println(max);

//      练习：返回最低的工资的员工
        Optional<Employee> min = employees.stream().min(Comparator.comparingDouble(Employee::getSalary));
        System.out.println(min);

//        内部迭代
        employees.stream().forEach(System.out::println);

        employees.forEach(System.out::println);
    }

    //    归约
    @Test
    public void test6() {
//        练习：计算1-10的自然数的和
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        Integer sum = list.stream().reduce(0, Integer::sum);
        System.out.println(sum);

//        练习：计算公司所有员工工资的总和
        List<Employee> employees = EmployeeData.getEmployees();
        Stream<Double> salaryStream = employees.stream().map(Employee::getSalary);
        Optional<Double> sumMoney = salaryStream.reduce(Double::sum);
        System.out.println(sumMoney);
    }

    //    收集
    @Test
    public void test7(){
        List<Employee> employees = EmployeeData.getEmployees();
//        练习：查找工资大于6000的员工，结果返回一个List或Set
        List<Employee> employeeList = employees.stream().filter(e -> e.getSalary() > 6000).collect(Collectors.toList());
        employeeList.forEach(System.out::println);

        Set<Employee> employeeSet = employees.stream().filter(e -> e.getSalary() > 6000).collect(Collectors.toSet());
        employeeSet.forEach(System.out::println);

    }
}
