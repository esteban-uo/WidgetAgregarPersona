package com.prueba.widgetagregarpersonas.client.vista.controlador.contratos;

import java.util.List;

import com.prueba.widgetagregarpersonas.client.entidades.Persona;
import com.prueba.widgetagregarpersonas.client.vista.contratos.IListaDelegado;

public interface IControladorLista {
	void llenarListaPersonas(List<Persona> personas);
	void setListaDelegado(IListaDelegado listaDelegado);
	void insertarPersona(Persona persona);
}
