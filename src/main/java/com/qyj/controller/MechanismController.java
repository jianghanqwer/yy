package com.qyj.controller;

import com.qyj.domain.Book;
import com.qyj.domain.Mechanism;
import com.qyj.service.MechanismService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/mechanisms")
public class MechanismController {

    @Autowired
    private MechanismService mechanismService;

    @GetMapping
    public Result getAll() {
        List<Mechanism> mechanismList = mechanismService.getAll();
        Integer code = mechanismList != null ? Code.GET_OK : Code.GET_ERR;
        String msg = mechanismList != null ? "" : "数据查询失败";
        return new Result(code,mechanismList,msg);
    }

    @GetMapping("/{levelFirst}")
    public Result getLevelSecond(@PathVariable String levelFirst) {
        List<Mechanism > mechanismList = mechanismService.getLevelSecond(levelFirst);
        Integer code = mechanismList != null ? Code.GET_OK : Code.GET_ERR;
        String msg = mechanismList != null ? "" : "数据查询失败";
        return new Result(code,mechanismList,msg);
    }

    @GetMapping("/{levelFirst}/{levelSecond}")
    public Result getLevelSecond(@PathVariable String levelFirst, @PathVariable String levelSecond) {
        List<Mechanism > mechanismList = mechanismService.getLevelThird(levelFirst,levelSecond);
        Integer code = mechanismList != null ? Code.GET_OK : Code.GET_ERR;
        String msg = mechanismList != null ? "" : "数据查询失败";
        return new Result(code,mechanismList,msg);
    }

    @PostMapping
    public Result saveLevelFirst(@RequestBody Mechanism mechanism) {
        boolean flag = mechanismService.saveLevelFirst(mechanism);
        return new Result(flag ? Code.SAVE_OK : Code.SAVE_ERR,flag);
    }

    @PostMapping("/second")
    public Result saveLevelSecond(@RequestBody Mechanism mechanism) {
        boolean flag = mechanismService.saveLevelSecond(mechanism);
        return new Result(flag ? Code.SAVE_OK : Code.SAVE_ERR,flag);
    }

    @PostMapping("/third")
    public Result saveLevelThird(@RequestBody Mechanism mechanism) {
        boolean flag = mechanismService.saveLevelThird(mechanism);
        return new Result(flag ? Code.SAVE_OK : Code.SAVE_ERR,flag);

    }
}
