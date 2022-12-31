package com.qyj.service;

import com.qyj.domain.Book;
import com.qyj.domain.Mechanism;

import java.util.List;

public interface MechanismService {


    /**
     * 保存
     * @param mechanism
     * @return
     */
    public boolean save(Mechanism mechanism);
    /**
     * 修改
     * @param mechanism
     * @return
     */
    public boolean update(Mechanism mechanism);
    /**
     * 根据id删除
     * @param id
     * @return
     */
    public boolean delete(Integer id);
    /**
     * 根据id查询
     * @param id
     * @return
     */
    public Book getById(Integer id);
    /**
     * 查询所有
     * @return
     */
    public List<Mechanism> getAll();

    /**
     * 查询二级
     * @return
     */
    public List<Mechanism> getLevelSecond(String levelFirst);

    /**
     * 查询三级
     * @return
     */
    public List<Mechanism> getLevelThird(String levelFirst, String levelSecond);

}
