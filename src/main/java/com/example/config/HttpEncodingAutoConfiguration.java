/* 
 * Copyright (C), 2015-2016, 深圳天道计然金融服务有限公司
 * File Name: @(#)HttpEncodingAutoConfiguration.java
 * Encoding UTF-8
 * Author: hao.tian@mljr.com
 * Version: 1.0
 * Date: 2016年8月17日
 */
package com.example.config;

import java.nio.charset.Charset;

import org.springframework.boot.context.properties.ConfigurationProperties;

/** 
 * 功能描述
 * 
 * <p>
 * <a href="HttpEncodingAutoConfiguration.java"><i>View Source</i></a>
 * 
 * @author hao.tian@mljr.com
 * @version 1.0
 * @since 1.0 
 */
@ConfigurationProperties(prefix="spring.http.encoding")
public class HttpEncodingAutoConfiguration {
    public static final Charset DEFAULT_CHARSET = Charset.forName("UTF-8");
    
    private Charset charset = DEFAULT_CHARSET;
    
    private boolean force = true;

    /**
     * @return the charset
     */
    public Charset getCharset() {
        return charset;
    }

    /**
     * @param charset the charset to set
     */
    public void setCharset(Charset charset) {
        this.charset = charset;
    }

    /**
     * @return the force
     */
    public boolean isForce() {
        return force;
    }

    /**
     * @param force the force to set
     */
    public void setForce(boolean force) {
        this.force = force;
    }
    
    
}
