package 动态代理;
/**
 * @author wangxiang
 * @create 2021/1/
 *
 * 静态代理举例
 *
 * 特点：代理类和被代理类在编译期间，就确定下来了
 *
 */
interface ClothFactory{
    void produceCloth();
}

//代理类
class ProxyClothFactory implements ClothFactory{
    private ClothFactory factory;//用被代理类对象进行实例化

    public ProxyClothFactory(ClothFactory factory){
        this.factory=factory;
    }

    @Override
    public void produceCloth(){
        System.out.println("代理工厂做一些准备工作");

        factory.produceCloth();

        System.out.println("代理工程做一些后续完善工作");
    }

}

//被代理类
class NikeClothFactory implements ClothFactory{

    @Override
    public void produceCloth() {
        System.out.println("NIKE工程生产一批运动服");
    }
}


public class StaticProxyTest {
    public static void main(String[] args) {
//        创建被代理类对象
        NikeClothFactory nike = new NikeClothFactory();
//        创建代理类对象
        ProxyClothFactory proxyClothFactory = new ProxyClothFactory(nike);

        proxyClothFactory.produceCloth();

    }
}
