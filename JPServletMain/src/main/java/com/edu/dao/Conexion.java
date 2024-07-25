package com.edu.dao;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

public class Conexion {
	
	protected static Connection con;
	
	public static Connection conectar() {
		if (con != null) {
			return con;
		}
		
		//
		InputStream inputStream =  Conexion.class.getClassLoader().getResourceAsStream("db.properties");
		Properties properties =  new Properties();
		
		try {
			properties.load(inputStream);
			String driver =  properties.getProperty("driver");
			String url =  properties.getProperty("url");
			String user = properties.getProperty("user");
			String password =  properties.getProperty("password");
			Class.forName(driver);  //comprabacion del driver
			
			con =DriverManager.getConnection(url,user,password);
			System.out.println("Enlace Establecido");
		}catch(Exception e) {
			e.printStackTrace();
			System.out.println("no se conecto ");
		}
		return con;
	}
	
	//
	public static void desconectar() {
		
		if(con == null) {
			return;
		}
		
		try {
			con.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	

}
