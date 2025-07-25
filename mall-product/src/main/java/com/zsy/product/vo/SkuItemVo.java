package com.zsy.product.vo;

import com.zsy.product.entity.SkuImagesEntity;
import com.zsy.product.entity.SkuInfoEntity;
import com.zsy.product.entity.SpuInfoDescEntity;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
 * @author ZSY
 * @createTime: 2020-06-19 11:21
 **/
@ToString
@Data
public class SkuItemVo {

    //1、sku基本信息的获取  pms_sku_info
    private SkuInfoEntity info;

    private boolean hasStock = true;

    //2、sku的图片信息    pms_sku_images
    private List<SkuImagesEntity> images;

    //3、获取spu的销售属性组合
    private List<SkuItemSaleAttrVo> saleAttr;

    //4、获取spu的介绍
    private SpuInfoDescEntity desc;

    //5、获取spu的规格参数信息
    private List<SpuItemAttrGroupVo> groupAttrs;

    //6、秒杀商品的优惠信息
    private SeckillSkuVo seckillSkuVo;

    public void setImages(List<SkuImagesEntity> images) {
        this.images = images;
    }

    public void setInfo(SkuInfoEntity info) {
        this.info = info;
    }

    public void setSaleAttr(List<SkuItemSaleAttrVo> saleAttr) {
        this.saleAttr = saleAttr;
    }

    public void setDesc(SpuInfoDescEntity desc) {
        this.desc = desc;
    }

    public void setGroupAttrs(List<SpuItemAttrGroupVo> groupAttrs) {
        this.groupAttrs = groupAttrs;
    }

}
