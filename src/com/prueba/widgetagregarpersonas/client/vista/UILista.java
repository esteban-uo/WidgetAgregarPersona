package com.prueba.widgetagregarpersonas.client.vista;

import com.google.gwt.core.client.GWT;
import com.google.gwt.dom.client.Document;
import com.google.gwt.dom.client.Element;
import com.google.gwt.dom.client.LIElement;
import com.google.gwt.dom.client.UListElement;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.Widget;
import com.prueba.widgetagregarpersonas.client.entidades.Persona;
import com.prueba.widgetagregarpersonas.client.vista.contratos.IListaDelegado;

public class UILista extends Composite implements IListaDelegado {

	private static UIListaUiBinder uiBinder = GWT.create(UIListaUiBinder.class);

	interface UIListaUiBinder extends UiBinder<Widget, UILista> {
	}
	
	@UiField
	Button botonAgregar;
	@UiField
    UListElement listaPersonas;
	@UiField
	TextBox inputPersonas;

	public UILista() {
		initWidget(uiBinder.createAndBindUi(this));
		botonAgregar.setText("Agregar Persona");
	}

	

	@UiHandler("botonAgregar")
	void onClick(ClickEvent e) {
		
	}

	@Override
	public void limpiarLista() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void asignarPersona(Persona persona) {
		listaPersonas.appendChild(crearItem(persona.getNombre()));
	}
	
	private Element crearItem(String valor){
		LIElement result = Document.get().createLIElement();
		result.setInnerHTML(valor);
		return result;
	}
}
