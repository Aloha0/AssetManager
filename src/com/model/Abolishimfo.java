package com.model;

import java.util.Date;


/**
 * Abolishimfo entity. @author MyEclipse Persistence Tools
 */

public class Abolishimfo  implements java.io.Serializable {


    // Fields    

     private Integer abolishlistid;
     private Userimfo userimfoByAbuserid;
     private Userimfo userimfoByReviewerid;
     private Assetimfo assetimfo;
     private Date abolishdate;
     private Date reviewdate;
     private Integer abistate;


    // Constructors

    /** default constructor */
    public Abolishimfo() {
    }

    
    /** full constructor */
    public Abolishimfo(Userimfo userimfoByAbuserid, Userimfo userimfoByReviewerid, Assetimfo assetimfo, Date abolishdate, Date reviewdate, Integer abistate) {
        this.userimfoByAbuserid = userimfoByAbuserid;
        this.userimfoByReviewerid = userimfoByReviewerid;
        this.assetimfo = assetimfo;
        this.abolishdate = abolishdate;
        this.reviewdate = reviewdate;
        this.abistate = abistate;
    }

   
    // Property accessors

    public Integer getAbolishlistid() {
        return this.abolishlistid;
    }
    
    public void setAbolishlistid(Integer abolishlistid) {
        this.abolishlistid = abolishlistid;
    }

    public Userimfo getUserimfoByAbuserid() {
        return this.userimfoByAbuserid;
    }
    
    public void setUserimfoByAbuserid(Userimfo userimfoByAbuserid) {
        this.userimfoByAbuserid = userimfoByAbuserid;
    }

    public Userimfo getUserimfoByReviewerid() {
        return this.userimfoByReviewerid;
    }
    
    public void setUserimfoByReviewerid(Userimfo userimfoByReviewerid) {
        this.userimfoByReviewerid = userimfoByReviewerid;
    }

    public Assetimfo getAssetimfo() {
        return this.assetimfo;
    }
    
    public void setAssetimfo(Assetimfo assetimfo) {
        this.assetimfo = assetimfo;
    }

    public Date getAbolishdate() {
        return this.abolishdate;
    }
    
    public void setAbolishdate(Date abolishdate) {
        this.abolishdate = abolishdate;
    }

    public Date getReviewdate() {
        return this.reviewdate;
    }
    
    public void setReviewdate(Date reviewdate) {
        this.reviewdate = reviewdate;
    }

    public Integer getAbistate() {
        return this.abistate;
    }
    
    public void setAbistate(Integer abistate) {
        this.abistate = abistate;
    }
   








}