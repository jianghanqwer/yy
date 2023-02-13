package com.qyj.dao;

import com.qyj.domain.Position;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface PositionDao {

    @Select("select id,classification from tbl_p_classification;")
    public List<Position> getClassification();

    @Select("select id,name from tbl_p_name where classification_id = #{id};")
    public List<Position> getName(Integer id);
    
}
