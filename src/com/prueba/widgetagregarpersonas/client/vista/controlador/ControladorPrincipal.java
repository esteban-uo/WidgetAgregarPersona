package com.prueba.widgetagregarpersonas.client.vista.controlador;

import java.util.List;

import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.inject.Inject;
import com.prueba.widgetagregarpersonas.client.entidades.Persona;
import com.prueba.widgetagregarpersonas.client.rpc.IServicioPersonasAsync;
import com.prueba.widgetagregarpersonas.client.vista.controlador.contratos.IControladorLista;
import com.prueba.widgetagregarpersonas.client.vista.controlador.contratos.IControladorPrincipal;

public class ControladorPrincipal implements IControladorPrincipal {
	@Inject IServicioPersonasAsync _servicioPersonas;
	@Inject IControladorLista _controladorLista;
	
	@Override
	public void cargarPersonas(){
		_servicioPersonas.obtenerPersonas(new AsyncCallback<List<Persona>>() {
			
			@Override
			public void onSuccess(List<Persona> result) {
				_controladorLista.llenarListaPersonas(result);
			}
			
			@Override
			public void onFailure(Throwable caught) {
				Window.alert("Error en obtencion");	
			}
		});
	}
}
