package codegym.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/calculator")
public class CalculatorController {

    @RequestMapping(value = "/usdtovnd", method = RequestMethod.GET)
    public ModelAndView calculator(@RequestParam(value = "usd") float usd) {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("calculator");
        float vnd = usd * 23000;
        modelAndView.addObject("vnd", vnd);
        return modelAndView;
    }
}
