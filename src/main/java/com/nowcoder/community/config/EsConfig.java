package com.nowcoder.community.config;

import org.elasticsearch.client.RestClient;
import org.elasticsearch.client.RestHighLevelClient;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.elasticsearch.client.ClientConfiguration;
import org.springframework.data.elasticsearch.client.RestClients;

/**
 * ClassName: EsConfig
 * Package: com.nowcoder.community.config
 * Description:
 *
 * @Author Mia
 * @Create 2023/7/4 19:51
 * @Version 1.0
 */

@Configuration
public class EsConfig {

    @Value("${elasticSearch.url}")
    private String esUrl;

    @Bean
    RestHighLevelClient client() {
        ClientConfiguration clientConfiguration = ClientConfiguration.builder()
                .connectedTo(esUrl)
                .build();

        return RestClients.create(clientConfiguration).rest();
    }



}
