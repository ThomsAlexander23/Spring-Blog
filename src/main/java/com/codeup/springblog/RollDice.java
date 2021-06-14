package com.codeup.springblog;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class RollDice {

    @GetMapping("/roll-dice")
    public String guess() {
        return "roll-dice";
    }

    @PostMapping("roll-dice/{num}")
    public String guessed(@RequestParam(name = "num") int num, Model model) {
        int random = (int) (Math.random() * 6) + 1;
        model.addAttribute("num", num);
        model.addAttribute("random", random);
        return "dice-result";
    }
}