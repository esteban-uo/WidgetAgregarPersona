package com.prueba.widgetagregarpersonas.client.rpc;

import java.util.List;

import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;
import com.prueba.widgetagregarpersonas.client.entidades.Persona;

@RemoteServiceRelativePath("serverpersonas")
public interface IServicioPersonas extends RemoteService {
	List<Persona> obtenerPersonas();
	boolean agregarPersona(Persona persona);
}
