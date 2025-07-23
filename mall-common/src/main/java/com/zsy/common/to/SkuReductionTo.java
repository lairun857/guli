package com.zsy.common.to;

import lombok.Data;

import java.math.BigDecimal;
import java.util.List;

@Data
public class SkuReductionTo {

    private Long skuId;
    private int fullCount;
    private BigDecimal discount;
    private int countStatus;
    private BigDecimal fullPrice;
    private BigDecimal reducePrice;
    private int priceStatus;
    private List<MemberPrice> memberPrice;

    // 手动添加getter方法以解决编译问题
    public Long getSkuId() {
        return skuId;
    }

    public List<MemberPrice> getMemberPrice() {
        return memberPrice;
    }

    public int getFullCount() {
        return fullCount;
    }

    public BigDecimal getDiscount() {
        return discount;
    }

    public int getCountStatus() {
        return countStatus;
    }

    public void setSkuId(Long skuId) {
        this.skuId = skuId;
    }

    public BigDecimal getFullPrice() {
        return fullPrice;
    }
}
