package top.heyqing.hm.portal.domain;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

/**
 * ClassName:MemberReadHistory
 * Package:top.heyqing.hm.portal.domain
 * Description:
 * 会员商品浏览历史记录
 *
 * @Date:2024/11/29
 * @Author:Heyqing
 */
@Getter
@Setter
@Document
public class MemberReadHistory {
    @Id
    private String id;
    @Indexed
    private Long memberId;
    private String memberNickname;
    private String memberIcon;
    @Indexed
    private Long productId;
    private String productName;
    private String productPic;
    private String productSubTitle;
    private String productPrice;
    private Date createTime;
}
