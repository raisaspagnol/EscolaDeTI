package com.time06.escoladeti;
import java.util.UUID;

import javax.persistence.Id;

public class ModeloBase {

	@Id
	private  String id;
	private int codigo;
	
	
	public String getId() {
		this.id = UUID.randomUUID().toString();
		return id;
	}
	public int getCodigo() {
		return codigo;
	}
}
