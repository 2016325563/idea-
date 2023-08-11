package cn.kgc.service.impl;

import cn.kgc.entity.Customer;
import cn.kgc.mapper.CustomerMapper;
import cn.kgc.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class CustomerServiceImpl implements CustomerService {
    @Autowired
    CustomerMapper customerMapper;

    @Override
    public Integer addCustom(Customer customer) {
        return customerMapper.addCustom(customer);
    }

    @Override
    public Customer doLogin(Customer customer) {
        return customerMapper.doLogin(customer);
    }
}
