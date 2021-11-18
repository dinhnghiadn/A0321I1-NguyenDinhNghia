package codegym.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class DictionaryController {

    @GetMapping("")
    String getIndex() {
        return "index";
    }


    @RequestMapping(value = "/translate", method = RequestMethod.POST)
    public ModelAndView calculator(@RequestParam("word") String word) {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("translate");
        String vn = "";
        switch (word){
            case "table":
                vn = "Cái bàn";
                break;
            case "chair":
                vn = "Cái ghế";
                break;
            case "pen":
                vn = "Cái bút";
                break;
        }
        modelAndView.addObject("word", word);
        modelAndView.addObject("vn", vn);
        return modelAndView;
    }
}
