package com.qyj.service;

import com.qyj.domain.Book;
import com.qyj.domain.SalaryStandard;

import java.util.List;

public interface SalaryStService {


    public boolean save(SalaryStandard standard);

    public boolean update(SalaryStandard standard);

    public boolean delete(Integer id);

    public SalaryStandard getById(Integer id);

    public List<SalaryStandard> getAll(Integer state);

    public List<SalaryStandard> getAllAll();

}
