package com.model;

import java.util.HashSet;
import java.util.Set;


/**
 * Userimfo entity. @author MyEclipse Persistence Tools
 */

public class Userimfo  implements java.io.Serializable {


    // Fields    

     private Integer userid;
     private Depimfo depimfo;
     private Parimfo parimfo;
     private String username;
     private String pswd;
     private Integer uistate;
     private Integer gender;
     private Set allocaimfosForInenterid = new HashSet(0);
     private Set assetrepairimfos = new HashSet(0);
     private Set assetchecks = new HashSet(0);
     private Set assetdeliverlists = new HashSet(0);
     private Set assetimfosForAccounterid = new HashSet(0);
     private Set assetrebackimfosForRebackerid = new HashSet(0);
     private Set assetimfosForUserid = new HashSet(0);
     private Set allocaimfosForOutuserid = new HashSet(0);
     private Set abolishimfosForAbuserid = new HashSet(0);
     private Set assetimfosForUserid_1 = new HashSet(0);
     private Set assetrebackimfosForReceiverid = new HashSet(0);
     private Set abolishimfosForReviewerid = new HashSet(0);
     private Set assetdeliversForTransferid = new HashSet(0);
     private Set assetdeliversForAccepterid = new HashSet(0);


    // Constructors

    /** default constructor */
    public Userimfo() {
    }

    
    /** full constructor */
    public Userimfo(Depimfo depimfo, Parimfo parimfo, String username, String pswd, Integer uistate, Integer gender, Set allocaimfosForInenterid, Set assetrepairimfos, Set assetchecks, Set assetdeliverlists, Set assetimfosForAccounterid, Set assetrebackimfosForRebackerid, Set assetimfosForUserid, Set allocaimfosForOutuserid, Set abolishimfosForAbuserid, Set assetimfosForUserid_1, Set assetrebackimfosForReceiverid, Set abolishimfosForReviewerid, Set assetdeliversForTransferid, Set assetdeliversForAccepterid) {
        this.depimfo = depimfo;
        this.parimfo = parimfo;
        this.username = username;
        this.pswd = pswd;
        this.uistate = uistate;
        this.gender = gender;
        this.allocaimfosForInenterid = allocaimfosForInenterid;
        this.assetrepairimfos = assetrepairimfos;
        this.assetchecks = assetchecks;
        this.assetdeliverlists = assetdeliverlists;
        this.assetimfosForAccounterid = assetimfosForAccounterid;
        this.assetrebackimfosForRebackerid = assetrebackimfosForRebackerid;
        this.assetimfosForUserid = assetimfosForUserid;
        this.allocaimfosForOutuserid = allocaimfosForOutuserid;
        this.abolishimfosForAbuserid = abolishimfosForAbuserid;
        this.assetimfosForUserid_1 = assetimfosForUserid_1;
        this.assetrebackimfosForReceiverid = assetrebackimfosForReceiverid;
        this.abolishimfosForReviewerid = abolishimfosForReviewerid;
        this.assetdeliversForTransferid = assetdeliversForTransferid;
        this.assetdeliversForAccepterid = assetdeliversForAccepterid;
    }

   
    // Property accessors

    public Integer getUserid() {
        return this.userid;
    }
    
    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public Depimfo getDepimfo() {
        return this.depimfo;
    }
    
    public void setDepimfo(Depimfo depimfo) {
        this.depimfo = depimfo;
    }

    public Parimfo getParimfo() {
        return this.parimfo;
    }
    
    public void setParimfo(Parimfo parimfo) {
        this.parimfo = parimfo;
    }

    public String getUsername() {
        return this.username;
    }
    
    public void setUsername(String username) {
        this.username = username;
    }

    public String getPswd() {
        return this.pswd;
    }
    
    public void setPswd(String pswd) {
        this.pswd = pswd;
    }

    public Integer getUistate() {
        return this.uistate;
    }
    
    public void setUistate(Integer uistate) {
        this.uistate = uistate;
    }

    public Integer getGender() {
        return this.gender;
    }
    
    public void setGender(Integer gender) {
        this.gender = gender;
    }

    public Set getAllocaimfosForInenterid() {
        return this.allocaimfosForInenterid;
    }
    
    public void setAllocaimfosForInenterid(Set allocaimfosForInenterid) {
        this.allocaimfosForInenterid = allocaimfosForInenterid;
    }

    public Set getAssetrepairimfos() {
        return this.assetrepairimfos;
    }
    
    public void setAssetrepairimfos(Set assetrepairimfos) {
        this.assetrepairimfos = assetrepairimfos;
    }

    public Set getAssetchecks() {
        return this.assetchecks;
    }
    
    public void setAssetchecks(Set assetchecks) {
        this.assetchecks = assetchecks;
    }

    public Set getAssetdeliverlists() {
        return this.assetdeliverlists;
    }
    
    public void setAssetdeliverlists(Set assetdeliverlists) {
        this.assetdeliverlists = assetdeliverlists;
    }

    public Set getAssetimfosForAccounterid() {
        return this.assetimfosForAccounterid;
    }
    
    public void setAssetimfosForAccounterid(Set assetimfosForAccounterid) {
        this.assetimfosForAccounterid = assetimfosForAccounterid;
    }

    public Set getAssetrebackimfosForRebackerid() {
        return this.assetrebackimfosForRebackerid;
    }
    
    public void setAssetrebackimfosForRebackerid(Set assetrebackimfosForRebackerid) {
        this.assetrebackimfosForRebackerid = assetrebackimfosForRebackerid;
    }

    public Set getAssetimfosForUserid() {
        return this.assetimfosForUserid;
    }
    
    public void setAssetimfosForUserid(Set assetimfosForUserid) {
        this.assetimfosForUserid = assetimfosForUserid;
    }

    public Set getAllocaimfosForOutuserid() {
        return this.allocaimfosForOutuserid;
    }
    
    public void setAllocaimfosForOutuserid(Set allocaimfosForOutuserid) {
        this.allocaimfosForOutuserid = allocaimfosForOutuserid;
    }

    public Set getAbolishimfosForAbuserid() {
        return this.abolishimfosForAbuserid;
    }
    
    public void setAbolishimfosForAbuserid(Set abolishimfosForAbuserid) {
        this.abolishimfosForAbuserid = abolishimfosForAbuserid;
    }

    public Set getAssetimfosForUserid_1() {
        return this.assetimfosForUserid_1;
    }
    
    public void setAssetimfosForUserid_1(Set assetimfosForUserid_1) {
        this.assetimfosForUserid_1 = assetimfosForUserid_1;
    }

    public Set getAssetrebackimfosForReceiverid() {
        return this.assetrebackimfosForReceiverid;
    }
    
    public void setAssetrebackimfosForReceiverid(Set assetrebackimfosForReceiverid) {
        this.assetrebackimfosForReceiverid = assetrebackimfosForReceiverid;
    }

    public Set getAbolishimfosForReviewerid() {
        return this.abolishimfosForReviewerid;
    }
    
    public void setAbolishimfosForReviewerid(Set abolishimfosForReviewerid) {
        this.abolishimfosForReviewerid = abolishimfosForReviewerid;
    }

    public Set getAssetdeliversForTransferid() {
        return this.assetdeliversForTransferid;
    }
    
    public void setAssetdeliversForTransferid(Set assetdeliversForTransferid) {
        this.assetdeliversForTransferid = assetdeliversForTransferid;
    }

    public Set getAssetdeliversForAccepterid() {
        return this.assetdeliversForAccepterid;
    }
    
    public void setAssetdeliversForAccepterid(Set assetdeliversForAccepterid) {
        this.assetdeliversForAccepterid = assetdeliversForAccepterid;
    }
   








}