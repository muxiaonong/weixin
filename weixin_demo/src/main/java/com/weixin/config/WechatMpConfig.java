package com.weixin.config;

import me.chanjar.weixin.mp.api.WxMpService;
import me.chanjar.weixin.mp.api.impl.WxMpServiceImpl;
import me.chanjar.weixin.mp.config.WxMpConfigStorage;
import me.chanjar.weixin.mp.config.impl.WxMpDefaultConfigImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

/**
 * @program: sell
 * @ClassName ProjectUrlConfig
 * @description:
 * @author: lyy
 * @create: 2019-11-12 21:41
 * @Version 1.0
 **/
@Component
public class WechatMpConfig {

    @Autowired
    private WechatAccountConfig accountConfig;

    @Bean
    public WxMpService wxMpService(){
        System.out.println("wxMpService");
        WxMpService wxMpService = new WxMpServiceImpl();
        wxMpService.setWxMpConfigStorage(wxMpConfigStorage());
        return wxMpService;
    }

    @Bean
    public WxMpConfigStorage wxMpConfigStorage(){
        System.out.println("wxMpConfigStorage(),{}"+accountConfig.getMpAppId());
        WxMpDefaultConfigImpl wxMpConfigStorage = new WxMpDefaultConfigImpl();
        wxMpConfigStorage.setAppId(accountConfig.getMpAppId());
        wxMpConfigStorage.setSecret(accountConfig.getMpAppSecret());
        return wxMpConfigStorage;
    }

}