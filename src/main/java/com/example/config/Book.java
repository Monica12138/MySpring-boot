/* 
 * Copyright (C), 2015-2016, 深圳天道计然金融服务有限公司
 * File Name: @(#)Book.java
 * Encoding UTF-8
 * Author: hao.tian@mljr.com
 * Version: 1.0
 * Date: 2016年8月17日
 */
package com.example.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * 功能描述
 * 
 * <p>
 * <a href="Book.java"><i>View Source</i></a>
 * 
 * @author hao.tian@mljr.com
 * @version 1.0
 * @since 1.0
 */
@Component
@ConfigurationProperties(prefix = "book", locations = { "classpath:config/book.properties" })
public class Book {
    private String name;
    private String author;

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the author
     */
    public String getAuthor() {
        return author;
    }

    /**
     * @param author the author to set
     */
    public void setAuthor(String author) {
        this.author = author;
    }

}
