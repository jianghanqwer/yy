package com.qyj.domain;

public class Position {
    private Integer id;
    private String classification;
    private String name;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getClassification() {
        return classification;
    }

    public void setClassification(String classification) {
        this.classification = classification;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Position{" +
                "id=" + id +
                ", classification='" + classification + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
