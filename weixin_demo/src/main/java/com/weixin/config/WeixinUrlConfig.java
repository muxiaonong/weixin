package com.weixin.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @program: sell
 * @ClassName ProjectUrlConfig
 * @description:
 * @author: lyy
 * @create: 2019-11-12 21:41
 * @Version 1.0
 **/
@Data
@Component
@ConfigurationProperties(prefix = "projecturl")
public class WeixinUrlConfig {

    /**
     * 微信公众平台授权url
     */
    public String wechatMpAuthorize;


}