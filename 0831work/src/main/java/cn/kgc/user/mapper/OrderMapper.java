package cn.kgc.user.mapper;

import cn.kgc.user.entity.Order;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * <p>
 * Mapper 接口
 * </p>
 *
 * @author 小杨
 * @since 2023-08-31
 */
@Mapper
public interface OrderMapper extends BaseMapper<Order> {
    /**
     * 提交新订单
     *
     * @param order 订单信息
     */
    void insertOrder(Order order);


 /*   *//**
     * 更新商品销量和库存
     *
     * @param goodsId 商品ID
     * @param num     购买数量
     *//*
    void updateGoodsSalesAndStock(Long goodsId, Integer num);*/

    /**
     * 查询用户订单
     *
     * @param userId 用户ID
     * @return 订单列表
     */
    List<Order> getOrdersByUserId(Long userId);

    /**
     * 删除订单
     *
     * @param orderId 订单ID
     * @param status  删除状态
     */
    void updateOrderDeletedStatus(Long orderId, Integer status);
}
