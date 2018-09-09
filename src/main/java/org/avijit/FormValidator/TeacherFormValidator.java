package org.avijit.FormValidator;

import org.avijit.Domain.Teacher;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

public class TeacherFormValidator implements Validator {
    @Override
    public boolean supports(Class<?> paramClass) {
        return Teacher.class.equals(paramClass);
    }

    @Override
    public void validate(Object obj, Errors errors) {
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "name", "name.required");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "userName", "userName.required");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "position", "position.required");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "mobile", "mobile.required");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "dob", "dob.required");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "address", "address.required");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "password", "password.required");
    }
}
