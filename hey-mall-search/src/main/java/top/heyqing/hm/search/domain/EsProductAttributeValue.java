package top.heyqing.hm.search.domain;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

import java.io.Serializable;

/**
 * ClassName:EsProductAttributeValue
 * Package:top.heyqing.hm.search.domain
 * Description:
 * 搜索商品的属性信息
 *
 * @Date:2024/12/22
 * @Author:Heyqing
 */
@Data
@EqualsAndHashCode
public class EsProductAttributeValue implements Serializable {
    private static final long serialVersionUID = -3729294939523280045L;
    private Long id;
    private Long productAttributeId;
    //属性值
    @Field(type = FieldType.Keyword)
    private String value;
    //属性参数：0->规格；1->参数
    private Integer type;
    //属性名称
    @Field(type = FieldType.Keyword)
    private String name;
}
