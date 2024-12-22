package top.heyqing.hm.search.domain;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

/**
 * ClassName:EsProductRelatedInfo
 * Package:top.heyqing.hm.search.domain
 * Description:
 * 搜索商品的关联信息，包括品牌名称，分类名称及属性
 *
 * @Date:2024/12/22
 * @Author:Heyqing
 */
@Data
@EqualsAndHashCode
public class EsProductRelatedInfo {
    private List<String> brandNames;
    private List<String> productCategoryNames;
    private List<ProductAttr> productAttrs;

    @Data
    @EqualsAndHashCode
    public static class ProductAttr {
        private Long attrId;
        private String attrName;
        private List<String> attrValues;
    }
}
