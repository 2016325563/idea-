package cn.kgc.mapper;

import cn.kgc.entity.Goods;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface GoodsMapper {

    /*
        查询所有的商品,注意使用动态sql模糊查询,并使用分页
    */
    List<Goods> getAllGoods(@Param("goodsName") String goodsName, @Param("page") Integer page);

    /*
        点击链接删除商品,根据id删除,使用delete
    */
    Integer delGoodsById(@Param("goodsId") Integer goodsId);

    /*
        根据id修改商品信息,使用update
    */
    Integer modGoodsById(@Param("goodsId") Integer goodsId);

    /*获取总数*/
    Integer getRowCount(@Param("goodsName") String goodsName);
}
