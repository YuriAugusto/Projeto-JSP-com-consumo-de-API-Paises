package com.brq.internet.projetojspbase.dto;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class PaisDTO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@JsonProperty("flag")
	private String bandeira;
	
	@JsonProperty("translations")
	private NomePaisDTO nomeNaoTraduzido;
	
	@JsonProperty("nativeName")
	private String nomeNativo;
	
	private String capital;
    
    @JsonProperty("population")
    private int populacao;
    
    @JsonProperty("currencies")
    private List<MoedaDTO> moeda;

	public String getBandeira() {
		return bandeira;
	}

	public void setBandeira(String bandeira) {
		this.bandeira = bandeira;
	}

	public NomePaisDTO getNomeNaoTraduzido() {
		return nomeNaoTraduzido;
	}

	public void setNomeNaoTraduzido(NomePaisDTO nomeNaoTraduzido) {
		this.nomeNaoTraduzido = nomeNaoTraduzido;
	}

	public String getNomeNativo() {
		return nomeNativo;
	}

	public void setNomeNativo(String nomeNativo) {
		this.nomeNativo = nomeNativo;
	}

	public String getCapital() {
		return capital;
	}

	public void setCapital(String capital) {
		this.capital = capital;
	}

	public int getPopulacao() {
		return populacao;
	}

	public void setPopulacao(int populacao) {
		this.populacao = populacao;
	}

	public List<MoedaDTO> getMoeda() {
		return moeda;
	}

	public void setMoeda(List<MoedaDTO> moeda) {
		this.moeda = moeda;
	}

	@Override
	public String toString() {
		return "PaisDTO [bandeira=" + bandeira + ", nomeNaoTraduzido=" + nomeNaoTraduzido + ", nomeNativo=" + nomeNativo
				+ ", capital=" + capital + ", populacao=" + populacao + ", moeda=" + moeda + "]";
	}
	
}
