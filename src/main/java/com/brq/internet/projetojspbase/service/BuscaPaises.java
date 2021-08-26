package com.brq.internet.projetojspbase.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.brq.internet.projetojspbase.dto.PaisDTO;


@Service
public interface BuscaPaises {
	
	public List<PaisDTO> retornaResponse();

}
