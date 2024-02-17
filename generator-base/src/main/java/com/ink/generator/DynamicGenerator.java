package com.ink.generator;

import freemarker.template.Configuration;
import freemarker.template.Template;
import freemarker.template.TemplateException;
import freemarker.template.TemplateExceptionHandler;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class DynamicGenerator {

    public static void doGenerate(File input, File output, Object model) throws IOException, TemplateException {
        Configuration configuration = new Configuration(Configuration.VERSION_2_3_32);
        //配置模板文件路径等
        configuration.setDirectoryForTemplateLoading(input.getParentFile());
        configuration.setDefaultEncoding("UTF-8");
        configuration.setTemplateExceptionHandler(TemplateExceptionHandler.RETHROW_HANDLER);
        //读取模板并生成为template对象
        Template template = configuration.getTemplate("acmTemplate.java.ftl");
        Writer out = new FileWriter(output);
        template.process(model, out);

        out.close();
    }

}
