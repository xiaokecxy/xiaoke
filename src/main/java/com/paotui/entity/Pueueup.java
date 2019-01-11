package com.paotui.entity;

import java.util.Date;

public class Pueueup {
    private Integer id;

    private Integer uid;

    private Integer wid;

    private String content;

    private String pueuesite;

    private String pueuegoal;

    private Date pueuetime;

    private Integer qcost;

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

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public String getPueuesite() {
        return pueuesite;
    }

    public void setPueuesite(String pueuesite) {
        this.pueuesite = pueuesite == null ? null : pueuesite.trim();
    }

    public String getPueuegoal() {
        return pueuegoal;
    }

    public void setPueuegoal(String pueuegoal) {
        this.pueuegoal = pueuegoal == null ? null : pueuegoal.trim();
    }

    public Date getPueuetime() {
        return pueuetime;
    }

    public void setPueuetime(Date pueuetime) {
        this.pueuetime = pueuetime;
    }

    public Integer getQcost() {
        return qcost;
    }

    public void setQcost(Integer qcost) {
        this.qcost = qcost;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }
}