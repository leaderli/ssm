import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mock.web.MockHttpSession;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractTransactionalJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;

/**
 * Created by li on 17/6/9.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@ContextConfiguration(locations = {"classpath:spring-mvc.xml","classpath:spring-mybatis.xml"})
public class TestHello extends AbstractTransactionalJUnit4SpringContextTests{
    @Autowired
    private WebApplicationContext wac;

    private MockMvc mockMvc;
    private MockHttpSession session;
    @Before()  //这个方法在每个方法执行之前都会执行一遍
    public void setup()
    {
        System.out.println("--");
        mockMvc = MockMvcBuilders.webAppContextSetup(wac).build();  //初始化MockMvc对象
    }
    @Test
    public void test1() throws Exception {
        this.mockMvc.perform(
            get("/hello/login")
        );
    }
    @Test
    public void test2() throws Exception {
        this.mockMvc.perform(
                get("/hello/home/13")
        );
    }
}
