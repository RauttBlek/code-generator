package com.ink.cli;

import com.ink.cli.command.ConfigOutputCommand;
import com.ink.cli.command.GenerateCommand;
import com.ink.cli.command.ListCommand;
import picocli.CommandLine;
import picocli.CommandLine.Command;

import java.util.concurrent.Callable;

@Command(name = "basic", mixinStandardHelpOptions = true)
public class CommandExecutor implements Callable<Integer> {

    private final CommandLine commandLine;
    {
       commandLine = new CommandLine(this).addSubcommand(new ConfigOutputCommand())
                    .addSubcommand(new ListCommand())
                    .addSubcommand(new GenerateCommand());
    }

    @Override
    public Integer call() throws Exception {
        System.out.println("请给出合适的子命令");
        return 0;
    }

    public void doExecute(String[] args){
        commandLine.execute(args);
    }
}
