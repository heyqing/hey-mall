package top.heyqing.hm.portal.domain;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

/**
 * ClassName:MemberBrandAttention
 * Package:top.heyqing.hm.portal.domain
 * Description:
 * 会员品牌关注
 *
 * @Date:2024/11/29
 * @Author:Heyqing
 */
@Getter
@Setter
@Document
public class MemberBrandAttention {
    @Id
    private String id;
    @Indexed
    private Long memberId;
    private String memberNickname;
    private String memberIcon;
    @Indexed
    private Long brandId;
    private String brandName;
    private String brandLogo;
    private String brandCity;
    private Date createTime;
}
