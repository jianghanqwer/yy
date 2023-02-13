package com.qyj.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.sql.Timestamp;

public class File {
    private Integer id;
    private String fileNo;
    private String name;
    private String phone;
    private String email;
    private String sex;
    private String levelFirstName;
    private String levelSecondName;
    private String levelThirdName;
    private String zwflName;
    private String zwmcName;
    private Integer levelFirst;
    private Integer levelSecond;
    private Integer levelThird;
    private Integer zwfl;
    private Integer zwmc;
    private Integer state;
    private Integer xcbz;
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private java.sql.Timestamp registrationTime;
    private String registrant;


    @Override
    public String toString() {
        return "File{" +
                "id=" + id +
                ", fileNo='" + fileNo + '\'' +
                ", name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                ", sex='" + sex + '\'' +
                ", levelFirstName='" + levelFirstName + '\'' +
                ", levelSecondName='" + levelSecondName + '\'' +
                ", levelThirdName='" + levelThirdName + '\'' +
                ", zwflName='" + zwflName + '\'' +
                ", zwmcName='" + zwmcName + '\'' +
                ", levelFirst=" + levelFirst +
                ", levelSecond=" + levelSecond +
                ", levelThird=" + levelThird +
                ", zwfl=" + zwfl +
                ", zwmc=" + zwmc +
                ", state=" + state +
                ", xcbz=" + xcbz +
                ", registrationTime=" + registrationTime +
                ", registrant='" + registrant + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFileNo() {
        return fileNo;
    }

    public void setFileNo(String fileNo) {
        this.fileNo = fileNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getLevelFirstName() {
        return levelFirstName;
    }

    public void setLevelFirstName(String levelFirstName) {
        this.levelFirstName = levelFirstName;
    }

    public String getLevelSecondName() {
        return levelSecondName;
    }

    public void setLevelSecondName(String levelSecondName) {
        this.levelSecondName = levelSecondName;
    }

    public String getLevelThirdName() {
        return levelThirdName;
    }

    public void setLevelThirdName(String levelThirdName) {
        this.levelThirdName = levelThirdName;
    }

    public String getZwflName() {
        return zwflName;
    }

    public void setZwflName(String zwflName) {
        this.zwflName = zwflName;
    }

    public String getZwmcName() {
        return zwmcName;
    }

    public void setZwmcName(String zwmcName) {
        this.zwmcName = zwmcName;
    }

    public Integer getLevelFirst() {
        return levelFirst;
    }

    public void setLevelFirst(Integer levelFirst) {
        this.levelFirst = levelFirst;
    }

    public Integer getLevelSecond() {
        return levelSecond;
    }

    public void setLevelSecond(Integer levelSecond) {
        this.levelSecond = levelSecond;
    }

    public Integer getLevelThird() {
        return levelThird;
    }

    public void setLevelThird(Integer levelThird) {
        this.levelThird = levelThird;
    }

    public Integer getZwfl() {
        return zwfl;
    }

    public void setZwfl(Integer zwfl) {
        this.zwfl = zwfl;
    }

    public Integer getZwmc() {
        return zwmc;
    }

    public void setZwmc(Integer zwmc) {
        this.zwmc = zwmc;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public Integer getXcbz() {
        return xcbz;
    }

    public void setXcbz(Integer xcbz) {
        this.xcbz = xcbz;
    }

    public Timestamp getRegistrationTime() {
        return registrationTime;
    }

    public void setRegistrationTime(Timestamp registrationTime) {
        this.registrationTime = registrationTime;
    }

    public String getRegistrant() {
        return registrant;
    }

    public void setRegistrant(String registrant) {
        this.registrant = registrant;
    }
}
