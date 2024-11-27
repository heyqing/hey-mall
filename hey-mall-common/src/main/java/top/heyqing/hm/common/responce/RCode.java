package top.heyqing.hm.common.responce;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * ClassName:RCode
 * Package:top.heyqing.hm.common.responce
 * Description:
 * 用户返回参数
 *
 * @Date:2024/11/27
 * @Author:Heyqing
 */
@Getter
@AllArgsConstructor
public enum RCode {

    SUCCESS(200, "操作成功"),
    FAILED(500, "操作失败"),
    VALIDATE_FAILED(404, "参数检验失败"),
    UNAUTHORIZED(401, "暂未登录或token已经过期"),
    FORBIDDEN(403, "没有相关权限");
    private Integer code;
    private String message;

}
