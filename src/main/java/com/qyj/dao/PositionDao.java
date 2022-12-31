package com.qyj.dao;

import com.qyj.domain.Position;
import org.apache.ibatis.annotations.Select;

public interface PositionDao {

    @Select("select id,classification from tbl_p_classification;")
    public Position getClassification();

    @Select("select id,name from tbl_p_name where classication_id = #{id};")
    public Position getName(Integer id);
    
}
