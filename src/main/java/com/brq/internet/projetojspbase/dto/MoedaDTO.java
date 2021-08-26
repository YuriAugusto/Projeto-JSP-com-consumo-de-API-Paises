package com.brq.internet.projetojspbase.dto;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class MoedaDTO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@JsonProperty("code")
	private String codigoMoeda;
	
	@JsonProperty("name")
	private String nomeMoeda;
	
	@JsonProperty("symbol")
	private String simboloMoeda;

	public String getCodigoMoeda() {
		return codigoMoeda;
	}

	public void setCodigoMoeda(String codigoMoeda) {
		this.codigoMoeda = codigoMoeda;
	}

	public String getNomeMoeda() {
		return nomeMoeda;
	}

	public void setNomeMoeda(String nomeMoeda) {
		this.nomeMoeda = nomeMoeda;
	}

	public String getSimboloMoeda() {
		return simboloMoeda;
	}

	public void setSimboloMoeda(String simboloMoeda) {
		this.simboloMoeda = simboloMoeda;
	}

	@Override
	public String toString() {
		return "MoedaDTO [codigoMoeda=" + codigoMoeda + ", nomeMoeda=" + nomeMoeda + ", simboloMoeda=" + simboloMoeda
				+ "]";
	}

}
