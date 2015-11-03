package psyco.multiDataSource.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import psyco.multiDataSource.test.mapper.UserMapper;
import psyco.multiDataSource.test.mapper.UserUserMapper;

import javax.annotation.Resource;

/**
 * Created by lipeng on 15/8/15.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ComponentScan(basePackages = {"psyco.multiDataSource"})
@EnableTransactionManagement
@EnableAspectJAutoProxy
@SpringApplicationConfiguration(classes = {MybatisTest.class})
public class MybatisTest {

    @Resource
    private UserMapper userMapper;
    @Resource
    private UserUserMapper userUserMapper;

    @Test
    public void test() {
        System.out.println(userMapper.findOne(3));
        System.out.println(userUserMapper.findAll());
        System.out.println(userMapper.findAll());
    }

}
