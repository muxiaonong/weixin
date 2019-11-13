package com.weixin.enums;

import lombok.Getter;

/**
 * @program: sell
 * @ClassName PayStatusEnum
 * @description:支付状态
 * @author: lyy
 * @create: 2019-11-07 21:28
 * @Version 1.0
 **/
@Getter
public enum ResultEnum {



    WECHAT_MP_ERROR(1, "微信公众账号方面错误"),

    ;

    private Integer code;

    private String message;

    ResultEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
