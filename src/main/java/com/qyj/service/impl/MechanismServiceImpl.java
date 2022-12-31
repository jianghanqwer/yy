package com.qyj.service.impl;

import com.qyj.dao.MechanismDao;
import com.qyj.domain.Book;
import com.qyj.domain.Mechanism;
import com.qyj.service.MechanismService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MechanismServiceImpl implements MechanismService {

    @Autowired
    private MechanismDao mechanismDao;

    @Override
    public boolean save(Mechanism mechanism) {
        return false;
    }

    @Override
    public boolean update(Mechanism mechanism) {
        return false;
    }

    @Override
    public boolean delete(Integer id) {
        return false;
    }

    @Override
    public Book getById(Integer id) {
        return null;
    }

    @Override
    public List<Mechanism> getAll() {
        return mechanismDao.getAll();
    }

    @Override
    public List<Mechanism> getLevelSecond(String levelFirst) {
        return mechanismDao.getLevelSecond(levelFirst);
    }

    @Override
    public List<Mechanism> getLevelThird(String levelFirst,String levelSecond) {
        return mechanismDao.getLevelThird(levelFirst,levelSecond);
    }
}
