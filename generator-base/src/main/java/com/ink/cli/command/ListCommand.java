package com.ink.cli.command;

import cn.hutool.core.io.FileUtil;
import picocli.CommandLine;

import java.io.File;
import java.util.List;

@CommandLine.Command(name = "list", description = "显示文件列表", mixinStandardHelpOptions = true)
public class ListCommand implements Runnable{

    @Override
    public void run() {
        File file = new File("generator-base/src/main/resources/template");
        List<File> files = FileUtil.loopFiles(file);
        for(File f:files){
            System.out.println(f);
        }
    }
}
