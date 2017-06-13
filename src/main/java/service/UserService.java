package service;

import bean.User;

/**
 * Created by li on 17/6/9.
 */
public interface UserService {
    User queryUserByUsername(String username);
}
