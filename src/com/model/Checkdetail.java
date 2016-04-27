package com.model;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;


/**
 * Checkdetail entity. @author MyEclipse Persistence Tools
 */

public class Checkdetail  implements java.io.Serializable {


    // Fields    

     private Integer checkdetailid;
     private Assetcheck assetcheck;
     private Assetimfo assetimfo;
     private Integer checkresult;
     private Date actime;
     private Set assetimfos = new HashSet(0);


    // Constructors

    /** default constructor */
    public Checkdetail() {
    }

    
    /** full constructor */
    public Checkdetail(Assetcheck assetcheck, Assetimfo assetimfo, Integer checkresult, Date actime, Set assetimfos) {
        this.assetcheck = assetcheck;
        this.assetimfo = assetimfo;
        this.checkresult = checkresult;
        this.actime = actime;
        this.assetimfos = assetimfos;
    }

   
    // Property accessors

    public Integer getCheckdetailid() {
        return this.checkdetailid;
    }
    
    public void setCheckdetailid(Integer checkdetailid) {
        this.checkdetailid = checkdetailid;
    }

    public Assetcheck getAssetcheck() {
        return this.assetcheck;
    }
    
    public void setAssetcheck(Assetcheck assetcheck) {
        this.assetcheck = assetcheck;
    }

    public Assetimfo getAssetimfo() {
        return this.assetimfo;
    }
    
    public void setAssetimfo(Assetimfo assetimfo) {
        this.assetimfo = assetimfo;
    }

    public Integer getCheckresult() {
        return this.checkresult;
    }
    
    public void setCheckresult(Integer checkresult) {
        this.checkresult = checkresult;
    }

    public Date getActime() {
        return this.actime;
    }
    
    public void setActime(Date actime) {
        this.actime = actime;
    }

    public Set getAssetimfos() {
        return this.assetimfos;
    }
    
    public void setAssetimfos(Set assetimfos) {
        this.assetimfos = assetimfos;
    }
   








}