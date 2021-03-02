import com.company.Goods;
import org.junit.Test;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author wangxiang
 * @create 2020/12/22
 *
 * 一 java中的对象，正常情况下，只能进行比较：== 或 !=  不能使用>或者<
 *  但是在开发场景中，我们需要对多个对象进行排序，言外之意，就需要比较对象的大小
 *      如何实现？使用两个接口：Comparable  Comparator
 *
 * 二 Comparable接口使用
 *
 *
 *
 */
public class CompareTest {
//    Comparable接口使用举例: 自然排序
//    1.像String，包装类等实现了Comparable接口，重写了comparaTo()方法，
//    给出了比较两个对象大小的方式
//    2.像String,包装类重写compareTo()方法以后,进行了从小到大的排列
//    3.重写comparaTo()的规则:
//    如果当前对象this大于形参对象obj,则返回正整数
//    如果当前对象this小于形参对象obj,则返回负整数
//    如果当前对象this等于形参对象obj,则返回零
//    4.对于自定义类来说,如果需要排序,我们可以让自定义类实现Comparable接口,
//    重写compareTo()方法,在compareTo(obj)方法中指明如何排序
    @Test
    public void test1(){
        String[] arr=new String[]{"AA","CC","MM","GG","DD","ZZ"};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
    @Test
    public void test2(){
        Goods[] arr=new Goods[4];
        arr[0]=new Goods("联想",600);
        arr[1]=new Goods("华为",35);
        arr[2]=new Goods("华硕",400);
        arr[3]=new Goods("镭射",37);

        Arrays.sort(arr, new Comparator<Goods>() {
            @Override
            public int compare(Goods o1, Goods o2) {
                if (o1 instanceof Goods && o2 instanceof Goods) {
                    Goods g1 = (Goods) o1;
                    Goods g2 = (Goods) o2;
                    if (g1.getName().equals(g2.getName())) {
                        return -Double.compare(g1.getPrice(),g2.getPrice());
                    } else {
                        return g1.getName().compareTo(g2.getName());
                    }
                }
                throw new RuntimeException("输入的数据类型不一致");
            }
        });
        System.out.println(Arrays.toString(arr));
    }
}
