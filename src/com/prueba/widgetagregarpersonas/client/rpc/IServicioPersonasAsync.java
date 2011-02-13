package com.prueba.widgetagregarpersonas.client.rpc;

import java.util.List;

import com.google.gwt.user.client.rpc.AsyncCallback;
import com.prueba.widgetagregarpersonas.client.entidades.Persona;

public interface IServicioPersonasAsync {

	void agregarPersona(Persona persona, AsyncCallback<Boolean> callback);

	void obtenerPersonas(AsyncCallback<List<Persona>> callback);

}
