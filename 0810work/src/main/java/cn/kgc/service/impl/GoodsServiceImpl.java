package cn.kgc.service.impl;

import cn.kgc.entity.Goods;
import cn.kgc.mapper.GoodsMapper;
import cn.kgc.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GoodsServiceImpl implements GoodsService {

    @Autowired
    GoodsMapper goodsMapper;

    @Override
    public List<Goods> getAllGoods(String goodsName, Integer page) {
        return goodsMapper.getAllGoods(goodsName, page);
    }

    @Override
    public Integer delGoodsById(Integer goodsId) {
        return goodsMapper.delGoodsById(goodsId);
    }

    @Override
    public Integer modGoodsById(Integer goodsId) {
        return goodsMapper.modGoodsById(goodsId);
    }

    @Override
    public Integer getRowCount(String goodsName) {
        return goodsMapper.getRowCount(goodsName);
    }
}
