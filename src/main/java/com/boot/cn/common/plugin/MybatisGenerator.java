package com.boot.cn.common.plugin;

import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.exception.InvalidConfigurationException;
import org.mybatis.generator.exception.XMLParserException;
import org.mybatis.generator.internal.DefaultShellCallback;

import java.io.IOException;
import java.io.InputStream;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * mybatis逆向工程: 根据配置的generatorConfig.xml 生成对于的javaBean
 * 使用注意: Config "Working directory" = $MODULE_DIR$  ||  Real Path\biz-qa-manage
 *
 * @author nobody
 */
public class MybatisGenerator {
    public static void main(String[] args) throws IOException,
            XMLParserException, InvalidConfigurationException, SQLException,
            InterruptedException {

        //生成过程的警告信息
        List<String> warnings = new ArrayList<>();

        //配置文件
        InputStream resource = MybatisGenerator.class.getClassLoader().getResourceAsStream("generator/generatorConfig.xml");
        Configuration config = new ConfigurationParser(warnings).parseConfiguration(resource);

        //生成javaBean及mapper.xml
        DefaultShellCallback defaultShellCallback = new DefaultShellCallback(true);
        new OverrideMyBatisGenerator(config, defaultShellCallback, warnings).generate(null);

        System.out.println("生成完成\n" + warnings.toString());
    }
}
