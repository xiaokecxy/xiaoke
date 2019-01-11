package com.paotui.entity;

import java.util.Date;

public class Get {
    private Integer id;

    private String getsite;

    private Integer wid;

    private String collectsite;

    private Date gettime;

    private Date collecttime;

    private Integer spec;

    private Integer uid;

    private Integer price;

    private Integer state;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getGetsite() {
        return getsite;
    }

    public void setGetsite(String getsite) {
        this.getsite = getsite == null ? null : getsite.trim();
    }

    public Integer getWid() {
        return wid;
    }

    public void setWid(Integer wid) {
        this.wid = wid;
    }

    public String getCollectsite() {
        return collectsite;
    }

    public void setCollectsite(String collectsite) {
        this.collectsite = collectsite == null ? null : collectsite.trim();
    }

    public Date getGettime() {
        return gettime;
    }

    public void setGettime(Date gettime) {
        this.gettime = gettime;
    }

    public Date getCollecttime() {
        return collecttime;
    }

    public void setCollecttime(Date collecttime) {
        this.collecttime = collecttime;
    }

    public Integer getSpec() {
        return spec;
    }

    public void setSpec(Integer spec) {
        this.spec = spec;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }
}