package com.qyj.dao;

import com.qyj.domain.Book;
import com.qyj.domain.Mechanism;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;

import java.util.List;

public interface MechanismDao {
    @Insert("insert into tbl_book (type, name, description) values(#{type}, #{name}, #{description})")
    public void save(Book book);

    @Update("update tbl_book set type = #{type}, name = #{name}, description = #{description} where id = #{id}")
    public void update(Book book);

    @Delete("delete from tbl_book where id = #{id}")
    public void delete(Integer id);

    @Select("select * from tbl_book where id = #{id}")
    public Book getById(Integer id);

//    @Select("select id,level_first as levelFirst,level_second as levelSecond,level_third as levelThird from mechanism")
    @Select("select id,name as levelFirst from level_first")
    public List<Mechanism> getAll();

//    @Select("select level_second as levelSecond from mechanism where level_first = #{levelFirst}")
//@Select("select id,name as levelSecond from level_second where first_no in (select id from level_first where name = #{levelFirst}) ")
    @Select("select id,name as levelSecond from level_second where first_no = #{levelFirst} ")
    public List<Mechanism> getLevelSecond(String levelFirst);

//    @Select("select level_third as levelThird from mechanism where level_first = #{levelFirst} and level_second = #{levelSecond}")
//    @Select("select id,name as levelThird from level_third where second_no in (select id from level_second where name = #{levelSecond} and first_no in (select id from level_first where name = #{levelFirst} ))")
    @Select("select id,name as levelThird from level_third where second_no in (select id from level_second where id = #{levelSecond} and first_no = #{levelFirst})")
    public List<Mechanism> getLevelThird(@Param("levelFirst") String levelFirst,@Param("levelSecond") String levelSecond);

    @Insert("insert into level_first (name) values (#{levelFirst});")
    public void saveLevelFirst(Mechanism mechanism);

    @Insert("insert into level_second (name,first_no) values (#{levelSecond},#{id});")
    @Results(id = "",value = {
//            @Result(column = "name",property = "name",jdbcType = JdbcType.VARCHAR),
            @Result(column = "first_no",property = "id",jdbcType = JdbcType.INTEGER)
    })
    public void saveLevelSecond(Mechanism mechanism);

    @Insert("insert into level_third (name,second_no) values (#{levelThird},#{id});")
    @Results(id = "",value = {
//            @Result(column = "name",property = "name",jdbcType = JdbcType.VARCHAR),
            @Result(column = "second_no",property = "id",jdbcType = JdbcType.INTEGER)
    })
    public void saveLevelThird(Mechanism mechanism);
}
