package cn.kgc.user.service.impl;

import cn.kgc.user.entity.Product;
import cn.kgc.user.mapper.ProductMapper;
import cn.kgc.user.service.IProductService;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 * 服务实现类
 * </p>
 *
 * @author 小杨
 * @since 2023-08-31
 */
@Service
public class ProductServiceImpl extends ServiceImpl<ProductMapper, Product> implements IProductService {

    @Autowired
    ProductMapper productMapper;

    public Page<Product> getProductByPage(Integer page, Integer pageSize) {
        Page<Product> productPage = new Page<>(page, pageSize); // 设置页码和每页显示的数据条数

        QueryWrapper<Product> objectQueryWrapper = new QueryWrapper<>();
        productMapper.selectPage(productPage, objectQueryWrapper);

        return productPage;
    }

    public Product getProductById(Integer id) {

        Product product = productMapper.selectById(id);
        return product;

    }


}
