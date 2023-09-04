package cn.kgc.user.mapper;

import cn.kgc.user.entity.Product;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
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

public interface ProductMapper extends BaseMapper<Product> {
    /**
     * 分页查询商品列表
     *
     * @param page 分页参数
     * @return 商品列表
     */
    List<Product> getGoodsList(Page page);

    /**
     * 根据ID查询商品详情
     *
     * @param id 商品ID
     * @return 商品详情
     */
    Product getGoodsById(Long id);

}
