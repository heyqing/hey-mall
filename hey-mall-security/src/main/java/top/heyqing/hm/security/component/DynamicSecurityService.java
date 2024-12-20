package top.heyqing.hm.security.component;

import org.springframework.security.access.ConfigAttribute;

import java.util.Map;

/**
 * ClassName:DynamicSecurityService
 * Package:top.heyqing.hm.security.component
 * Description:
 * 动态权限相关业务接口
 *
 * @Date:2024/12/20
 * @Author:Heyqing
 */
public interface DynamicSecurityService {
    /**
     * 加载资源ANT通配符和资源对应MAP
     */
    Map<String, ConfigAttribute> loadDataSource();
}

