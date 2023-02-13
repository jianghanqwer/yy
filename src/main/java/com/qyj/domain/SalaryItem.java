package com.qyj.domain;

import java.math.BigDecimal;

public class SalaryItem {
    private Integer id;
    private Integer standardId;
    private Integer itemId;
    private BigDecimal money;
    private String itemName;

    @Override
    public String toString() {
        return "SalaryItem{" +
                "id=" + id +
                ", standardId=" + standardId +
                ", itemId=" + itemId +
                ", money=" + money +
                ", itemName='" + itemName + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getStandardId() {
        return standardId;
    }

    public void setStandardId(Integer standardId) {
        this.standardId = standardId;
    }

    public Integer getItemId() {
        return itemId;
    }

    public void setItemId(Integer itemId) {
        this.itemId = itemId;
    }

    public BigDecimal getMoney() {
        return money;
    }

    public void setMoney(BigDecimal money) {
        this.money = money;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }
}
