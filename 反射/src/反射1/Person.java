package 反射1;

/**
 * @author wangxiang
 * @create 2021/1/2
 */
@MyAnnotation(value = "你好")
public class Person extends Creater<String> implements Comparable<String>,MyInterface{
   private String name;
   int age;
   private int number;
   public int id;

   public Person(){

   }
    @MyAnnotation(value = "a")


    private Person(String name) {
        this.name = name;
    }

     Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @MyAnnotation(value = "b")
    private String show(String nation){
        System.out.println("我的国籍是:"+nation);
        return nation;
    }

    public String display(String interest){
       return interest;
    }

    private static void showDesc(){
        System.out.println("我是一个老好人");
    }

    @Override
    public int compareTo(String o) {
        return 0;
    }

    @Override
    public void info() {
        System.out.println("我是一个人");
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", number=" + number +
                ", id=" + id +
                '}';
    }
}
