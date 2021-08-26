package com.brq.internet.projetojspbase.service.impl;

import java.util.List;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.GenericType;
import javax.ws.rs.core.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.brq.internet.projetojspbase.dto.PaisDTO;
import com.brq.internet.projetojspbase.service.BuscaPaises;

@Service
public class BuscaPaisesImpl implements BuscaPaises{

	
	@Autowired
	private WebTarget webTarget;
	
	@Override
	public List<PaisDTO> retornaResponse() {
		Response response = webTarget
			.queryParam("language", "pt-BR")
			.request()
			.get();		
		return response.readEntity(new GenericType<List<PaisDTO>>() {});

		
	}

}
