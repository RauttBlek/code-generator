package com.ink;

import com.ink.generator.MainGenerator;
import com.ink.model.AcmModel;
import freemarker.template.TemplateException;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws TemplateException, IOException {
        AcmModel model = new AcmModel();
        model.setAuthor("ink");
        model.setOutputText("修改的输出");
        model.setLoop(false);

        MainGenerator.doGenerate(model);
        System.out.println("创建结束");
    }
}