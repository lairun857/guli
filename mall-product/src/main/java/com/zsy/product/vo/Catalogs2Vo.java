package com.zsy.product.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * 二级分类id,首页分类数据
 *
 * @author: zhangshuaiyin
 * @date: 2021/4/5 19:17
 **/

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Catalogs2Vo {

    /**
     * 一级父分类的id
     */
    private String catalog1Id;

    /**
     * 三级子分类
     */
    private List<Category3Vo> catalog3List;

    private String id;

    private String name;

    /**
     * 三级分类vo
     */
    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    public static class Category3Vo {

        /**
         * 父分类、二级分类id
         */
        private String catalog2Id;

        private String id;

        private String name;

        public void setCatalog2Id(String catalog2Id) {
            this.catalog2Id = catalog2Id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public void setName(String name) {
            this.name = name;
        }
    }

    public void setCatalog3List(List<Category3Vo> catalog3List) {
        this.catalog3List = catalog3List;
    }

    public void setCatalog1Id(String catalog1Id) {
        this.catalog1Id = catalog1Id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

}
