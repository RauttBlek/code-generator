package com.ink.model;

import lombok.Data;

@Data
public class AcmModel {
    /**
     * 作者文本段
     */
    private String author = "defaultAuthor";
    /**
     * 输出文本段
     */
    private String outputText = "标准输出";
    /**
     * 循环是否开启
     */
    private boolean loop = false;

}
