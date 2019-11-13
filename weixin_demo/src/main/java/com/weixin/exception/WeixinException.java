package com.weixin.exception;

import com.weixin.enums.ResultEnum;

/**
 * @program: weixin_demo
 * @ClassName WeixinException
 * @description:
 * @author: lyy
 * @create: 2019-11-13 14:50
 * @Version 1.0
 **/
public class WeixinException extends RuntimeException{

    private Integer code;

    public WeixinException(ResultEnum resultEnum) {
        super(resultEnum.getMessage());

        this.code = resultEnum.getCode();
    }

    public WeixinException(Integer code, String message) {
        super(message);
        this.code = code;
    }

}