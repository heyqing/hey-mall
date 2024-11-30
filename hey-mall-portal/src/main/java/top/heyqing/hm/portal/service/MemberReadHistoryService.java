package top.heyqing.hm.portal.service;

import org.springframework.data.domain.Page;
import top.heyqing.hm.portal.domain.MemberReadHistory;

import java.util.List;

/**
 * ClassName:MemberReadHistoryService
 * Package:top.heyqing.hm.portal.service
 * Description:
 * 会员浏览记录管理Service
 *
 * @Date:2024/11/30
 * @Author:Heyqing
 */
public interface MemberReadHistoryService {
    /**
     * 生成浏览记录
     */
    int create(MemberReadHistory memberReadHistory);

    /**
     * 批量删除浏览记录
     */
    int delete(List<String> ids);

    /**
     * 分页获取用户浏览历史记录
     */
    Page<MemberReadHistory> list(Integer pageNum, Integer pageSize);

    /**
     * 清空浏览记录
     */
    void clear();
}
