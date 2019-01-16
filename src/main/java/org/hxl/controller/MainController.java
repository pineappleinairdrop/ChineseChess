package org.hxl.controller;

import org.hxl.dto.MoveAction;
import org.hxl.service.CalculateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

@Controller

public class MainController {

    @Autowired
    CalculateService calculateService;

    @PostMapping(value = "/index")
    public MoveAction enter(String move) {
        MoveAction moveAction = MoveAction.parse(move);
        return calculateService.calculate(moveAction);
    }
}