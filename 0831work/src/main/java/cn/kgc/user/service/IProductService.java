package cn.kgc.user.service;

import cn.kgc.user.entity.Product;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 * 服务类
 * </p>
 *
 * @author 小杨
 * @since 2023-08-31
 */
public interface IProductService extends IService<Product> {
    Page<Product> getProductByPage(Integer page, Integer pageSize);

    public Product getProductById(Integer id);


}
