package codegym.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@Controller
public class CalculatorController {
    @GetMapping("")
    public String getIndex(){
        return "index";
    }

    @PostMapping("/calculator")
    public String save(@RequestParam("number1") double number1,@RequestParam("number2") double number2,@RequestParam("ope") String ope, Model model) {
        double result = 0;
        switch (ope){
            case "Addition(+)":
                result = number1 + number2;
                break;
            case "Subtraction(-)":
                result = number1 - number2;
                break;
            case "Multiplication(X)":
                result = number1*number2;
                break;
            case "Division(/)":
                result = number1/number2;
                break;

        }
        model.addAttribute("number1", number1);
        model.addAttribute("number2", number2);
        model.addAttribute("result", result);
        return "index";

    }
}
