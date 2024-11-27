package top.heyqing.hm.common.responce;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.HashMap;
import java.util.Map;

/**
 * ClassName:R
 * Package:top.heyqing.hm.common.responce
 * Description:
 * 用户返回实体
 *
 * @Date:2024/11/27
 * @Author:Heyqing
 */
@Data
@ApiModel(value = "用户返回实体")
public class R {
    @ApiModelProperty(value = "是否成功")
    private Boolean success;

    @ApiModelProperty(value = "返回码")
    private Integer code;

    @ApiModelProperty(value = "返回消息")
    private String message;

    @ApiModelProperty(value = "返回数据")
    private Map<String, Object> data = new HashMap<String, Object>();

    //把构造方法私有
    private R() {
    }

    //成功静态方法
    public static R ok() {
        R r = new R();
        r.setSuccess(true);
        r.setCode(RCode.SUCCESS.getCode());
        r.setMessage(RCode.SUCCESS.getMessage());
        return r;
    }

    //失败静态方法
    public static R error() {
        R r = new R();
        r.setSuccess(false);
        r.setCode(RCode.FAILED.getCode());
        r.setMessage(RCode.FAILED.getMessage());
        return r;
    }

    public R success(Boolean success) {
        this.setSuccess(success);
        return this;
    }

    public R message(String message) {
        this.setMessage(message);
        return this;
    }

    public R code(Integer code) {
        this.setCode(code);
        return this;
    }

    public R data(Object value) {
        String key = "records";
        this.data.put(key, value);
        return this;
    }

    public R data(String key, Object value) {
        this.data.put(key, value);
        return this;
    }

    public R data(Map<String, Object> map) {
        this.setData(map);
        return this;
    }
}
