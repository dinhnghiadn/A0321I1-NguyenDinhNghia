package codegym.controller;

import codegym.model.MailSetting;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Arrays;
import java.util.List;

@Controller
@RequestMapping ("mail")
public class MailSettingController {
    @RequestMapping(value = "setting", method = RequestMethod.GET)
    public String Setting(ModelMap model) {

        List<String> listOfLanguages = Arrays.asList(new String[]{"English", "Vietnamese", "Japanese", "Chinese"});
        List<Integer> listOfSizes = Arrays.asList(new Integer[]{5,10,15,25,50,100});
        model.addAttribute("listOfLanguages", listOfLanguages);
        model.addAttribute("listOfSizes", listOfSizes);
        model.addAttribute("mailSetting", new MailSetting());
        return "setting";
    }
    @RequestMapping(value = "/info", method = RequestMethod.POST)
    public String submit(@ModelAttribute("mailSetting") MailSetting mailSetting, BindingResult result, ModelMap model) {
        model.addAttribute("language", mailSetting.getLanguage());
        model.addAttribute("pageSize", mailSetting.getPageSize());
        model.addAttribute("spamFilter", mailSetting.isSpamFilter());
        model.addAttribute("signature", mailSetting.getSignature());
        return "info";
    }
}
