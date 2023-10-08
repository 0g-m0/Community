package com.nowcoder.community.entity;

import org.thymeleaf.standard.processor.StandardEachTagProcessor;

import java.util.List;

/**
 * ClassName: SearchResult
 * Package: com.nowcoder.community.entity
 * Description:
 *
 * @Author Mia
 * @Create 2023/7/4 20:53
 * @Version 1.0
 */
public class SearchResult {
    private List<DiscussPost> list;
    private long total;


    public SearchResult(List<DiscussPost> list, long total) {
        this.list = list;
        this.total = total;
    }

    public List<DiscussPost> getList() {
        return list;
    }

    public void setList(List<DiscussPost> list) {
        this.list = list;
    }

    public long getTotal() {
        return total;
    }

    public void setTotal(long total) {
        this.total = total;
    }
}
