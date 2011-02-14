package com.prueba.widgetagregarpersonas.server;

import java.util.ArrayList;
import java.util.List;

import com.google.gwt.user.server.rpc.RemoteServiceServlet;
import com.google.inject.Singleton;
import com.prueba.widgetagregarpersonas.client.entidades.Persona;
import com.prueba.widgetagregarpersonas.client.rpc.IServicioPersonas;

@Singleton
public class ServicioPersonas extends RemoteServiceServlet implements IServicioPersonas{
	private static final long serialVersionUID = 1L;

	@Override
	public List<Persona> obtenerPersonas() {
		List<Persona> p = new ArrayList<Persona>();
		Persona a = new Persona();
		a.setNombre("Persona 1");
		
		Persona b = new Persona();
		b.setNombre("Persona 2");
		p.add(a);
		p.add(b);
		return p;
	}

	@Override
	public boolean agregarPersona(Persona persona) {
		// TODO Auto-generated method stub
		return true;
	}

}
