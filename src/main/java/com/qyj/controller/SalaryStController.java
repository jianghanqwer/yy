package com.qyj.controller;

import com.qyj.domain.Book;
import com.qyj.domain.SalaryStandard;
import com.qyj.service.SalaryStService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/salaryStandards")
public class SalaryStController {

    @Autowired
    private SalaryStService salaryStService;

    @PostMapping
    public Result save(@RequestBody SalaryStandard standard) {
        boolean flag =  salaryStService.save(standard);
        return new Result(flag ? Code.SAVE_OK : Code.SAVE_ERR,flag);
    }

    @PutMapping
    public Result update(@RequestBody SalaryStandard standard) {
        boolean flag = salaryStService.update(standard);
        return new Result(flag ? Code.UPDATE_OK : Code.UPDATE_ERR,flag);
    }

    @DeleteMapping("/{id}")
    public Result delete(@PathVariable Integer id) {
        boolean flag = salaryStService.delete(id);
        return new Result(flag ? Code.DELETE_OK : Code.DELETE_ERR,flag);
    }

    @GetMapping("/{id}")
    public Result getById(@PathVariable Integer id) {
        SalaryStandard standard = salaryStService.getById(id);
        Integer code = standard != null ? Code.GET_OK : Code.GET_ERR;
        String msg = standard != null ? "" : "数据查询失败";
        return new Result(code,standard,msg);
    }

    @GetMapping("/some/{state}")
    public Result getAll(@PathVariable Integer state) {
        List<SalaryStandard> standardList = salaryStService.getAll(state);
        Integer code = standardList != null ? Code.GET_OK : Code.GET_ERR;
        String msg = standardList != null ? "" : "数据查询失败";
        return new Result(code,standardList,msg);
    }

    @GetMapping
    public Result getAllAll() {
        List<SalaryStandard> standardList = salaryStService.getAllAll();
        Integer code = standardList != null ? Code.GET_OK : Code.GET_ERR;
        String msg = standardList != null ? "" : "数据查询失败";
        return new Result(code,standardList,msg);
    }
}
