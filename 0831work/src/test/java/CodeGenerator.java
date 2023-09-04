import com.baomidou.mybatisplus.generator.FastAutoGenerator;
import com.baomidou.mybatisplus.generator.config.OutputFile;
import com.baomidou.mybatisplus.generator.engine.FreemarkerTemplateEngine;

import java.util.Collections;

/**
 * @param
 * @author qwerty
 * @date 2023/8/31
 */
public class CodeGenerator {
    public static void main(String[] args) {
        //url 设置数据库连接路径  账号  密码
        FastAutoGenerator.create("jdbc:mysql://localhost:3306/0831work", "root", "root")


                .globalConfig(builder -> {
                    builder.author("小杨") // 设置作者名称
                            //  .enableSwagger() // 开启 swagger 模式   (暂时注销)
                            //  .fileOverride() // 覆盖已生成文件
                            .outputDir("F:\\本地onedrive\\桌面\\idea时期\\idea时期\\0831work\\src\\main\\java"); //指定生成类的目录,输出目录,指定到java目录
                })


                .packageConfig(builder -> {
                    builder.parent("cn.kgc") // 设置父包名，启动类所在的位置
                            .moduleName("user") // 设置父包模块名，代码就生成在cn.kgc.user模块下
                            .pathInfo(Collections.
                                    singletonMap(OutputFile.xml, "F:\\本地onedrive\\桌面\\idea时期\\idea时期\\0831work\\src\\main\\resources\\mapper\\user")); // 设置mapperXml生成路径
                })


                .strategyConfig(builder -> {
                    builder.addInclude("order", "product", "user"); // 设置表名,会根据表名生成实体类
                    //.addTablePrefix("generator_"); // 设置过滤表前缀，实体类就不会加上这个前缀
                })
                .templateEngine(new FreemarkerTemplateEngine()) // 使用Freemarker引擎模板，默认的是Velocity引擎模板
                .execute();

    }
}
