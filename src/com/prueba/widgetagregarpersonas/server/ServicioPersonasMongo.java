package com.prueba.widgetagregarpersonas.server;

import java.net.UnknownHostException;
import java.util.List;
import java.util.Set;

import com.google.gwt.user.server.rpc.RemoteServiceServlet;
import com.prueba.widgetagregarpersonas.client.entidades.Persona;
import com.prueba.widgetagregarpersonas.client.rpc.IServicioPersonas;
import com.mongodb.Mongo;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.BasicDBObject;
import com.mongodb.DBObject;
import com.mongodb.DBCursor;
import com.mongodb.MongoException;

public class ServicioPersonasMongo extends RemoteServiceServlet implements IServicioPersonas{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public ServicioPersonasMongo(){
		
	}
	
	private DB hacerConexion(){
		Mongo m;
		try {
			m = new Mongo( "localhost" );
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		} catch (MongoException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
		return m.getDB("Personas");
	}
	
	@Override
	public List<Persona> obtenerPersonas() {
		DB db = hacerConexion();
		String myUserName = "";
		
		char[] myPassword = null;
		
		boolean auth = db.authenticate(myUserName , myPassword );
		
		return null;
	}

	@Override
	public Persona agregarPersona(String nombre) {
		// TODO Auto-generated method stub
		return null;
	}
	
	/**
	 * @param args
	 */
	public static void main(String ...args )
	{
		ServicioPersonasMongo con = new ServicioPersonasMongo();
		DB db = con.hacerConexion();	
		boolean auth = db.authenticate("root" , "root".toCharArray());
		System.out.println(auth);
		
		Set<String> colls = db.getCollectionNames();

		for (String s : colls) {
		    System.out.println(s);
		}
		
	}

}
