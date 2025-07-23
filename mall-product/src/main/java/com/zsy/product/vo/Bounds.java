/**
  * Copyright 2019 bejson.com 
  */
package com.zsy.product.vo;

import lombok.Data;

import java.math.BigDecimal;

/**
 * Auto-generated: 2019-11-26 10:50:34
 *
 * @author bejson.com (i@bejson.com)
 * @website http://www.bejson.com/java2pojo/
 */
@Data
public class Bounds {

    private BigDecimal buyBounds;
    private BigDecimal growBounds;

    // 手动添加getter/setter方法以解决编译问题
    public BigDecimal getBuyBounds() {
        return buyBounds;
    }

    public void setBuyBounds(BigDecimal buyBounds) {
        this.buyBounds = buyBounds;
    }

    public BigDecimal getGrowBounds() {
        return growBounds;
    }

    public void setGrowBounds(BigDecimal growBounds) {
        this.growBounds = growBounds;
    }
}
