/**
  * Copyright 2019 bejson.com
  */
package com.zsy.common.to;

import lombok.Data;

import java.math.BigDecimal;

/**
 * Auto-generated: 2019-11-26 10:50:34
 *
 * @author bejson.com (i@bejson.com)
 * @website http://www.bejson.com/java2pojo/
 */
@Data
public class MemberPrice {

    private Long id;
    private String name;
    private BigDecimal price;

    // 手动添加getter方法以解决编译问题
    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public BigDecimal getPrice() {
        return price;
    }

}
