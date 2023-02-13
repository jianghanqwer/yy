package com.qyj.service.impl;

import com.qyj.dao.SalaryItDao;
import com.qyj.domain.SalaryItem;
import com.qyj.service.SalaryItService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SalaryItServiceImpl implements SalaryItService {

    @Autowired
    private SalaryItDao salaryItDao;


    @Override
    public List<SalaryItem> getByStId(Integer standardId) {
        return salaryItDao.getItemNames(standardId);
    }

    @Override
    public boolean update(List<SalaryItem> itemList) {
        for (int i = 0; i < itemList.size(); i++) {
            salaryItDao.update(itemList.get(i));
        }
        return true;
    }

    @Override
    public List<SalaryItem> getAll() {
        return salaryItDao.getAll();
    }
}
