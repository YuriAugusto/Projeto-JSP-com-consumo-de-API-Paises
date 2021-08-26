package com.brq.internet.projetojspbase.dto;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class NomePaisDTO implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@JsonProperty("br")
	private String nomeTraduzido;

	public String getNomeTraduzido() {
		return nomeTraduzido;
	}

	public void setNomeTraduzido(String nomeTraduzido) {
		this.nomeTraduzido = nomeTraduzido;
	}

	@Override
	public String toString() {
		return "NomePaisDTO [nomeTraduzido=" + nomeTraduzido + "]";
	}
	
}
