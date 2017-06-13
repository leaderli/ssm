package dao;

import bean.User;

/**
 * Created by li on 17/6/9.
 */
public interface UserMapper {
    User queryUserByUsername(String username);

    User queryUserById(int id);
}
