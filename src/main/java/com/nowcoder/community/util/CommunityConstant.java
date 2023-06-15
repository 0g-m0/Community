package com.nowcoder.community.util;

/**
 * ClassName: CommunityConstant
 * Package: com.nowcoder.community.util
 * Description:
 *
 * @Author Mia
 * @Create 2023/6/14 17:55
 * @Version 1.0
 */
public interface CommunityConstant {
    /*
    * 激活成功
    * */
    int ACTIVATION_SUCESS = 0;

    /*
    * 重复激活
    * */
    int ACTIVATION_REPEAT = 1;

    /*
    * 激活失败
    * */
    int ACTIVATION_FAILURE = 2;

    /*
    * 默认状态的登录凭证的超时时间
    * */
    int DEFAULT_EXPIRED_SECONDS = 3600 * 12;

    /*
    * 记住状态的登录凭证超时时间
    * */
    int REMEMBER_EXPIRED_SECONDS = 3600 * 24 * 100;
}
