package com.ink.maker.generator.file;

import cn.hutool.core.io.FileUtil;

import java.io.File;

public class StaticFileGenerator {

    public static void copyByHuTool(File input, File output){
        FileUtil.copy(input, output, true);
    }

}
