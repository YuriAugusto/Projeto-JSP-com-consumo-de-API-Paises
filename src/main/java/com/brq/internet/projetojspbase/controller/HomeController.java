package com.brq.internet.projetojspbase.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import com.brq.internet.projetojspbase.dto.PaisDTO;
import com.brq.internet.projetojspbase.helper.PaisViewModelHelper;
import com.brq.internet.projetojspbase.service.impl.BuscaPaisesImpl;
import com.brq.internet.projetojspbase.viewmodel.PaisViewModel;
import com.brq.internet.projetojspbase.viewmodel.mapper.PaisViewModelMapper;

@Controller
public class HomeController {

	@Autowired
	BuscaPaisesImpl buscaPaises;

	@RequestMapping(value = "/home", method = RequestMethod.GET)
	public ModelAndView retornaHomeSemOrdenacao(ModelAndView model) {

		List<PaisDTO> retornaResponse = buscaPaises.retornaResponse();//consome API
		
		List<PaisViewModel> listaDePaises = PaisViewModelMapper.from(retornaResponse);//lista de PaisViewModel após parse

		model.addObject("listaDePaises", listaDePaises);//atribuo a lista a view
		model.setViewName("homepaises");
		
		return model;
	}
	
	@RequestMapping(value = "/homeOrdenada", method = RequestMethod.GET)
	public ModelAndView retornaHomeComOrdenacao(ModelAndView model) {
	
		List<PaisDTO> retornaResponse = buscaPaises.retornaResponse();//consome API
		
		List<PaisViewModel> listaDePaises = PaisViewModelMapper.from(retornaResponse);//lista de PaisViewModel após parse
		
		//lista de PaisViewModel após ordenação
		List<PaisViewModel> listaOrdenada = PaisViewModelHelper.ordenaLista(listaDePaises);
		
		model.addObject("listaDePaises", listaOrdenada);//atribuo a lista ordenada a view
		model.setViewName("homepaises");
		
		return model;
	}
	
}
