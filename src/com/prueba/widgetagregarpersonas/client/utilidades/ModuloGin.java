package com.prueba.widgetagregarpersonas.client.utilidades;

import com.google.gwt.inject.client.AbstractGinModule;
import com.google.inject.Singleton;
import com.prueba.widgetagregarpersonas.client.vista.UILista;
import com.prueba.widgetagregarpersonas.client.vista.contratos.IListaDelegado;
import com.prueba.widgetagregarpersonas.client.vista.controlador.ControladorLista;
import com.prueba.widgetagregarpersonas.client.vista.controlador.ControladorPrincipal;
import com.prueba.widgetagregarpersonas.client.vista.controlador.contratos.IControladorLista;
import com.prueba.widgetagregarpersonas.client.vista.controlador.contratos.IControladorPrincipal;

public class ModuloGin extends AbstractGinModule{

	@Override
	protected void configure() {
		bind(UILista.class).in(Singleton.class);
		bind(ControladorPrincipal.class).in(Singleton.class);
		bind(ControladorLista.class).in(Singleton.class);
		
		bind(IListaDelegado.class).to(UILista.class);
		bind(IControladorPrincipal.class).to(ControladorPrincipal.class);
		bind(IControladorLista.class).to(ControladorLista.class);
	}

}
