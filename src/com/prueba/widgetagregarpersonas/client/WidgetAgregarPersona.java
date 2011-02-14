package com.prueba.widgetagregarpersonas.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.ui.RootPanel;
import com.prueba.widgetagregarpersonas.client.utilidades.InyectorGin;

public class WidgetAgregarPersona implements EntryPoint {

	public void onModuleLoad() {
		InyectorGin injector = GWT.create(InyectorGin.class);
		RootPanel.get().add(injector.getUILista());
	}
}
