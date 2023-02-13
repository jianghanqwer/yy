package com.qyj.service;

import com.qyj.domain.SalaryItem;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.math.BigDecimal;
import java.util.List;

public interface SalaryItService {

    public List<SalaryItem> getByStId(Integer standardId);

    public boolean update(List<SalaryItem> itemList);

    public List<SalaryItem> getAll();

}
