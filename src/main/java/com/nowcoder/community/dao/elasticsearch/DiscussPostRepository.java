package com.nowcoder.community.dao.elasticsearch;

import com.nowcoder.community.entity.DiscussPost;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

/**
 * ClassName: DiscussPostRepository
 * Package: com.nowcoder.community.dao.elasticsearch
 * Description:
 *
 * @Author Mia
 * @Create 2023/6/28 19:27
 * @Version 1.0
 */

@Repository
public interface DiscussPostRepository extends ElasticsearchRepository<DiscussPost, Integer> {

}
