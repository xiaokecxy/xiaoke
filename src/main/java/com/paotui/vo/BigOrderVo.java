package com.paotui.vo;

import com.paotui.entity.*;

import java.util.List;


public class BigOrderVo {
    private List<Buy> buys;

    private  List<Get> gets;

    private  List<Give> gives;

    private  List<Pueueup> pueueups;

    private  List<Help> helps;

    public List<Buy> getBuys() {
        return buys;
    }

    public void setBuys(List<Buy> buys) {
        this.buys = buys;
    }

    public List<Get> getGets() {
        return gets;
    }

    public void setGets(List<Get> gets) {
        this.gets = gets;
    }

    public List<Give> getGives() {
        return gives;
    }

    public void setGives(List<Give> gives) {
        this.gives = gives;
    }

    public List<Pueueup> getPueueups() {
        return pueueups;
    }

    public void setPueueups(List<Pueueup> pueueups) {
        this.pueueups = pueueups;
    }

    public List<Help> getHelps() {
        return helps;
    }

    public void setHelps(List<Help> helps) {
        this.helps = helps;
    }
}
