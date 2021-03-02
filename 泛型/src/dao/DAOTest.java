package dao;

import org.junit.Test;

import java.util.List;

/**
 * @author wangxiang
 * @create 2020/12/28
 */
public class DAOTest {

    @Test
    public void test(){
        CustomerDAO dao1 = new CustomerDAO();

        dao1.add(new Customer());
        List<Customer> list = dao1.getForList(10);

    }
}
