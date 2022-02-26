package com.example.springblog.controller;

import com.example.springblog.config.auth.PrincipalDetail;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BoardController {

    @GetMapping({"", "/"})
    public String index(@AuthenticationPrincipal PrincipalDetail principalDetail) {
        System.out.println(principalDetail.getUsername());
        return "index";
    }
}
