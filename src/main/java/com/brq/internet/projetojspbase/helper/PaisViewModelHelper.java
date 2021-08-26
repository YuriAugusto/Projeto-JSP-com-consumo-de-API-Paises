package com.brq.internet.projetojspbase.helper;

import java.text.Normalizer;
import java.util.Comparator;
import java.util.List;

import com.brq.internet.projetojspbase.viewmodel.PaisViewModel;

public class PaisViewModelHelper {

	public static PaisViewModel buscaPaisPorId(List<PaisViewModel> listaDePaises, String idPais) {
		PaisViewModel pais = new PaisViewModel();
		
		for (PaisViewModel itemLista : listaDePaises) {
				//verifico cada item da lista com base no "nome" e "idPais"
			if (itemLista.getNomeTraduzido().equals(idPais)) {
				
				pais.setBandeira(itemLista.getBandeira());
				pais.setNomeTraduzido(itemLista.getNomeTraduzido());
				pais.setNomeNativo(itemLista.getNomeNativo());
				pais.setCapital(itemLista.getCapital());
				pais.setPopulacao(itemLista.getPopulacao());
				pais.setCodigoMoeda(itemLista.getCodigoMoeda());
				pais.setNomeMoeda(itemLista.getNomeMoeda());
				pais.setSimboloMoeda(itemLista.getSimboloMoeda());
				
				return pais;
			}
		}
		return pais;
	}

	public static List<PaisViewModel> ordenaLista(List<PaisViewModel> listaDePaises) {
		
//		para cada item (pais) o nome é recuperado, transformado em lowercase 
//		e os acentos são removidos antes da ordenação ocorrer
		listaDePaises.sort(Comparator.comparing(pais -> removeAcento(pais.getNomeTraduzido().toLowerCase())));
//		faz comparação lexicográfica 
		return listaDePaises;//retorno a lista ordenada e com acentuação
	}
	
	private static String removeAcento(String src) {
		return Normalizer
				.normalize(src, Normalizer.Form.NFD)
				.replaceAll("[^\\p{ASCII}]", "");
	}

}
