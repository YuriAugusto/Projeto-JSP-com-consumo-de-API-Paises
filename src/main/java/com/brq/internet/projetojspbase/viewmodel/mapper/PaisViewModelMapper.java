package com.brq.internet.projetojspbase.viewmodel.mapper;

import java.util.ArrayList;
import java.util.List;

import com.brq.internet.projetojspbase.dto.PaisDTO;
import com.brq.internet.projetojspbase.viewmodel.PaisViewModel;

public class PaisViewModelMapper {

	public static List<PaisViewModel> from (List<PaisDTO> dto){
		List<PaisViewModel> listaDePaises = new ArrayList<>();
		
		for (PaisDTO paisDTO : dto) {//paisDTO item : dto lista
			
			PaisViewModel pais = new PaisViewModel();
			
			pais.setBandeira(paisDTO.getBandeira());
			pais.setNomeTraduzido(paisDTO.getNomeNaoTraduzido().getNomeTraduzido());
			pais.setNomeNativo(paisDTO.getNomeNativo());
			pais.setCapital(paisDTO.getCapital());
			pais.setPopulacao(paisDTO.getPopulacao());
			pais.setCodigoMoeda(paisDTO.getMoeda().get(0).getCodigoMoeda());//private List<MoedaDTO> moeda; é uma lista
			pais.setNomeMoeda(paisDTO.getMoeda().get(0).getNomeMoeda());//de um único objeto
			pais.setSimboloMoeda(paisDTO.getMoeda().get(0).getSimboloMoeda());//por isso o index 0 foi buscado
			
			listaDePaises.add(pais);
		}
		return listaDePaises;
	}
	
}
