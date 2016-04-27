package com.model;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;


/**
 * Assetimfo entity. @author MyEclipse Persistence Tools
 */

public class Assetimfo  implements java.io.Serializable {


    // Fields    

     private Integer assetid;
     private AssetType assettype;
     private Userimfo userimfoByUserid;
     private Userimfo userimfoByAccounterid;
     private Checkdetail checkdetail;
     private Depimfo depimfo;
     private Integer keeperid;
     private String cardid;
     private Integer stockstate;
     private Integer isaccouted;
     private String size;
     private Integer usestate;
     private String assetname;
     private Date accountingdate;
     private String accountcode;
     private String assetcode;
     private Date basetime;
     private String uinit;
     private Integer number;
     private String note;
     private Float price;
     private Integer isprint;
     private String maker;
     private String supplier;
     private Set assetrebackimfos = new HashSet(0);
     private Set abolishimfos = new HashSet(0);
     private Set checkdetails = new HashSet(0);
     private Set assetdeliverlists = new HashSet(0);
     private Set allocaimfos = new HashSet(0);
     private Set assetrepairimfos = new HashSet(0);


    // Constructors

    /** default constructor */
    public Assetimfo() {
    }

    
    /** full constructor */
    public Assetimfo(AssetType assettype, Userimfo userimfoByUserid, Userimfo userimfoByAccounterid, Checkdetail checkdetail, Depimfo depimfo, Integer keeperid, String cardid, Integer stockstate, Integer isaccouted, String size, Integer usestate, String assetname, Date accountingdate, String accountcode, String assetcode, Date basetime, String uinit, Integer number, String note, Float price, Integer isprint, String maker, String supplier, Set assetrebackimfos, Set abolishimfos, Set checkdetails, Set assetdeliverlists, Set allocaimfos, Set assetrepairimfos) {
        this.assettype = assettype;
        this.userimfoByUserid = userimfoByUserid;
        this.userimfoByAccounterid = userimfoByAccounterid;
        this.checkdetail = checkdetail;
        this.depimfo = depimfo;
        this.keeperid = keeperid;
        this.cardid = cardid;
        this.stockstate = stockstate;
        this.isaccouted = isaccouted;
        this.size = size;
        this.usestate = usestate;
        this.assetname = assetname;
        this.accountingdate = accountingdate;
        this.accountcode = accountcode;
        this.assetcode = assetcode;
        this.basetime = basetime;
        this.uinit = uinit;
        this.number = number;
        this.note = note;
        this.price = price;
        this.isprint = isprint;
        this.maker = maker;
        this.supplier = supplier;
        this.assetrebackimfos = assetrebackimfos;
        this.abolishimfos = abolishimfos;
        this.checkdetails = checkdetails;
        this.assetdeliverlists = assetdeliverlists;
        this.allocaimfos = allocaimfos;
        this.assetrepairimfos = assetrepairimfos;
    }

   
    // Property accessors

    public Integer getAssetid() {
        return this.assetid;
    }
    
    public void setAssetid(Integer assetid) {
        this.assetid = assetid;
    }


    public AssetType getAssettype() {
		return assettype;
	}


	public void setAssettype(AssetType assettype) {
		this.assettype = assettype;
	}


	public Userimfo getUserimfoByUserid() {
        return this.userimfoByUserid;
    }
    
    public void setUserimfoByUserid(Userimfo userimfoByUserid) {
        this.userimfoByUserid = userimfoByUserid;
    }

    public Userimfo getUserimfoByAccounterid() {
        return this.userimfoByAccounterid;
    }
    
    public void setUserimfoByAccounterid(Userimfo userimfoByAccounterid) {
        this.userimfoByAccounterid = userimfoByAccounterid;
    }

    public Checkdetail getCheckdetail() {
        return this.checkdetail;
    }
    
    public void setCheckdetail(Checkdetail checkdetail) {
        this.checkdetail = checkdetail;
    }

    public Depimfo getDepimfo() {
        return this.depimfo;
    }
    
    public void setDepimfo(Depimfo depimfo) {
        this.depimfo = depimfo;
    }

    public Integer getKeeperid() {
        return this.keeperid;
    }
    
    public void setKeeperid(Integer keeperid) {
        this.keeperid = keeperid;
    }

    public String getCardid() {
        return this.cardid;
    }
    
    public void setCardid(String cardid) {
        this.cardid = cardid;
    }

    public Integer getStockstate() {
        return this.stockstate;
    }
    
    public void setStockstate(Integer stockstate) {
        this.stockstate = stockstate;
    }

    public Integer getIsaccouted() {
        return this.isaccouted;
    }
    
    public void setIsaccouted(Integer isaccouted) {
        this.isaccouted = isaccouted;
    }

    public String getSize() {
        return this.size;
    }
    
    public void setSize(String size) {
        this.size = size;
    }

    public Integer getUsestate() {
        return this.usestate;
    }
    
    public void setUsestate(Integer usestate) {
        this.usestate = usestate;
    }

    public String getAssetname() {
        return this.assetname;
    }
    
    public void setAssetname(String assetname) {
        this.assetname = assetname;
    }

    public Date getAccountingdate() {
        return this.accountingdate;
    }
    
    public void setAccountingdate(Date accountingdate) {
        this.accountingdate = accountingdate;
    }

    public String getAccountcode() {
        return this.accountcode;
    }
    
    public void setAccountcode(String accountcode) {
        this.accountcode = accountcode;
    }

    public String getAssetcode() {
        return this.assetcode;
    }
    
    public void setAssetcode(String assetcode) {
        this.assetcode = assetcode;
    }

    public Date getBasetime() {
        return this.basetime;
    }
    
    public void setBasetime(Date basetime) {
        this.basetime = basetime;
    }

    public String getUinit() {
        return this.uinit;
    }
    
    public void setUinit(String uinit) {
        this.uinit = uinit;
    }

    public Integer getNumber() {
        return this.number;
    }
    
    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getNote() {
        return this.note;
    }
    
    public void setNote(String note) {
        this.note = note;
    }

    public Float getPrice() {
        return this.price;
    }
    
    public void setPrice(Float price) {
        this.price = price;
    }

    public Integer getIsprint() {
        return this.isprint;
    }
    
    public void setIsprint(Integer isprint) {
        this.isprint = isprint;
    }

    public String getMaker() {
        return this.maker;
    }
    
    public void setMaker(String maker) {
        this.maker = maker;
    }

    public String getSupplier() {
        return this.supplier;
    }
    
    public void setSupplier(String supplier) {
        this.supplier = supplier;
    }

    public Set getAssetrebackimfos() {
        return this.assetrebackimfos;
    }
    
    public void setAssetrebackimfos(Set assetrebackimfos) {
        this.assetrebackimfos = assetrebackimfos;
    }

    public Set getAbolishimfos() {
        return this.abolishimfos;
    }
    
    public void setAbolishimfos(Set abolishimfos) {
        this.abolishimfos = abolishimfos;
    }

    public Set getCheckdetails() {
        return this.checkdetails;
    }
    
    public void setCheckdetails(Set checkdetails) {
        this.checkdetails = checkdetails;
    }

    public Set getAssetdeliverlists() {
        return this.assetdeliverlists;
    }
    
    public void setAssetdeliverlists(Set assetdeliverlists) {
        this.assetdeliverlists = assetdeliverlists;
    }

    public Set getAllocaimfos() {
        return this.allocaimfos;
    }
    
    public void setAllocaimfos(Set allocaimfos) {
        this.allocaimfos = allocaimfos;
    }

    public Set getAssetrepairimfos() {
        return this.assetrepairimfos;
    }
    
    public void setAssetrepairimfos(Set assetrepairimfos) {
        this.assetrepairimfos = assetrepairimfos;
    }
   








}