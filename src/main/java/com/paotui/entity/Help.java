package com.paotui.entity;

import java.util.Date;

public class Help {
    private Integer id;

    private Integer uid;

    private Integer wid;

    private String incident;

    private Date helptime;

    private String helpsite;

    private String helprequire;

    private Integer helpcost;

    private Integer state;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public Integer getWid() {
        return wid;
    }

    public void setWid(Integer wid) {
        this.wid = wid;
    }

    public String getIncident() {
        return incident;
    }

    public void setIncident(String incident) {
        this.incident = incident == null ? null : incident.trim();
    }

    public Date getHelptime() {
        return helptime;
    }

    public void setHelptime(Date helptime) {
        this.helptime = helptime;
    }

    public String getHelpsite() {
        return helpsite;
    }

    public void setHelpsite(String helpsite) {
        this.helpsite = helpsite == null ? null : helpsite.trim();
    }

    public String getHelprequire() {
        return helprequire;
    }

    public void setHelprequire(String helprequire) {
        this.helprequire = helprequire == null ? null : helprequire.trim();
    }

    public Integer getHelpcost() {
        return helpcost;
    }

    public void setHelpcost(Integer helpcost) {
        this.helpcost = helpcost;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }
}