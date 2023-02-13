package com.qyj.dao;

import com.qyj.domain.SalaryStandard;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;

import java.util.List;

public interface SalaryStDao {


    @Insert("insert into tbl_standard (standard_id,standard_name,total,maker,registrant,registration_time,state,opinion) " +
            "values(#{standardId}, #{standardName}, #{total},#{maker},#{registrant},#{registrationTime}),#{state},#{opinion}")
    public void save(SalaryStandard standard);

    @Update("update tbl_standard set standard_name = #{standardName}, total = #{total}, maker = #{maker}, registrant = #{registrant}, registration_time = #{registrationTime}, state = #{state}, opinion = #{opinion} " +
            "where standard_id = #{standardId}")
    public void update(SalaryStandard standard);

    @Delete("delete from tbl_standard where standard_id = #{standardId}")
    public void delete(Integer standardId);

    @Select("select * from tbl_standard where id = #{id}")
    @Results(id = "standard",value = {
            @Result(column = "standard_id",property = "standardId",jdbcType = JdbcType.INTEGER),
            @Result(column = "standard_name",property = "standardName",jdbcType = JdbcType.VARCHAR),
            @Result(column = "registration_time",property = "registrationTime",jdbcType = JdbcType.DATE)
    })
    public SalaryStandard getById(Integer id);

    @Select("select * from tbl_standard where state = #{state}")
    @ResultMap(value = "standard")
    public List<SalaryStandard> getAll(Integer state);

    @Select("select * from tbl_standard")
    @ResultMap(value = "standard")
    public List<SalaryStandard> getAllAll();

}
