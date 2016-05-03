package com.model;

import java.util.HashSet;
import java.util.Set;

/**
 * PAssetType entity. @author MyEclipse Persistence Tools
 */

public class AssetType implements java.io.Serializable {

	// Fields

	private Integer id;
	private AssetType pretype;
	private String typenum;
	private String name;
	private String prename;
	private Set<AssetType> sontypes = new HashSet(0);

	// Constructors

	/** default constructor */
	public AssetType() {
	}
	
	public AssetType(int _id) {
		id = _id;
	}

	/** full constructor */
	public AssetType(AssetType PAssetType, String typenum, String name,
			String prename, Set PAssetTypes) {
		this.pretype = PAssetType;
		this.typenum = typenum;
		this.name = name;
		this.prename = prename;
		this.sontypes = PAssetTypes;
	}
	
	
	// Property accessors

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public AssetType getPretype() {
		return pretype;
	}

	public void setPretype(AssetType pretype) {
		this.pretype = pretype;
	}

	public String getTypenum() {
		return typenum;
	}

	public void setTypenum(String typenum) {
		this.typenum = typenum;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPrename() {
		return prename;
	}

	public void setPrename(String prename) {
		this.prename = prename;
	}

	public Set<AssetType> getSontypes() {
		return sontypes;
	}

	public void setSontypes(Set<AssetType> sontypes) {
		this.sontypes = sontypes;
	}



}