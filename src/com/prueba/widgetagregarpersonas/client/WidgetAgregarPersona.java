package com.prueba.widgetagregarpersonas.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.ui.RootPanel;
import com.prueba.widgetagregarpersonas.client.utilidades.InyectorGin;
import com.prueba.widgetagregarpersonas.vista.UILista;

public class WidgetAgregarPersona implements EntryPoint {
	
	private final InyectorGin injector = GWT.create(InyectorGin.class);

	public void onModuleLoad() {
		UILista uiLista = injector.getUILista();
		RootPanel.get().add(uiLista);
	}
}
