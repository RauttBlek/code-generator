package com.ink.cli.command;

import cn.hutool.core.bean.BeanUtil;
import com.ink.generator.MainGenerator;
import com.ink.model.AcmModel;
import lombok.Data;
import picocli.CommandLine;

import java.util.concurrent.Callable;

@CommandLine.Command(name = "generate", description = "生成文件", mixinStandardHelpOptions = true)
@Data
public class GenerateCommand implements Callable<Integer> {
    @CommandLine.Option(names = {"-a", "--author"}, description = "作者名称", arity = "0..1", interactive = true)
    private String author = "默认作者";
    @CommandLine.Option(names = {"-o", "--output"}, description = "输出文本", arity = "0..1", interactive = true)
    private String outputText = "默认输出";
    @CommandLine.Option(names = {"-l", "--loop"}, description = "是否开启循环", arity = "0..1", interactive = true)
    private boolean loop = false;

    @Override
    public Integer call() throws Exception {
        AcmModel model = new AcmModel();
        BeanUtil.copyProperties(this, model);
        MainGenerator.doGenerate(model);
        return 0;
    }
}
