package com.qyj.controller;

import com.qyj.domain.Book;
import com.qyj.domain.SalaryItem;
import com.qyj.domain.SalaryStandard;
import com.qyj.service.SalaryItService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/salaryItems")
public class SalaryItController {

    @Autowired
    private SalaryItService salaryItService;

    @PutMapping
    public Result update(@RequestBody List<SalaryItem> itemList) {
        boolean flag = salaryItService.update(itemList);
        return new Result(flag ? Code.UPDATE_OK : Code.UPDATE_ERR,flag);
    }

    @GetMapping("/{id}")
    public Result getById(@PathVariable Integer id) {
        List<SalaryItem> itemList = salaryItService.getByStId(id);
        Integer code = itemList != null ? Code.GET_OK : Code.GET_ERR;
        String msg = itemList != null ? "" : "数据查询失败";
        return new Result(code,itemList,msg);
    }

    @GetMapping
    public Result getAll() {
        List<SalaryItem> itemLists = salaryItService.getAll();
        Integer code = itemLists != null ? Code.GET_OK : Code.GET_ERR;
        String msg = itemLists != null ? "" : "数据查询失败";
        return new Result(code,itemLists,msg);
    }



}
