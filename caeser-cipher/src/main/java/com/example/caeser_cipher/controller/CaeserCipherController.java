package com.example.caeser_cipher.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.caeser_cipher.service.CaeserCipherService;

@Controller
public class CaeserCipherController {

    @Autowired
    private CaeserCipherService cipherService;

    @GetMapping("/")
    public String showForm() {
        return "index";
    }

    @PostMapping("/process")
    public String processCipher(
            @RequestParam String input,
            @RequestParam int shift,
            @RequestParam String action,
            Model model) {

        String result;
        if ("encrypt".equals(action)) {
            result = cipherService.encrypt(input, shift);
        } else {
            result = cipherService.decrypt(input, shift);
        }

        model.addAttribute("result", result);
        return "index";
    }
}
