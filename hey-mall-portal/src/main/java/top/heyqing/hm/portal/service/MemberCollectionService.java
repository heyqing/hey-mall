package top.heyqing.hm.portal.service;

import org.springframework.data.domain.Page;
import top.heyqing.hm.portal.domain.MemberProductCollection;

/**
 * ClassName:MemberCollectionService
 * Package:top.heyqing.hm.portal.service
 * Description:
 * 会员商品收藏管理Service
 *
 * @Date:2024/11/30
 * @Author:Heyqing
 */
public interface MemberCollectionService {
    /**
     * 添加收藏
     */
    int add(MemberProductCollection productCollection);

    /**
     * 删除收藏
     */
    int delete(Long productId);

    /**
     * 分页查询收藏
     */
    Page<MemberProductCollection> list(Integer pageNum, Integer pageSize);

    /**
     * 查看收藏详情
     */
    MemberProductCollection detail(Long productId);

    /**
     * 清空收藏
     */
    void clear();
}
