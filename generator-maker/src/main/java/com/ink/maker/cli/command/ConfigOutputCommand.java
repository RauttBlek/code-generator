package com.ink.maker.cli.command;

import cn.hutool.core.util.ReflectUtil;
import com.ink.maker.model.dataModel;
import picocli.CommandLine;

import java.lang.reflect.Field;

@CommandLine.Command(name = "config", description = "输出选项配置信息", mixinStandardHelpOptions = true)
public class ConfigOutputCommand implements Runnable{
    @Override
    public void run() {
        Field[] fields = ReflectUtil.getFields(dataModel.class);
        for(Field f:fields){
            System.out.println("属性名称" + f.getName());
            System.out.println("属性类型" + f.getType());
            System.out.println("---");
        }
    }
}
