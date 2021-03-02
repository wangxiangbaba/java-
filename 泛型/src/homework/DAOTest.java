package homework;

import java.util.List;

/**
 * @author wangxiang
 * @create 2020/12/28
 */
public class DAOTest {
    public static void main(String[] args) {
        DAO<User> dao = new DAO<>();

        dao.save("1001",new User(1001,34,"王祥"));
        dao.save("1005",new User(1000,86,"尼玛"));
        dao.save("1003",new User(1008,36,"王尼玛"));
        dao.save("1004",new User(1007,35,"张全蛋"));

        dao.update("1003",new User(1003,30,"方文山"));

        dao.delete("1001");
        List<User> list = dao.list();
        System.out.println(list);
        list.forEach(System.out::println);
        list.forEach(System.out::println);
    }
}
