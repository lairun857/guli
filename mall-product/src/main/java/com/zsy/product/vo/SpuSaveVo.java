/**
 * Copyright 2019 bejson.com
 */
package com.zsy.product.vo;

import lombok.Data;

import java.math.BigDecimal;
import java.util.List;

/**
 * Auto-generated: 2019-11-26 10:50:34
 *
 * @author bejson.com (i@bejson.com)
 * @website http://www.bejson.com/java2pojo/
 */
@Data
public class SpuSaveVo {

    private String spuName;
    private String spuDescription;
    private Long catalogId;
    private Long brandId;
    private BigDecimal weight;
    private int publishStatus;
    private List<String> decript;
    private List<String> images;
    private Bounds bounds;
    private List<BaseAttrs> baseAttrs;
    private List<Skus> skus;

    public List<String> getImages() {
        return images;
    }

    public List<BaseAttrs> getBaseAttrs() {
        return baseAttrs;
    }

    public Bounds getBounds() {
        return bounds;
    }

    public List<Skus> getSkus() {
        return skus;
    }

    public List<String> getDecript() {
        return decript;
    }

}
