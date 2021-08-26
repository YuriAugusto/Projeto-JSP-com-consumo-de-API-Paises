package com.brq.internet.projetojspbase.viewmodel;

import java.io.Serializable;

public class PaisViewModel implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String bandeira;

	private String nomeTraduzido;
	
	private String nomeNativo;
	
	private String capital;
	
    private int populacao;
    
    private String codigoMoeda;
    
    private String nomeMoeda;
    
    private String simboloMoeda;
    
	public String getBandeira() {
		return bandeira;
	}

	public void setBandeira(String bandeira) {
		this.bandeira = bandeira;
	}

	public String getNomeTraduzido() {
		return nomeTraduzido;
	}

	public void setNomeTraduzido(String nomeTraduzido) {
		this.nomeTraduzido = nomeTraduzido;
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
		return "PaisViewModel [bandeira=" + bandeira + ", nomeTraduzido=" + nomeTraduzido + ", nomeNativo=" + nomeNativo
				+ ", capital=" + capital + ", populacao=" + populacao + ", codigoMoeda=" + codigoMoeda + ", nomeMoeda="
				+ nomeMoeda + ", simboloMoeda=" + simboloMoeda + "]";
	}

}
