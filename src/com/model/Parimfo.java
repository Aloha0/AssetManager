package com.model;

import java.util.HashSet;
import java.util.Set;


/**
 * Parimfo entity. @author MyEclipse Persistence Tools
 */

public class Parimfo  implements java.io.Serializable {


    // Fields    

     private Integer paid;
     private String paname;
     private String pavalue;
     private Integer bpaid;
     private String bpaname;
     private Set userimfos = new HashSet(0);


    // Constructors

    /** default constructor */
    public Parimfo() {
    }

    
    /** full constructor */
    public Parimfo(String paname, String pavalue, Integer bpaid, String bpaname, Set userimfos) {
        this.paname = paname;
        this.pavalue = pavalue;
        this.bpaid = bpaid;
        this.bpaname = bpaname;
        this.userimfos = userimfos;
    }

   
    // Property accessors

    public Integer getPaid() {
        return this.paid;
    }
    
    public void setPaid(Integer paid) {
        this.paid = paid;
    }

    public String getPaname() {
        return this.paname;
    }
    
    public void setPaname(String paname) {
        this.paname = paname;
    }

    public String getPavalue() {
        return this.pavalue;
    }
    
    public void setPavalue(String pavalue) {
        this.pavalue = pavalue;
    }

    public Integer getBpaid() {
        return this.bpaid;
    }
    
    public void setBpaid(Integer bpaid) {
        this.bpaid = bpaid;
    }

    public String getBpaname() {
        return this.bpaname;
    }
    
    public void setBpaname(String bpaname) {
        this.bpaname = bpaname;
    }

    public Set getUserimfos() {
        return this.userimfos;
    }
    
    public void setUserimfos(Set userimfos) {
        this.userimfos = userimfos;
    }
   








}