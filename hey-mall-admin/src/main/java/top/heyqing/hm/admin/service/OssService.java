package top.heyqing.hm.admin.service;

import top.heyqing.hm.admin.dto.OssCallbackResult;
import top.heyqing.hm.admin.dto.OssPolicyResult;

import javax.servlet.http.HttpServletRequest;

/**
 * ClassName:OssService
 * Package:top.heyqing.hm.admin.service
 * Description:
 * Oss对象存储管理Service
 *
 * @Date:2024/12/21
 * @Author:Heyqing
 */
public interface OssService {
    /**
     * Oss上传策略生成
     */
    OssPolicyResult policy();

    /**
     * Oss上传成功回调
     */
    OssCallbackResult callback(HttpServletRequest request);
}