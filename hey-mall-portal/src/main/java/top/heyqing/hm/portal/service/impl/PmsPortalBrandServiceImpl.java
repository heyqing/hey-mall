package top.heyqing.hm.portal.service.impl;

import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import top.heyqing.hm.common.responce.CommonPage;
import top.heyqing.hm.mbg.mapper.PmsBrandMapper;
import top.heyqing.hm.mbg.mapper.PmsProductMapper;
import top.heyqing.hm.mbg.model.PmsBrand;
import top.heyqing.hm.mbg.model.PmsProduct;
import top.heyqing.hm.mbg.model.PmsProductExample;
import top.heyqing.hm.portal.dao.HomeDao;
import top.heyqing.hm.portal.service.PmsPortalBrandService;

import java.util.List;

/**
 * ClassName:PmsPortalBrandServiceImpl
 * Package:top.heyqing.hm.portal.service.impl
 * Description:
 *
 * @Date:2024/11/30
 * @Author:Heyqing
 */
@Service
public class PmsPortalBrandServiceImpl implements PmsPortalBrandService {
    @Autowired
    private HomeDao homeDao;
    @Autowired
    private PmsBrandMapper brandMapper;
    @Autowired
    private PmsProductMapper productMapper;

    @Override
    public List<PmsBrand> recommendList(Integer pageNum, Integer pageSize) {
        int offset = (pageNum - 1) * pageSize;
        return homeDao.getRecommendBrandList(offset, pageSize);
    }

    @Override
    public PmsBrand detail(Long brandId) {
        return brandMapper.selectByPrimaryKey(brandId);
    }

    @Override
    public CommonPage<PmsProduct> productList(Long brandId, Integer pageNum, Integer pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        PmsProductExample example = new PmsProductExample();
        example.createCriteria().andDeleteStatusEqualTo(0)
                .andPublishStatusEqualTo(1)
                .andBrandIdEqualTo(brandId);
        List<PmsProduct> productList = productMapper.selectByExample(example);
        return CommonPage.restPage(productList);
    }
}

