package com.chen.java.pattern.chapter02;

import lombok.*;

/**
 * MessageData
 *
 * @author Chenpz
 * @package com.chen.java.pattern.chapter02.self
 * @date 2018/1/14/21:43
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
public class MessageData {

    /**
     * 温度
     */
    private float temperature;
    /**
     * 湿度
     */
    private float humidity;
    /**
     * 气压
     */
    private float pressure;



}
