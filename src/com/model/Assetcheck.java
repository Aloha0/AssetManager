package com.model;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;


/**
 * Assetcheck entity. @author MyEclipse Persistence Tools
 */

public class Assetcheck  implements java.io.Serializable {


    // Fields    

     private Integer assetcheckid;
     private Userimfo userimfo;
     private Date checkdate;
     private Integer acstate;
     private Set checkdetails = new HashSet(0);


    // Constructors

    /** default constructor */
    public Assetcheck() {
    }

    
    /** full constructor */
    public Assetcheck(Userimfo userimfo, Date checkdate, Integer acstate, Set checkdetails) {
        this.userimfo = userimfo;
        this.checkdate = checkdate;
        this.acstate = acstate;
        this.checkdetails = checkdetails;
    }

   
    // Property accessors

    public Integer getAssetcheckid() {
        return this.assetcheckid;
    }
    
    public void setAssetcheckid(Integer assetcheckid) {
        this.assetcheckid = assetcheckid;
    }

    public Userimfo getUserimfo() {
        return this.userimfo;
    }
    
    public void setUserimfo(Userimfo userimfo) {
        this.userimfo = userimfo;
    }

    public Date getCheckdate() {
        return this.checkdate;
    }
    
    public void setCheckdate(Date checkdate) {
        this.checkdate = checkdate;
    }

    public Integer getAcstate() {
        return this.acstate;
    }
    
    public void setAcstate(Integer acstate) {
        this.acstate = acstate;
    }

    public Set getCheckdetails() {
        return this.checkdetails;
    }
    
    public void setCheckdetails(Set checkdetails) {
        this.checkdetails = checkdetails;
    }
   








}