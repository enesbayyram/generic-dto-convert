package com.enesbayram.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;


@NoArgsConstructor
@AllArgsConstructor
@ToString
public class DtoJFIlac {

	private String barkod;
	
	private Double eczsts;
	
	private Double sgksts;

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
}
