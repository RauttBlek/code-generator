package com.ink.generator;

import cn.hutool.core.io.FileUtil;

import java.io.File;

public class StaticGenerator {

    public static void copyByHuTool(File input, File output){
        FileUtil.copy(input, output, true);
    }

}
