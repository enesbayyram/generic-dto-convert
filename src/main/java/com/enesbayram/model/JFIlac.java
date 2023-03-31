package com.enesbayram.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@NoArgsConstructor
@AllArgsConstructor
public class JFIlac {
	
	private Integer ilacId;
	
	private String barkod;
	
	private Double eczsts;
	
	private Double sgksts;
	
	private String ilacAdi;

	public Integer getIlacId() {
		return ilacId;
	}

	public void setIlacId(Integer ilacId) {
		this.ilacId = ilacId;
	}

	public String getBarkod() {
		return barkod;
	}

	public void setBarkod(String barkod) {
		this.barkod = barkod;
	}

	public Double getEczsts() {
		return eczsts;
	}

	public void setEczsts(Double eczsts) {
		this.eczsts = eczsts;
	}

	public Double getSgksts() {
		return sgksts;
	}

	public void setSgksts(Double sgksts) {
		this.sgksts = sgksts;
	}

	public String getIlacAdi() {
		return ilacAdi;
	}

	public void setIlacAdi(String ilacAdi) {
		this.ilacAdi = ilacAdi;
	}

}
