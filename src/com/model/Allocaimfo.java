package com.model;

import java.util.Date;


/**
 * Allocaimfo entity. @author MyEclipse Persistence Tools
 */

public class Allocaimfo  implements java.io.Serializable {


    // Fields    

     private Integer allocalistid;
     private Userimfo userimfoByOutuserid;
     private Userimfo userimfoByInenterid;
     private Depimfo depimfoByOutdepid;
     private Assetimfo assetimfo;
     private Depimfo depimfoByIndepid;
     private Date indate;
     private Date outdate;
     private String outreason;
     private Integer aistate;


    // Constructors

    /** default constructor */
    public Allocaimfo() {
    }

    
    /** full constructor */
    public Allocaimfo(Userimfo userimfoByOutuserid, Userimfo userimfoByInenterid, Depimfo depimfoByOutdepid, Assetimfo assetimfo, Depimfo depimfoByIndepid, Date indate, Date outdate, String outreason, Integer aistate) {
        this.userimfoByOutuserid = userimfoByOutuserid;
        this.userimfoByInenterid = userimfoByInenterid;
        this.depimfoByOutdepid = depimfoByOutdepid;
        this.assetimfo = assetimfo;
        this.depimfoByIndepid = depimfoByIndepid;
        this.indate = indate;
        this.outdate = outdate;
        this.outreason = outreason;
        this.aistate = aistate;
    }

   
    // Property accessors

    public Integer getAllocalistid() {
        return this.allocalistid;
    }
    
    public void setAllocalistid(Integer allocalistid) {
        this.allocalistid = allocalistid;
    }

    public Userimfo getUserimfoByOutuserid() {
        return this.userimfoByOutuserid;
    }
    
    public void setUserimfoByOutuserid(Userimfo userimfoByOutuserid) {
        this.userimfoByOutuserid = userimfoByOutuserid;
    }

    public Userimfo getUserimfoByInenterid() {
        return this.userimfoByInenterid;
    }
    
    public void setUserimfoByInenterid(Userimfo userimfoByInenterid) {
        this.userimfoByInenterid = userimfoByInenterid;
    }

    public Depimfo getDepimfoByOutdepid() {
        return this.depimfoByOutdepid;
    }
    
    public void setDepimfoByOutdepid(Depimfo depimfoByOutdepid) {
        this.depimfoByOutdepid = depimfoByOutdepid;
    }

    public Assetimfo getAssetimfo() {
        return this.assetimfo;
    }
    
    public void setAssetimfo(Assetimfo assetimfo) {
        this.assetimfo = assetimfo;
    }

    public Depimfo getDepimfoByIndepid() {
        return this.depimfoByIndepid;
    }
    
    public void setDepimfoByIndepid(Depimfo depimfoByIndepid) {
        this.depimfoByIndepid = depimfoByIndepid;
    }

    public Date getIndate() {
        return this.indate;
    }
    
    public void setIndate(Date indate) {
        this.indate = indate;
    }

    public Date getOutdate() {
        return this.outdate;
    }
    
    public void setOutdate(Date outdate) {
        this.outdate = outdate;
    }

    public String getOutreason() {
        return this.outreason;
    }
    
    public void setOutreason(String outreason) {
        this.outreason = outreason;
    }

    public Integer getAistate() {
        return this.aistate;
    }
    
    public void setAistate(Integer aistate) {
        this.aistate = aistate;
    }
   








}