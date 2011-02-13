package com.prueba.widgetagregarpersonas.vista.controlador;

import java.util.List;

import com.prueba.widgetagregarpersonas.client.entidades.Persona;
import com.prueba.widgetagregarpersonas.vista.contratos.IListaDelegado;
import com.prueba.widgetagregarpersonas.vista.controlador.contratos.IControladorLista;

public class ControladorLista implements IControladorLista{
	
	IListaDelegado _listaDelegado; 
	
	public ControladorLista(IListaDelegado listaDelegado){
		this._listaDelegado = listaDelegado;
	}
	
	@Override
	public void llenarListaPersonas(List<Persona> personas) {
			_listaDelegado.limpiarLista();
			
			for(Persona persona : personas)
				_listaDelegado.asignarPersona(persona);
			
	}

}
