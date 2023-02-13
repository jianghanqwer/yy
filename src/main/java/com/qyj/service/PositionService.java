package com.qyj.service;

import com.qyj.domain.Position;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface PositionService {

    /**
     * 查询
     * @return
     */
    public List<Position> getClassification();

    /**
     * 查职位名称
     * @param id
     * @return
     */
    public List<Position> getName(Integer id);
}
