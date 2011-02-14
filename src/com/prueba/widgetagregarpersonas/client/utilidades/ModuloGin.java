package com.prueba.widgetagregarpersonas.client.utilidades;

import com.google.gwt.inject.client.AbstractGinModule;
import com.prueba.widgetagregarpersonas.client.vista.UILista;
import com.prueba.widgetagregarpersonas.client.vista.contratos.IListaDelegado;

public class ModuloGin extends AbstractGinModule{

	@Override
	protected void configure() {
		bind(IListaDelegado.class).to(UILista.class);
	}

}
