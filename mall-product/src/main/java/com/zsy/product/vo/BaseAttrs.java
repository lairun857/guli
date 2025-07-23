/**
 * Copyright 2019 bejson.com
 */
package com.zsy.product.vo;

import lombok.Data;

/**
 * Auto-generated: 2019-11-26 10:50:34
 *
 * @author bejson.com (i@bejson.com)
 * @website http://www.bejson.com/java2pojo/
 */
@Data
public class BaseAttrs {

    private Long attrId;
    private String attrValues;
    private int showDesc;

    // 手动添加getter/setter方法以解决编译问题
    public Long getAttrId() {
        return attrId;
    }

    public void setAttrId(Long attrId) {
        this.attrId = attrId;
    }

    public String getAttrValues() {
        return attrValues;
    }

    public void setAttrValues(String attrValues) {
        this.attrValues = attrValues;
    }

    public int getShowDesc() {
        return showDesc;
    }

    public void setShowDesc(int showDesc) {
        this.showDesc = showDesc;
    }
}
