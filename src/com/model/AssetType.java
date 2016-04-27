package com.model;

import java.util.HashSet;
import java.util.Set;


/**
 * Assettype entity. @author MyEclipse Persistence Tools
 */

public class Assettype  implements java.io.Serializable {


    // Fields    

     private Integer assettypeid;
     private String assettypecode;
     private String assettypename;
     private Integer preassettypeid;
     private String preassettypename;
     private Set assetimfos = new HashSet(0);


    // Constructors

    /** default constructor */
    public Assettype() {
    }

    
    /** full constructor */
    public Assettype(String assettypecode, String assettypename, Integer preassettypeid, String preassettypename, Set assetimfos) {
        this.assettypecode = assettypecode;
        this.assettypename = assettypename;
        this.preassettypeid = preassettypeid;
        this.preassettypename = preassettypename;
        this.assetimfos = assetimfos;
    }

   
    // Property accessors

    public Integer getAssettypeid() {
        return this.assettypeid;
    }
    
    public void setAssettypeid(Integer assettypeid) {
        this.assettypeid = assettypeid;
    }

    public String getAssettypecode() {
        return this.assettypecode;
    }
    
    public void setAssettypecode(String assettypecode) {
        this.assettypecode = assettypecode;
    }

    public String getAssettypename() {
        return this.assettypename;
    }
    
    public void setAssettypename(String assettypename) {
        this.assettypename = assettypename;
    }

    public Integer getPreassettypeid() {
        return this.preassettypeid;
    }
    
    public void setPreassettypeid(Integer preassettypeid) {
        this.preassettypeid = preassettypeid;
    }

    public String getPreassettypename() {
        return this.preassettypename;
    }
    
    public void setPreassettypename(String preassettypename) {
        this.preassettypename = preassettypename;
    }

    public Set getAssetimfos() {
        return this.assetimfos;
    }
    
    public void setAssetimfos(Set assetimfos) {
        this.assetimfos = assetimfos;
    }
   








}