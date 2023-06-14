package com.nowcoder.community.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.text.SimpleDateFormat;

/**
 * ClassName: AlphaConfig
 * Package: com.nowcoder.community.config
 * Description:
 *
 * @Author Mia
 * @Create 2023/6/13 14:54
 * @Version 1.0
 */
@Configuration
public class AlphaConfig {
    @Bean
    public SimpleDateFormat simpleDateFormat(){
        return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    }
}

