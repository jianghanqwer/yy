package com.qyj.domain;

public class Mechanism {
    private Integer id;
    private String levelFirst;
    private String levelSecond;
    private String levelThird;

    public int getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLevelFirst() {
        return levelFirst;
    }

    public void setLevelFirst(String levelFirst) {
        this.levelFirst = levelFirst;
    }

    public String getLevelSecond() {
        return levelSecond;
    }

    public void setLevelSecond(String levelSecond) {
        this.levelSecond = levelSecond;
    }

    public String getLevelThird() {
        return levelThird;
    }

    public void setLevelThird(String levelThird) {
        this.levelThird = levelThird;
    }

    @Override
    public String toString() {
        return "Mechanism{" +
                "id=" + id +
                ", levelFirst='" + levelFirst + '\'' +
                ", levelSecond='" + levelSecond + '\'' +
                ", levelThird='" + levelThird + '\'' +
                '}';
    }
}
