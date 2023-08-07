package cn.kgc.mapper;

import cn.kgc.entity.Product;
import cn.kgc.entity.Supplier;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductMapper {
    /*获得所有的信息*/
    List<Product> getAllInfo();

    /*加入产品*/
    Integer addProduct(List<Product> products);

    /*删除产品*/
    Integer DelProById(Integer productId);


}
