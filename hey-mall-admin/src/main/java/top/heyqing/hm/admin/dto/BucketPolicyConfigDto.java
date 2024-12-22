package top.heyqing.hm.admin.dto;

import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

/**
 * ClassName:BucketPolicyConfigDto
 * Package:top.heyqing.hm.admin.dto
 * Description:
 * Minio Bucket访问策略配置
 *
 * @Date:2024/12/21
 * @Author:Heyqing
 */
@Data
@EqualsAndHashCode
@Builder
public class BucketPolicyConfigDto {

    private String Version;
    private List<Statement> Statement;

    @Data
    @EqualsAndHashCode
    @Builder
    public static class Statement {
        private String Effect;
        private String Principal;
        private String Action;
        private String Resource;

    }
}
