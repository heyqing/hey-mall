package top.heyqing.hm.admin.vaildator;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

/**
 * ClassName:FlagValidator
 * Package:top.heyqing.hm.admin.vaildator
 * Description:
 * 用于验证状态是否在指定范围内的注解
 *
 * @Date:2024/12/20
 * @Author:Heyqing
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.FIELD, ElementType.PARAMETER})
@Constraint(validatedBy = FlagValidatorClass.class)
public @interface FlagValidator {
    String[] value() default {};

    String message() default "flag is not found";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
