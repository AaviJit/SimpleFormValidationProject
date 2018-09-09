package org.avijit.Controller;

import org.avijit.Domain.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class StudentController {

    @RequestMapping("/student")
    public String register(Model model) {
        model.addAttribute(new Student());
        return "StudentRegistrationPage";
    }


    @RequestMapping(value = "/doStudentRegistration", method = RequestMethod.POST)
    public String saveEmployeeAction(@ModelAttribute("student") @Validated Student student,
                                     BindingResult bindingResult, Model model) {
        if (bindingResult.hasErrors()) {
            return "StudentRegistrationPage";
        }

//        model.addAttribute("emp", employee);
//        emps.put(employee.getId(), employee);
        return "HomePage";
    }
}
