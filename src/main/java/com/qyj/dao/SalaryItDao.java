package com.qyj.dao;

import com.qyj.domain.SalaryItem;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.math.BigDecimal;
import java.util.List;

public interface SalaryItDao {

//    @Select("SELECT item_name itemName,id itemId from tbl_item WHERE id in " +
//            "(SELECT item_id from tbl_standard_item where standatd_id = #{standardId})")
    @Select("SELECT item_name itemName,money,tbl_item.id itemId,tbl_standard_item.standatd_id standardId from tbl_item,tbl_standard_item " +
            "where tbl_item.id = tbl_standard_item.item_id and tbl_standard_item.standatd_id = #{standardId} ")
    public List<SalaryItem> getItemNames(Integer standardId);

    @Update("update tbl_standard_item set money = #{money} where standatd_id = #{standardId} and item_id = #{itemId};")
//    public boolean update(@Param("standardId") Integer standardId, @Param("itemId") Integer itemId, @Param("money") BigDecimal money);
    public boolean update(SalaryItem item);

    @Select("select id itemId,item_name itemName from tbl_item;")
    public List<SalaryItem> getAll();

}
