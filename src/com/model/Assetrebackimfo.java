package com.model;

import java.util.Date;


/**
 * Assetrebackimfo entity. @author MyEclipse Persistence Tools
 */

public class Assetrebackimfo  implements java.io.Serializable {


    // Fields    

     private Integer rebackid;
     private Userimfo userimfoByRebackerid;
     private Userimfo userimfoByReceiverid;
     private Assetimfo assetimfo;
     private Date usedate;
     private Date rebackdate;
     private Integer arstate;


    // Constructors

    /** default constructor */
    public Assetrebackimfo() {
    }

    
    /** full constructor */
    public Assetrebackimfo(Userimfo userimfoByRebackerid, Userimfo userimfoByReceiverid, Assetimfo assetimfo, Date usedate, Date rebackdate, Integer arstate) {
        this.userimfoByRebackerid = userimfoByRebackerid;
        this.userimfoByReceiverid = userimfoByReceiverid;
        this.assetimfo = assetimfo;
        this.usedate = usedate;
        this.rebackdate = rebackdate;
        this.arstate = arstate;
    }

   
    // Property accessors

    public Integer getRebackid() {
        return this.rebackid;
    }
    
    public void setRebackid(Integer rebackid) {
        this.rebackid = rebackid;
    }

    public Userimfo getUserimfoByRebackerid() {
        return this.userimfoByRebackerid;
    }
    
    public void setUserimfoByRebackerid(Userimfo userimfoByRebackerid) {
        this.userimfoByRebackerid = userimfoByRebackerid;
    }

    public Userimfo getUserimfoByReceiverid() {
        return this.userimfoByReceiverid;
    }
    
    public void setUserimfoByReceiverid(Userimfo userimfoByReceiverid) {
        this.userimfoByReceiverid = userimfoByReceiverid;
    }

    public Assetimfo getAssetimfo() {
        return this.assetimfo;
    }
    
    public void setAssetimfo(Assetimfo assetimfo) {
        this.assetimfo = assetimfo;
    }

    public Date getUsedate() {
        return this.usedate;
    }
    
    public void setUsedate(Date usedate) {
        this.usedate = usedate;
    }

    public Date getRebackdate() {
        return this.rebackdate;
    }
    
    public void setRebackdate(Date rebackdate) {
        this.rebackdate = rebackdate;
    }

    public Integer getArstate() {
        return this.arstate;
    }
    
    public void setArstate(Integer arstate) {
        this.arstate = arstate;
    }
   








}