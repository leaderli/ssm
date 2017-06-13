import bean.User;
import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import service.UserService;

import javax.annotation.Resource;

/**
 * Created by li on 17/6/9.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring-mvc.xml","classpath:spring-mybatis.xml"})
public class TestMybatis {
    private static Logger logger = Logger.getLogger(TestMybatis.class);
    @Resource
    private UserService userService;
    @Test
    public void  test1(){
        User user = userService.queryUserByUsername("fuck");
        System.out.println(user);
    }
    @Test
    public void test2(){
    }
}
