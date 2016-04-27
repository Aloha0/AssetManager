package com.model;



/**
 * Assetrepairimfo entity. @author MyEclipse Persistence Tools
 */

public class Assetrepairimfo  implements java.io.Serializable {


    // Fields    

     private Integer assetrepairid;
     private Userimfo userimfo;
     private Assetimfo assetimfo;
     private String damagecondition;
     private Float repaircost;
     private Integer arestate;
     private Integer earlierstate;


    // Constructors

    /** default constructor */
    public Assetrepairimfo() {
    }

    
    /** full constructor */
    public Assetrepairimfo(Userimfo userimfo, Assetimfo assetimfo, String damagecondition, Float repaircost, Integer arestate, Integer earlierstate) {
        this.userimfo = userimfo;
        this.assetimfo = assetimfo;
        this.damagecondition = damagecondition;
        this.repaircost = repaircost;
        this.arestate = arestate;
        this.earlierstate = earlierstate;
    }

   
    // Property accessors

    public Integer getAssetrepairid() {
        return this.assetrepairid;
    }
    
    public void setAssetrepairid(Integer assetrepairid) {
        this.assetrepairid = assetrepairid;
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

    public String getDamagecondition() {
        return this.damagecondition;
    }
    
    public void setDamagecondition(String damagecondition) {
        this.damagecondition = damagecondition;
    }

    public Float getRepaircost() {
        return this.repaircost;
    }
    
    public void setRepaircost(Float repaircost) {
        this.repaircost = repaircost;
    }

    public Integer getArestate() {
        return this.arestate;
    }
    
    public void setArestate(Integer arestate) {
        this.arestate = arestate;
    }

    public Integer getEarlierstate() {
        return this.earlierstate;
    }
    
    public void setEarlierstate(Integer earlierstate) {
        this.earlierstate = earlierstate;
    }
   








}