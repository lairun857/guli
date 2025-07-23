package com.zsy.common.to.es;

import lombok.Data;

import java.math.BigDecimal;
import java.util.List;

/**
 * 传输对象，存储到es的数据
 *
 * @author: zhangshuaiyin
 * @date: 2021/3/12 15:37
 */
@Data
public class SkuEsModel {

    private Long skuId;

    private Long spuId;

    private String skuTitle;

    private BigDecimal skuPrice;

    private String skuImg;

    private Long saleCount;

    /**
     * 是否有库存
     */
    private Boolean hasStock;

    /**
     * 热度
     */
    private Long hotScore;

    private Long brandId;

    private Long catalogId;

    private String brandName;

    private String brandImg;

    private String catalogName;

    private List<Attrs> attrs;

    // 手动添加setter方法以解决编译问题
    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public void setBrandId(Long brandId) {
        this.brandId = brandId;
    }

    public void setBrandImg(String brandImg) {
        this.brandImg = brandImg;
    }

    public void setCatalogId(Long catalogId) {
        this.catalogId = catalogId;
    }

    public void setCatalogName(String catalogName) {
        this.catalogName = catalogName;
    }

    public void setAttrs(List<Attrs> attrs) {
        this.attrs = attrs;
    }

    public void setSkuPrice(BigDecimal skuPrice) {
        this.skuPrice = skuPrice;
    }

    public void setSkuImg(String skuImg) {
        this.skuImg = skuImg;
    }

    public void setHasStock(Boolean hasStock) {
        this.hasStock = hasStock;
    }

    public void setHasStock(boolean hasStock) {
        this.hasStock = hasStock;
    }

    public void setHotScore(Long hotScore) {
        this.hotScore = hotScore;
    }

    public void setHotScore(long hotScore) {
        this.hotScore = hotScore;
    }

    @Data
    public static class Attrs {

        private Long attrId;

        private String attrName;

        private String attrValue;
    }
}
