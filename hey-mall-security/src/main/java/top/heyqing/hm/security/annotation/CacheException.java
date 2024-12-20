package top.heyqing.hm.security.annotation;

import java.lang.annotation.*;

/**
 * ClassName:CacheException
 * Package:top.heyqing.hm.security.annotation
 * Description:
 * 自定义缓存异常注解，有该注解的缓存方法会抛出异常
 *
 * @Date:2024/12/20
 * @Author:Heyqing
 */
@Documented
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface CacheException {
}
