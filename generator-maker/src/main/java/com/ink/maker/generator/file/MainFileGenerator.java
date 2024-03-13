package com.ink.maker.generator.file;

import freemarker.template.TemplateException;

import java.io.File;
import java.io.IOException;

public class MainFileGenerator {

    public static void doGenerate(Object model) throws TemplateException, IOException {
        //静态生成，直接复制
        //todo 文件路径需变动
        File staticInput = new File("README.md");
        File staticOutput = new File("output/README.md");
        StaticFileGenerator.copyByHuTool(staticInput, staticOutput);

        //调用动态生成方法
//        String projectDir = System.getProperty("user.dir");
        File inputFile = new File("generator-maker/src/main/resources/template");
        File outputFile = new File("output/acmTemplate.java");
//        String outputPath = projectDir + File.separator + "acmTemplate.java";
        DynamicFileGenerator.doGenerate(inputFile, outputFile, model);
    }
}
