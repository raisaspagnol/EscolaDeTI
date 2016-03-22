package com.time06.escoladeti.solicitante;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/solicitante")
public class SolicianteController {
	
	@Autowired
	private SolicitanteService service;

}
