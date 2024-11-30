package top.heyqing.hm.portal.service;

import top.heyqing.hm.mbg.model.UmsMember;

/**
 * ClassName:UmsMemberCacheService
 * Package:top.heyqing.hm.portal.service
 * Description:
 * 会员信息缓存业务类
 *
 * @Date:2024/11/30
 * @Author:Heyqing
 */
public interface UmsMemberCacheService {
    /**
     * 删除会员用户缓存
     */
    void delMember(Long memberId);

    /**
     * 获取会员用户缓存
     */
    UmsMember getMember(String username);

    /**
     * 设置会员用户缓存
     */
    void setMember(UmsMember member);

    /**
     * 设置验证码
     */
    void setAuthCode(String telephone, String authCode);

    /**
     * 获取验证码
     */
    String getAuthCode(String telephone);
}

