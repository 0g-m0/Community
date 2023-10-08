package com.nowcoder.community.dao;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

/**
 * ClassName: AlphaDaoMyBatisImpl
 * Package: com.nowcoder.community.dao
 * Description:
 *
 * @Author Mia
 * @Create 2023/6/13 14:55
 * @Version 1.0
 */
@Repository
@Primary
public class AlphaDaoMyBatisImpl implements AlphaDao{
    @Override
    public String select() {
        return "MyBatis";
    }
}
