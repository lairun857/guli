package com.zsy.product.vo;

import lombok.Data;

@Data
public class BrandVo {

    /**
     * "brandId": 0,
     * "brandName": "string",
     */
    private Long brandId;
    private String  brandName;

    public Long getBrandId() {
        return brandId;
    }

    public void setBrandId(Long brandId) {
        this.brandId = brandId;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }
}
