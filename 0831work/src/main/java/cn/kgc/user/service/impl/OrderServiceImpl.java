package cn.kgc.user.service.impl;

import cn.kgc.user.entity.Order;
import cn.kgc.user.mapper.OrderMapper;
import cn.kgc.user.service.IOrderService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 服务实现类
 * </p>
 *
 * @author 小杨
 * @since 2023-08-31
 */
@Service
public class OrderServiceImpl extends ServiceImpl<OrderMapper, Order> implements IOrderService {
    @Autowired
    OrderMapper orderMapper;

    public Integer delById(Integer id) {
        orderMapper.deleteById(id);

        return id;
    }


}
