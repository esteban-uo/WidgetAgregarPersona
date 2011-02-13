package com.prueba.widgetagregarpersonas.client.utilidades;

import com.google.gwt.inject.client.GinModules;
import com.google.gwt.inject.client.Ginjector;
import com.prueba.widgetagregarpersonas.vista.UILista;


@GinModules(ModuloGin.class)
public interface InyectorGin extends Ginjector{
	UILista getUILista();
}
