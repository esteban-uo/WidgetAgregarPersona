package com.prueba.widgetagregarpersonas.server;

import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.List;

import com.google.gwt.user.server.rpc.RemoteServiceServlet;
import com.google.inject.Singleton;
import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import com.mongodb.Mongo;
import com.mongodb.MongoException;
import com.prueba.widgetagregarpersonas.client.entidades.Persona;
import com.prueba.widgetagregarpersonas.client.rpc.IServicioPersonas;

@Singleton
public class ServicioPersonasMongo extends RemoteServiceServlet implements IServicioPersonas{

	private static final long serialVersionUID = 1L;
	
	private DB hacerConexion(){
		Mongo m;
		DB db;
		try {
			m = new Mongo( "localhost" );
			db= m.getDB("Personas");
			db.authenticate("root" , "root".toCharArray());
		} catch (UnknownHostException e) {
			e.printStackTrace();
			return null;
		} catch (MongoException e) {
			e.printStackTrace();
			return null;
		}
		return db;
	}
	
	@Override
	public List<Persona> obtenerPersonas() {
		DB db = hacerConexion();
		  DBCollection personas = db.getCollection("Persona");
		  DBCursor dbcursor = personas.find();
		  List<Persona> listaPersonas = new ArrayList<Persona>();
		  while(dbcursor.hasNext())
		  {
			  DBObject persona = dbcursor.next();
			  Persona p = new Persona();
			  p.setNombre(persona.get("nombre").toString());
			  p.setEdad(persona.get("edad").toString());
			  listaPersonas.add(p); 
		  }
		return listaPersonas;
	}

	@Override
	public Persona agregarPersona(String nombre) {
		DB db = hacerConexion();
		DBCollection coll = db.getCollection("Persona");
		BasicDBObject doc = new BasicDBObject();
		doc.put("nombre", nombre);
		doc.put("edad", 20);
		coll.insert(doc);
		Persona per = new Persona();
		per.setNombre(nombre);
		return per;
	}

}
