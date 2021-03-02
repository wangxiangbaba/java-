package Optional类;

import org.junit.Test;

import java.util.Optional;

/**
 * @author wangxiang
 * @create 2021/1/4
 *
 * 常用方法：ofNullable(T t)
 *         orElse(T t)
 */
public class OptionalTest {
    @Test
    public void test1() {
        Girl girl = new Girl();
        Optional<Girl> girl1 = Optional.of(girl);

    }

    @Test
    public void test2() {
        Girl girl = new Girl();
        girl=null;
        Optional<Girl> girl1 = Optional.ofNullable(girl);
        System.out.println(girl1);

    }

    public String getGirlName(Boy boy){
        if(boy != null){
            Girl girl = boy.getGirl();
            if(girl != null){
                return girl.getName();
            }
        }
        return null;
    }

    @Test
    public void test3(){
        Boy boy = new Boy();
        boy=null;
        String girlName = getGirlName(boy);
        System.out.println(girlName);
    }

    public String getGirlName2(Boy boy){
        Optional<Boy> boyOptional = Optional.ofNullable(boy);

        Boy boy1 = boyOptional.orElse(new Boy(new Girl("迪丽热巴")));
        Girl girl = boy1.getGirl();

        Optional<Girl> girlOptional = Optional.ofNullable(girl);
        Girl girl1 = girlOptional.orElse(new Girl("程潇"));


        return girl1.getName();
    }

    @Test
    public void test4(){
        Boy boy=null;
        String girlName2 = getGirlName2(boy);
        System.out.println(girlName2);
    }
}
