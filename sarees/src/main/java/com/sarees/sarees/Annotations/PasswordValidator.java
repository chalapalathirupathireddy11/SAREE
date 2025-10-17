package com.sarees.sarees.Annotations;

import com.sarees.sarees.Validation.PasswordStrengthValidator;
import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.*;

@Documented
@Constraint(validatedBy = PasswordStrengthValidator.class)
@Target({ ElementType.METHOD,ElementType.FIELD })
@Retention(RetentionPolicy.RUNTIME)
public @interface PasswordValidator {

    String message() default "please choose a strong Password";
    Class<?>[] groups() default {};
    Class<? extends Payload>[]payload() default {};
}
