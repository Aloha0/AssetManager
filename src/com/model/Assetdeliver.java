package com.model;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;


/**
 * Assetdeliver entity. @author MyEclipse Persistence Tools
 */

public class Assetdeliver  implements java.io.Serializable {


    // Fields    

     private Integer assetdeliverid;
     private Userimfo userimfoByTransferid;
     private Userimfo userimfoByAccepterid;
     private Date delstartdate;
     private Date dalfinishdate;
     private Integer adelstate;
     private Integer delivertype;
     private Set assetdeliverlists = new HashSet(0);


    // Constructors

    /** default constructor */
    public Assetdeliver() {
    }

    
    /** full constructor */
    public Assetdeliver(Userimfo userimfoByTransferid, Userimfo userimfoByAccepterid, Date delstartdate, Date dalfinishdate, Integer adelstate, Integer delivertype, Set assetdeliverlists) {
        this.userimfoByTransferid = userimfoByTransferid;
        this.userimfoByAccepterid = userimfoByAccepterid;
        this.delstartdate = delstartdate;
        this.dalfinishdate = dalfinishdate;
        this.adelstate = adelstate;
        this.delivertype = delivertype;
        this.assetdeliverlists = assetdeliverlists;
    }

   
    // Property accessors

    public Integer getAssetdeliverid() {
        return this.assetdeliverid;
    }
    
    public void setAssetdeliverid(Integer assetdeliverid) {
        this.assetdeliverid = assetdeliverid;
    }

    public Userimfo getUserimfoByTransferid() {
        return this.userimfoByTransferid;
    }
    
    public void setUserimfoByTransferid(Userimfo userimfoByTransferid) {
        this.userimfoByTransferid = userimfoByTransferid;
    }

    public Userimfo getUserimfoByAccepterid() {
        return this.userimfoByAccepterid;
    }
    
    public void setUserimfoByAccepterid(Userimfo userimfoByAccepterid) {
        this.userimfoByAccepterid = userimfoByAccepterid;
    }

    public Date getDelstartdate() {
        return this.delstartdate;
    }
    
    public void setDelstartdate(Date delstartdate) {
        this.delstartdate = delstartdate;
    }

    public Date getDalfinishdate() {
        return this.dalfinishdate;
    }
    
    public void setDalfinishdate(Date dalfinishdate) {
        this.dalfinishdate = dalfinishdate;
    }

    public Integer getAdelstate() {
        return this.adelstate;
    }
    
    public void setAdelstate(Integer adelstate) {
        this.adelstate = adelstate;
    }

    public Integer getDelivertype() {
        return this.delivertype;
    }
    
    public void setDelivertype(Integer delivertype) {
        this.delivertype = delivertype;
    }

    public Set getAssetdeliverlists() {
        return this.assetdeliverlists;
    }
    
    public void setAssetdeliverlists(Set assetdeliverlists) {
        this.assetdeliverlists = assetdeliverlists;
    }
   








}