package com.model;

import java.util.HashSet;
import java.util.Set;


/**
 * Depimfo entity. @author MyEclipse Persistence Tools
 */

public class Depimfo  implements java.io.Serializable {


    // Fields    

     private Integer deptid;
     private String depname;
     private Set userimfos = new HashSet(0);
     private Set assetimfos = new HashSet(0);
     private Set allocaimfosForOutdepid = new HashSet(0);
     private Set allocaimfosForIndepid = new HashSet(0);


    // Constructors

    /** default constructor */
    public Depimfo() {
    }

    
    /** full constructor */
    public Depimfo(String depname, Set userimfos, Set assetimfos, Set allocaimfosForOutdepid, Set allocaimfosForIndepid) {
        this.depname = depname;
        this.userimfos = userimfos;
        this.assetimfos = assetimfos;
        this.allocaimfosForOutdepid = allocaimfosForOutdepid;
        this.allocaimfosForIndepid = allocaimfosForIndepid;
    }

   
    // Property accessors

    public Integer getDeptid() {
        return this.deptid;
    }
    
    public void setDeptid(Integer deptid) {
        this.deptid = deptid;
    }

    public String getDepname() {
        return this.depname;
    }
    
    public void setDepname(String depname) {
        this.depname = depname;
    }

    public Set getUserimfos() {
        return this.userimfos;
    }
    
    public void setUserimfos(Set userimfos) {
        this.userimfos = userimfos;
    }

    public Set getAssetimfos() {
        return this.assetimfos;
    }
    
    public void setAssetimfos(Set assetimfos) {
        this.assetimfos = assetimfos;
    }

    public Set getAllocaimfosForOutdepid() {
        return this.allocaimfosForOutdepid;
    }
    
    public void setAllocaimfosForOutdepid(Set allocaimfosForOutdepid) {
        this.allocaimfosForOutdepid = allocaimfosForOutdepid;
    }

    public Set getAllocaimfosForIndepid() {
        return this.allocaimfosForIndepid;
    }
    
    public void setAllocaimfosForIndepid(Set allocaimfosForIndepid) {
        this.allocaimfosForIndepid = allocaimfosForIndepid;
    }
   








}