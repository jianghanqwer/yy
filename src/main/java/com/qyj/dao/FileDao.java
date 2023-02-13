package com.qyj.dao;

import com.qyj.domain.File;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;

import java.util.List;

public interface FileDao {
//    private String fileNo;
//    private String name;
//    private String phone;
//    private String email;
//    private String sex;
//    private String levelFirst;
//    private String levelSecond;
//    private String levelThird;
//    private String zwfl;Name
//    private String zwmc;

//    @Insert("insert into tbl_file_temp (file_no,name,phone,email,sex,level_first,level_second,level_third,zwfl,zwmc) " +
//            "values (#{fileNo},#{name},#{phone},#{email},#{sex},#{levelFirstName},#{levelSecondName},#{levelThirdName},#{zwflName},#{zwmcName});")
//    public void saveFile(File file);

    @Insert("insert into tbl_file (file_no,name,phone,email,sex,level_first_n,level_second_n,level_third_n,zwfl_n,zwmc_n," +
            "level_first,level_second,level_third,zwfl,zwmc,state,xcbz,registration_time,registrant) " +
            "values (#{fileNo},#{name},#{phone},#{email},#{sex},#{levelFirstName},#{levelSecondName},#{levelThirdName},#{zwflName},#{zwmcName}," +
            "#{levelFirst},#{levelSecond},#{levelThird},#{zwfl},#{zwmc},#{state},#{xcbz},#{registrationTime},#{registrant});")
    public void save(File file);

    @Update("update tbl_file set name = #{name}, phone = #{phone}, email = #{email}, sex = #{sex}, state = #{state}, xcbz= #{xcbz} " +
            "where file_no = #{fileNo} ;")
    public void update(File file);


    @Update("update tbl_file set state = #{state} " +
            "where file_no = #{fileNo} ;")
    public void updateState(@Param("fileNo") String fileNo,@Param("state")Integer state);


    @Select("select count(*)+1 from tbl_file;")
    public String getCount();

    @Select("select * from tbl_file where state = #{state};")
    @Results(id = "file_no", value = {
            @Result(property = "fileNo",column = "file_no",jdbcType = JdbcType.VARCHAR),
            @Result(property = "levelFirstName",column = "level_first_n",jdbcType = JdbcType.VARCHAR),
            @Result(property = "levelSecondName",column = "level_second_n",jdbcType = JdbcType.VARCHAR),
            @Result(property = "levelThirdName",column = "level_third_n",jdbcType = JdbcType.VARCHAR),
            @Result(property = "zwflName",column = "zwfl_n",jdbcType = JdbcType.VARCHAR),
            @Result(property = "zwmcName",column = "zwmc_n",jdbcType = JdbcType.VARCHAR),
            @Result(property = "levelFirst",column = "level_first",jdbcType = JdbcType.INTEGER),
            @Result(property = "levelSecond",column = "level_second",jdbcType = JdbcType.INTEGER),
            @Result(property = "levelThird",column = "level_third",jdbcType = JdbcType.INTEGER),
            @Result(property = "registrationTime",column = "registration_time",jdbcType = JdbcType.TIMESTAMP)


    })
    public List<File> getAll(Integer state);

    @Select("select * from tbl_file  where id = #{id};")
    @ResultMap(value = "file_no")
    public File getById(Integer id);

}
