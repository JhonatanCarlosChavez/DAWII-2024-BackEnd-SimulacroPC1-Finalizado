package com.centroinformacion.service;

import java.util.List;

import com.centroinformacion.entity.Editorial;

public interface EditorialService {

	public abstract Editorial insertaActualizaEditorial(Editorial obj);
	public abstract List<Editorial> listaEditorial();
}
