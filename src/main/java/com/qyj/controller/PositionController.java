package com.qyj.controller;

import com.qyj.domain.Position;
import com.qyj.service.PositionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/positions")
public class PositionController {

    @Autowired
    private PositionService positionService;

    @GetMapping
    public Result getClassification() {
        List<Position> positionList = positionService.getClassification();
        Integer code = positionList != null ? Code.GET_OK : Code.GET_ERR;
        String msg = positionList != null ? "" : "数据查询失败";
        return new Result(code,positionList,msg);
    }


    @GetMapping("/{id}")
    public Result getName(@PathVariable Integer id) {
        List<Position> positionList = positionService.getName(id);
        Integer code = positionList != null ? Code.GET_OK : Code.GET_ERR;
        String msg = positionList != null ? "" : "数据查询失败";
        return new Result(code,positionList,msg);
    }

}
