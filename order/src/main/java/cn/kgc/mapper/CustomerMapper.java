package cn.kgc.mapper;

import cn.kgc.entity.Customer;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerMapper {
    /*
        注册方法,返回一个插入数据
    */
    Integer addCustom(Customer customer);

    /*
        登录验证的方法,返回一个用户
    */
    Customer doLogin(Customer customer);


}
