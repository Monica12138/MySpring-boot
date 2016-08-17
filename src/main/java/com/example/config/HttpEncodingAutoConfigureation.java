/* 
 * Copyright (C), 2015-2016, 深圳天道计然金融服务有限公司
 * File Name: @(#)HttpEncodingAutoConfigureation.java
 * Encoding UTF-8
 * Author: hao.tian@mljr.com
 * Version: 1.0
 * Date: 2016年8月17日
 */
package com.example.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.autoconfigure.web.HttpEncodingProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.web.filter.OrderedCharacterEncodingFilter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.filter.CharacterEncodingFilter;

/** 
 * 功能描述
 * 
 * <p>
 * <a href="HttpEncodingAutoConfigureation.java"><i>View Source</i></a>
 * 
 * @author hao.tian@mljr.com
 * @version 1.0
 * @since 1.0 
 */
@Configuration
@EnableConfigurationProperties(HttpEncodingProperties.class)
@ConditionalOnClass(CharacterEncodingFilter.class)
@ConditionalOnProperty(prefix="spring.http.encoding",value="enabled",matchIfMissing = true)
public class HttpEncodingAutoConfigureation {
    
    @Autowired
    private HttpEncodingProperties httpEncodingProperties;
    
    @Bean
    @ConditionalOnMissingBean(CharacterEncodingFilter.class)
    public CharacterEncodingFilter characterEncodingFilter(){
        CharacterEncodingFilter filter = new OrderedCharacterEncodingFilter();
        filter.setEncoding(this.httpEncodingProperties.getCharset().name());
        filter.setForceEncoding(this.httpEncodingProperties.isForce());
        return filter;
        
    }
}
