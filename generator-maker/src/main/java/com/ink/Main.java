package com.ink;

import com.ink.cli.CommandExecutor;

public class Main {
    public static void main(String[] args) {

        CommandExecutor commandExecutor = new CommandExecutor();
        args = new String[]{"generate", "-a", "-l", "-o"};
//        args = new String[]{"list"};
        commandExecutor.doExecute(args);

        System.out.println("创建结束");
    }
}