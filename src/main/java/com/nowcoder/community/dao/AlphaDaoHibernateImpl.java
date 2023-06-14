package com.nowcoder.community.dao;

import org.springframework.stereotype.Repository;

/**
 * ClassName: AlphaDaoHibernateImpl
 * Package: com.nowcoder.community.dao
 * Description:
 *
 * @Author Mia
 * @Create 2023/6/13 14:55
 * @Version 1.0
 */
@Repository("alphaHibernate")
public class AlphaDaoHibernateImpl implements AlphaDao{
    @Override
    public String select() {
        return "Hibernate";
    }
}
