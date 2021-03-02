package Optional类;

/**
 * @author wangxiang
 * @create 2021/1/4
 */
public class Boy {
    private Girl girl;

    @Override
    public String toString() {
        return "Boy{" +
                "girl=" + girl +
                '}';
    }

    public Girl getGirl() {
        return girl;
    }

    public void setGirl(Girl girl) {
        this.girl = girl;
    }

    public Boy(Girl girl) {
        this.girl = girl;
    }

    public Boy() {
    }
}
