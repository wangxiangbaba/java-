package lambda表达式;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

/**
 * @author wangxiang
 * @create 2021/1/4
 * <p>
 * java内置的4大核心函数式接口
 * 1.消费型接口
 * 2.供给型接口
 * 3.函数型接口
 * 4.断定型接口
 */
public class LambdaTest2 {

    @Test
    public void test1() {
        happyTime(500, new Consumer<Double>() {
            @Override
            public void accept(Double aDouble) {
                System.out.println("我们学习太累了花了" + aDouble);
            }
        });

        System.out.println("********");

        happyTime(400, money -> System.out.println("我们学习太累了花了" + money));

        List<String> list = Arrays.asList("北京", "南京", "东京", "西京");
        List<String> filterStringS = filterString(list, new Predicate<String>() {
            @Override
            public boolean test(String s) {
                return s.contains("京");
            }
        });
        System.out.println(filterStringS);

        List<String> filterStringS1 =filterString(list,s ->s.contains("京") );
        System.out.println(filterStringS1);

    }

    // * 1.消费型接口
    public void happyTime(double money, Consumer<Double> con) {
        con.accept(money);

    }

    //   断定型接口
    public List<String> filterString(List<String> list, Predicate<String> pre) {

        ArrayList<String> filterList = new ArrayList<>();
        for (String s :
                list) {
            if (pre.test(s)) {
                filterList.add(s);
            }
        }
        return filterList;
    }
}
