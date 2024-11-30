package top.heyqing.hm.portal.service.impl;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import top.heyqing.hm.mbg.mapper.OmsOrderReturnApplyMapper;
import top.heyqing.hm.mbg.model.OmsOrderReturnApply;
import top.heyqing.hm.portal.domain.OmsOrderReturnApplyParam;
import top.heyqing.hm.portal.service.OmsPortalOrderReturnApplyService;

import java.util.Date;

/**
 * ClassName:OmsPortalOrderReturnApplyServiceImpl
 * Package:top.heyqing.hm.portal.service.impl
 * Description:
 *
 * @Date:2024/11/30
 * @Author:Heyqing
 */
@Service
public class OmsPortalOrderReturnApplyServiceImpl implements OmsPortalOrderReturnApplyService {
    @Autowired
    private OmsOrderReturnApplyMapper returnApplyMapper;

    @Override
    public int create(OmsOrderReturnApplyParam returnApply) {
        OmsOrderReturnApply realApply = new OmsOrderReturnApply();
        BeanUtils.copyProperties(returnApply, realApply);
        realApply.setCreateTime(new Date());
        realApply.setStatus(0);
        return returnApplyMapper.insert(realApply);
    }
}
