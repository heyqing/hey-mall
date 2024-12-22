package top.heyqing.hm.admin.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * ClassName:OssCallbackResult
 * Package:top.heyqing.hm.admin.dto
 * Description:
 * OSS上传文件的回调结果
 *
 * @Date:2024/12/21
 * @Author:Heyqing
 */
@Data
@EqualsAndHashCode
public class OssCallbackResult {
    @ApiModelProperty("文件名称")
    private String filename;
    @ApiModelProperty("文件大小")
    private String size;
    @ApiModelProperty("文件的mimeType")
    private String mimeType;
    @ApiModelProperty("图片文件的宽")
    private String width;
    @ApiModelProperty("图片文件的高")
    private String height;
}
