package cn.kgc.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Goods {
    private Integer goodsId;
    private String goodsName;
    private Integer goodsPrice;
    private String goodsImg;
    private String goodsDesc;

}
