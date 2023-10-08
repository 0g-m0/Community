package com.nowcoder.community.util;

import com.nowcoder.community.entity.User;
import org.springframework.stereotype.Component;

/**
 * ClassName: HostHolder
 * Package: com.nowcoder.community.util
 * Description:
 *
 * @Author Mia
 * @Create 2023/6/16 10:53
 * @Version 1.0
 */

/*
 * 持有用户信息，用于代替session对象
 * */

@Component
public class HostHolder {
    private ThreadLocal<User> users = new ThreadLocal<User>();

    public void setUser(User user) {
        users.set(user);
    }

    public User getUser() {
        return users.get();
    }

    public void clear(){
        users.remove();
    }

}
