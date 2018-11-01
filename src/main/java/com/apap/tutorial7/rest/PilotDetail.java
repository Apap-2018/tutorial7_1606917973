package com.apap.tutorial7.rest;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

//Pilot Detail

@JsonIgnoreProperties(ignoreUnknown = true)
public class PilotDetail {

	private String status;
	
	@JsonProperty("valid-until")
	private Date validUntil;
	
	public void setStatus(String status) {
		this.status = status;
	}
	
	public void setValidUntil(Date alidUntil) {
		this.validUntil = validUntil;
	}
	
	public String getStatus() {
		return status;
	}
	
	
	public Date getValidUntil() {
		return validUntil;
	}
}
