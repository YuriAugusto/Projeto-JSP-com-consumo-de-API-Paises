package com.brq.internet.projetojspbase.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import com.brq.internet.projetojspbase.dto.PaisDTO;
import com.brq.internet.projetojspbase.helper.PaisViewModelHelper;
import com.brq.internet.projetojspbase.service.impl.BuscaPaisesImpl;
import com.brq.internet.projetojspbase.viewmodel.PaisViewModel;
import com.brq.internet.projetojspbase.viewmodel.mapper.PaisViewModelMapper;


@Controller
@RequestMapping("/home")
public class DetalhesController {
	
	@Autowired
	BuscaPaisesImpl buscaImpl;

	@RequestMapping(value = "/detalhes/{idPais}", method = RequestMethod.GET)
	public ModelAndView exibiDetalhesJsp(ModelAndView model, @PathVariable String idPais) {
		
		List<PaisDTO> retornaResponse = buscaImpl.retornaResponse();//consome API
		
		List<PaisViewModel> listaDePaises = PaisViewModelMapper.from(retornaResponse);//lista de PaisViewModel após parse
		
		//realizo busca por id (getNomeTraduzido())
		PaisViewModel paisBuscadoPorId = PaisViewModelHelper.buscaPaisPorId(listaDePaises, idPais);

		model.addObject("detalhesPais", paisBuscadoPorId);//atribuo o paisBuscadoPorId para view
		model.setViewName("detalhes");
		
		return model;
	}
	
}
