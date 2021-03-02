package ObjectInputOutputStreamTest;

import java.io.Serializable;

/**
 * @author wangxiang
 * @create 2020/12/31
 *
 * Person需要满足如下的要求，方可序列化
 * 1.需要实现接口，Serializable
 * 2.当前类提供一个全局常量：serialVersionUID
 * 3.除了当前Person类需要实现Serializable接口之外，还必须保证
 * 其内部所有属性也必须是可序列化的
 */
public class Person implements Serializable {
    private String name;
    private int age;

    public static final long serialVersionUID=421465456456456L;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person() {
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
