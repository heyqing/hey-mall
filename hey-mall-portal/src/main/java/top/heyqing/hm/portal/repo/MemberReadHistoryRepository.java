package top.heyqing.hm.portal.repo;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.repository.MongoRepository;
import top.heyqing.hm.portal.domain.MemberReadHistory;

/**
 * ClassName:MemberReadHistoryRepository
 * Package:top.heyqing.hm.portal.repo
 * Description:
 * 会员商品浏览历史Repository
 *
 * @Date:2024/11/30
 * @Author:Heyqing
 */
public interface MemberReadHistoryRepository extends MongoRepository<MemberReadHistory, String> {
    /**
     * 根据会员ID分页查找记录
     */
    Page<MemberReadHistory> findByMemberIdOrderByCreateTimeDesc(Long memberId, Pageable pageable);

    /**
     * 根据会员ID删除记录
     */
    void deleteAllByMemberId(Long memberId);
}