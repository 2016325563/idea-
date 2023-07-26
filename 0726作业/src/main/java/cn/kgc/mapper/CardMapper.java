package cn.kgc.mapper;

import cn.kgc.entity.Card;
import cn.kgc.entity.Project;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CardMapper {
    public Integer addCard(Card card);

}
