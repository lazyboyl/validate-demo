package com.validate.demo.validate;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author linzf
 * @since 2019-05-29
 * 类描述：验证日期是否合法
 */
@Target({ElementType.FIELD, ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = DateTimeValidator.class)
public @interface DateTime {

    String message() default "格式错误";

    String format() default "yyyyMM";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}

