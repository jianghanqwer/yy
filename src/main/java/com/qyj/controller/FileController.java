package com.qyj.controller;

import com.qyj.domain.Book;
import com.qyj.domain.File;
import com.qyj.service.FileService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/files")
public class FileController {

    @Autowired
    private FileService fileService;

    @PostMapping
    public Result save(@RequestBody File file) {
        boolean flag = fileService.save(file);
        return new Result(flag ? Code.SAVE_OK : Code.SAVE_ERR,flag);
    }

    @PutMapping
    public Result update(@RequestBody File file) {
        boolean flag = fileService.update(file);
        return new Result(flag ? Code.SAVE_OK : Code.SAVE_ERR,flag);
    }

    @PutMapping("/{fileNo}/{state}")
    public Result updateState(@PathVariable String fileNo,@PathVariable Integer state) {
        boolean flag = fileService.updateState(fileNo,state);
        return new Result(flag ? Code.SAVE_OK : Code.SAVE_ERR,flag);
    }

    @GetMapping("/count")
    public Result getCount(){
        String count = fileService.getCount();
        Integer code = count != null ? Code.GET_OK : Code.GET_ERR;
        String msg = count != null ? "" : "数据查询失败";
        return new Result(code,count,msg);
    }

    @GetMapping("/some/{state}")
    public Result getAll(@PathVariable Integer state){
        List<File> fileList = fileService.getAll(state);
        Integer code = fileList != null ? Code.GET_OK : Code.GET_ERR;
        String msg = fileList != null ? "" : "数据查询失败";
        return new Result(code,fileList,msg);
    }

    @GetMapping("/{id}")
    public Result getById(@PathVariable Integer id) {
        File file = fileService.getById(id);
        Integer code = file != null ? Code.GET_OK : Code.GET_ERR;
        String msg = file != null ? "" : "数据查询失败";
        return new Result(code,file,msg);
    }


}
