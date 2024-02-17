package com.ink.generator;

import freemarker.template.TemplateException;

import java.io.File;
import java.io.IOException;

public class MainGenerator {

    public static void doGenerate(Object model) throws TemplateException, IOException {
//        String projectDir = System.getProperty("user.dir");
        File inputFile = new File("generator-base/src/main/resources/acmTemplate.java.ftl");
        File outputFile = new File("acmTemplate.java");
//        String outputPath = projectDir + File.separator + "acmTemplate.java";
        DynamicGenerator.doGenerate(inputFile, outputFile, model);
    }
}
