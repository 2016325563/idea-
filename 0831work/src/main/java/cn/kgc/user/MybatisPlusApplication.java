package cn.kgc.user;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @param
 * @author qwerty
 * @date 2023/8/30
 */

@SpringBootApplication
public class MybatisPlusApplication {

    public static void main(String[] args) {

        SpringApplication.run(MybatisPlusApplication.class, args);

    }
}
/*
 * 总结:
 * 建立java类
 * 使用注解springbootApplication完成实例化web容器建设
 * 使用springApplication完成字节码文件的运行,作为入口执行
 *
 *
 * */