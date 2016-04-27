package com.model;

import java.util.Date;


/**
 * Assetdeliverlist entity. @author MyEclipse Persistence Tools
 */

public class Assetdeliverlist  implements java.io.Serializable {


    // Fields    

     private Integer assetdeliverlistid;
     private Assetdeliver assetdeliver;
     private Userimfo userimfo;
     private Assetimfo assetimfo;
     private Date rebackdate;
     private Integer acceptresult;


    // Constructors

    /** default constructor */
    public Assetdeliverlist() {
    }

	/** minimal constructor */
    public Assetdeliverlist(Assetdeliver assetdeliver, Assetimfo assetimfo) {
        this.assetdeliver = assetdeliver;
        this.assetimfo = assetimfo;
    }
    
    /** full constructor */
    public Assetdeliverlist(Assetdeliver assetdeliver, Userimfo userimfo, Assetimfo assetimfo, Date rebackdate, Integer acceptresult) {
        this.assetdeliver = assetdeliver;
        this.userimfo = userimfo;
        this.assetimfo = assetimfo;
        this.rebackdate = rebackdate;
        this.acceptresult = acceptresult;
    }

   
    // Property accessors

    public Integer getAssetdeliverlistid() {
        return this.assetdeliverlistid;
    }
    
    public void setAssetdeliverlistid(Integer assetdeliverlistid) {
        this.assetdeliverlistid = assetdeliverlistid;
    }

    public Assetdeliver getAssetdeliver() {
        return this.assetdeliver;
    }
    
    public void setAssetdeliver(Assetdeliver assetdeliver) {
        this.assetdeliver = assetdeliver;
    }

    public Userimfo getUserimfo() {
        return this.userimfo;
    }
    
    public void setUserimfo(Userimfo userimfo) {
        this.userimfo = userimfo;
    }

    public Assetimfo getAssetimfo() {
        return this.assetimfo;
    }
    
    public void setAssetimfo(Assetimfo assetimfo) {
        this.assetimfo = assetimfo;
    }

    public Date getRebackdate() {
        return this.rebackdate;
    }
    
    public void setRebackdate(Date rebackdate) {
        this.rebackdate = rebackdate;
    }

    public Integer getAcceptresult() {
        return this.acceptresult;
    }
    
    public void setAcceptresult(Integer acceptresult) {
        this.acceptresult = acceptresult;
    }
   








}