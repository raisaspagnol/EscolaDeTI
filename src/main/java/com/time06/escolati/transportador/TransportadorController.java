package com.time06.escolati.transportador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/transportador")
public class TransportadorController {
	
	@Autowired
	private TransportadorService transportadorService;
	
	@RequestMapping(method=RequestMethod.GET)
	public List<Transportador> GetAll()
	{
		return transportadorService.GestAll();
	}

}
