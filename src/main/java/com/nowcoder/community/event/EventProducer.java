package com.nowcoder.community.event;

import com.alibaba.fastjson.JSONObject;
import com.nowcoder.community.entity.Event;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

/**
 * ClassName: EventProducer
 * Package: com.nowcoder.community.event
 * Description:
 *
 * @Author Mia
 * @Create 2023/6/27 11:13
 * @Version 1.0
 */

@Component
public class EventProducer {

    @Autowired
    private KafkaTemplate kafkaTemplate;

    // 处理事件
    public void fireEvent(Event event) {
        // 将事件发送到指定的主题
        kafkaTemplate.send(event.getTopic(), JSONObject.toJSONString(event));

    }

}
