package com.prueba.widgetagregarpersonas.client.rpc;

import java.util.List;

import com.google.gwt.user.client.rpc.AsyncCallback;
import com.prueba.widgetagregarpersonas.client.entidades.Persona;

public interface IServicioPersonasAsync {


	void obtenerPersonas(AsyncCallback<List<Persona>> callback);

	void agregarPersona(String nombre, AsyncCallback<Persona> callback);

}
