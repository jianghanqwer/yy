package com.qyj.controller;

import com.qyj.domain.Position;
import com.qyj.service.PositionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/positions")
public class PositionController {

    @Autowired
    private PositionService positionService;

    @GetMapping
    public Position getClassification() {
        return positionService.getClassification();
    }


    @GetMapping("/{id}")
    public Position getName(@PathVariable Integer id) {
        return positionService.getName(id);
    }

}
