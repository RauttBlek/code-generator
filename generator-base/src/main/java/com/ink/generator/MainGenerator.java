package com.ink.generator;

import freemarker.template.TemplateException;

import java.io.File;
import java.io.IOException;

public class MainGenerator {

    public static void doGenerate(Object model) throws TemplateException, IOException {
        //静态生成，直接复制
        File staticInput = new File("README.md");
        File staticOutput = new File("output/README.md");
        StaticGenerator.copyByHuTool(staticInput, staticOutput);

        //调用动态生成方法
//        String projectDir = System.getProperty("user.dir");
        File inputFile = new File("generator-base/src/main/resources/template");
        File outputFile = new File("output/acmTemplate.java");
//        String outputPath = projectDir + File.separator + "acmTemplate.java";
        DynamicGenerator.doGenerate(inputFile, outputFile, model);
    }
}
