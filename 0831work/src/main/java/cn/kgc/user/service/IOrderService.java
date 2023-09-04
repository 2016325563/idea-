package cn.kgc.user.service;

import cn.kgc.user.entity.Order;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 * 服务类
 * </p>
 *
 * @author 小杨
 * @since 2023-08-31
 */
public interface IOrderService extends IService<Order> {
    public Integer delById(Integer id);

}
