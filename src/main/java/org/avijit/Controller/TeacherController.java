package org.avijit.Controller;

import org.avijit.Domain.Teacher;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.Validator;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class TeacherController {


    private static final Logger logger = LoggerFactory
            .getLogger(TeacherController.class);


    @Autowired
    @Qualifier("teacherFormValidator")
    private Validator validator;

    @InitBinder
    private void initBinder(WebDataBinder binder) {
        binder.setValidator(validator);
    }

    @RequestMapping("/")
    public String register(Model model) {
        model.addAttribute(new Teacher());
        return "RegistrationPage";
    }

    @RequestMapping(value = "/doRegistration", method = RequestMethod.POST)
    public String saveEmployeeAction(@ModelAttribute("teacher") @Validated Teacher teacher,
                                     BindingResult bindingResult, Model model) {
        if (bindingResult.hasErrors()) {
            logger.info("Returning empSave.jsp page");
            return "RegistrationPage";
        }
        logger.info("Returning empSaveSuccess.jsp page");
//        model.addAttribute("emp", employee);
//        emps.put(employee.getId(), employee);
        return "HomePage";
    }

}
