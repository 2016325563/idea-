package cn.kgc.user.config;

import com.baomidou.mybatisplus.annotation.DbType;
import com.baomidou.mybatisplus.extension.plugins.MybatisPlusInterceptor;
import com.baomidou.mybatisplus.extension.plugins.inner.PaginationInnerInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @param
 * @author qwerty
 * @date 2023/8/31
 */

//标识这个类是一个配置类

/*用来配置是否分页的*/
@Configuration
public class MybatisPlusConfig {

    //配置MybatisPlusInterceptor拦截器
    @Bean
    public MybatisPlusInterceptor mybatisPlusInterceptor() {

        MybatisPlusInterceptor mybatisPlusInterceptor = new MybatisPlusInterceptor();

        //添加具体的内部拦截器
        mybatisPlusInterceptor.addInnerInterceptor(new PaginationInnerInterceptor(DbType.MYSQL));

        return mybatisPlusInterceptor;
    }

    /*
    * 拦截器总结
    * 1建立一个拦截器的配置类
    * 2建立拦截器注解
    * 3建立拦截方法,返回拦截器对象
    * 使用拦截器建立一个拦截器对象
    *
    * */

}