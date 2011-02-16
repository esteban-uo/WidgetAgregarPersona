package com.prueba.widgetagregarpersonas.client.vista.controlador;

import java.util.List;

import com.prueba.widgetagregarpersonas.client.entidades.Persona;
import com.prueba.widgetagregarpersonas.client.vista.contratos.IListaDelegado;
import com.prueba.widgetagregarpersonas.client.vista.controlador.contratos.IControladorLista;

public class ControladorLista implements IControladorLista {
	
	IListaDelegado listaDelegado;
	
	@Override
	public void llenarListaPersonas(List<Persona> personas) {
			listaDelegado.limpiarLista();
			
			for(Persona persona : personas)
				listaDelegado.asignarPersona(persona);
	}

	@Override
	public void setListaDelegado(IListaDelegado listaDelegado) {
		this.listaDelegado = listaDelegado;
	}

}
