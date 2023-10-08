package com.nowcoder.community.dao;

import com.nowcoder.community.entity.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * ClassName: UserMapper
 * Package: com.nowcoder.community.dao
 * Description:
 *
 * @Author Mia
 * @Create 2023/6/13 14:56
 * @Version 1.0
 */
@Mapper
public interface UserMapper {

    User selectById(int id);
    User selectByName(String username);
    User selectByEmail(String email);
    int insertUser(User user);
    int updateStatus(int id, int status);
    int updateHeader(int id, String headerUrl);
    int updatePassword(int id, String password);

}