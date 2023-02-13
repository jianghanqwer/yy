package com.qyj.service.impl;

import com.qyj.dao.FileDao;
import com.qyj.domain.File;
import com.qyj.service.FileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FileServiceImpl implements FileService {

    @Autowired
    private FileDao fileDao;

    @Override
    public boolean save(File file) {
        fileDao.save(file);
        return true;
    }

    @Override
    public boolean update(File file) {
        fileDao.update(file);
        return true;
    }

    @Override
    public boolean updateState(String fileNo, Integer state) {
        fileDao.updateState(fileNo,state);
        return true;
    }

    @Override
    public String getCount() {
        return fileDao.getCount();
    }

    @Override
    public List<File> getAll(Integer state) {
        return fileDao.getAll(state);
    }

    @Override
    public File getById(Integer id) {
        return fileDao.getById(id);
    }
}
