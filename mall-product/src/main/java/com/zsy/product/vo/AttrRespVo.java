package com.zsy.product.vo;

import lombok.Data;

@Data
public class AttrRespVo extends AttrVo {
    /**
     * 			"catelogName": "手机/数码/手机", //所属分类名字
     * 			"groupName": "主体", //所属分组名字
     */
    private String catelogName;
    private String groupName;

    private Long[] catelogPath;

    public void setCatelogPath(Long[] catelogPath) {
        this.catelogPath = catelogPath;
    }

    public void setCatelogName(String catelogName) {
        this.catelogName = catelogName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }
}
