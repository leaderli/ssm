package controller;

import bean.User;
import dao.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by li on 17/6/9.
 */
@Controller
@RequestMapping("hello")
public class Hello {
    @Autowired
    private UserMapper userMapper;
    @ResponseBody
    @RequestMapping("home/{id}")
    public User home(@PathVariable int id) {
        System.out.println("-----------");
        System.out.println(id);
        User user = userMapper.queryUserById(id);
        System.out.println(user);
        System.out.println("-----------");
        return user;
    }

    @ResponseBody
    @RequestMapping("list")
    public List<User> list() {
        List<User> list = new ArrayList<User>();
        for(int i=10;i<15;i++)
            list.add(userMapper.queryUserById(i));
        return list;
    }
    @ResponseBody
    @RequestMapping("login")
    public User login(@RequestBody User user) {
        System.out.println("-----------");
        System.out.println("login");
        System.out.println(user);
        System.out.println("-----------");
        return user;
    }
}
