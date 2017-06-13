package service.impl;

import bean.User;
import dao.UserMapper;
import org.springframework.stereotype.Service;
import service.UserService;

import javax.annotation.Resource;

/**
 * Created by li on 17/6/9.
 */
@Service
public class UserServiceImpl implements UserService {
    @Resource
    private UserMapper userMapper;

    public User queryUserByUsername(String username) {
        System.out.println("userMapper"+userMapper);
        return userMapper.queryUserByUsername(username);
    }
}
