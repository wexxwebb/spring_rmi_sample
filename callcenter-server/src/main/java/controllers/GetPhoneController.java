package controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import service.PhoneService;

@Controller
public class GetPhoneController {

    @Autowired
    PhoneService phoneService;

    @RequestMapping(value = "/phone", method = RequestMethod.GET)
    public String showHerPhone(Model model){
        model.addAttribute("phone",
                            phoneService.getPhone());
        model.addAttribute("desc", phoneService.getDescription());
        return "phone";
    }
}
