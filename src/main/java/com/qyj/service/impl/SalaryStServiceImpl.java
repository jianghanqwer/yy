package com.qyj.service.impl;

import com.qyj.dao.SalaryStDao;
import com.qyj.domain.SalaryStandard;
import com.qyj.service.SalaryStService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SalaryStServiceImpl implements SalaryStService {

    @Autowired
    private SalaryStDao salaryStDao;

    @Override
    public boolean save(SalaryStandard standard) {
        salaryStDao.save(standard);
        return true;
    }

    @Override
    public boolean update(SalaryStandard standard) {
       salaryStDao.update(standard);
        return true;
    }

    @Override
    public boolean delete(Integer standardId) {
        salaryStDao.delete(standardId);
        return true;
    }

    @Override
    public SalaryStandard getById(Integer standardId) {
        return salaryStDao.getById(standardId);
    }

    @Override
    public List<SalaryStandard> getAll(Integer state) {
        return salaryStDao.getAll(state);
    }

    @Override
    public List<SalaryStandard> getAllAll() {
        return salaryStDao.getAllAll();
    }
}
