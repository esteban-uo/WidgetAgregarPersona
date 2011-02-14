package com.prueba.widgetagregarpersonas.vista.controlador;

import java.util.List;

import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.inject.Inject;
import com.prueba.widgetagregarpersonas.client.entidades.Persona;
import com.prueba.widgetagregarpersonas.client.rpc.IServicioPersonasAsync;
import com.prueba.widgetagregarpersonas.vista.controlador.contratos.IControladorLista;
import com.prueba.widgetagregarpersonas.vista.controlador.contratos.IControladorPrincipal;

public class ControladorPrincipal implements IControladorPrincipal{
	
	
	IServicioPersonasAsync _proveedorPersonas;
	IControladorLista _generadorLista;
	
	@Inject
	public ControladorPrincipal(IServicioPersonasAsync proveedorPersona, IControladorLista generadorLista) {
		this._proveedorPersonas = proveedorPersona;
		this._generadorLista = generadorLista;
		cargarPersonas();
	}
	
	@Override
	public void cargarPersonas(){
		_proveedorPersonas.obtenerPersonas(new AsyncCallback<List<Persona>>() {
			
			@Override
			public void onSuccess(List<Persona> result) {
				// TODO Auto-generated method stub
				_generadorLista.llenarListaPersonas(result);
			}
			
			@Override
			public void onFailure(Throwable caught) {
					// TODO Auto-generated method stub
				
			}
		});
		// TODO Auto-generated method stub
		
	}

	@Override
	public void nuevaPersona() {
		// TODO Auto-generated method stub
		
	}

}
