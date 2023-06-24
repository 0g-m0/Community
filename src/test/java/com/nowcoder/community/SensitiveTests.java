package com.nowcoder.community;

import com.nowcoder.community.util.SensitiveFilter;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * ClassName: SensitiveTests
 * Package: com.nowcoder.community
 * Description:
 *
 * @Author Mia
 * @Create 2023/6/19 11:17
 * @Version 1.0
 */

@RunWith(SpringRunner.class)
@SpringBootTest
@ContextConfiguration(classes = CommunityApplication.class)
public class SensitiveTests {
    @Autowired
    private SensitiveFilter sensitiveFilter;

    @Test
    public void testSensitiveFilter() {
        String text = "这里可以☆赌☆博☆，可以☆嫖☆娼☆，可以开☆票，哈哈哈哈！";
        text = sensitiveFilter.filter(text);
        System.out.println(text);
    }

}
