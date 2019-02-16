/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.crunchify.jsp.servlet;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author andre
 */
public class Conexion 
{
  public static Connection getConnection() throws SQLException{
    try {
 
        Class.forName("org.postgresql.Driver");
         Connection conexion = DriverManager.getConnection(
            "jdbc:postgresql://ec2-23-21-86-22.compute-1.amazonaws.com:5432/d970s3enu4pvjj?ssl=true&sslfactory=org.postgresql.ssl.NonValidatingFactory",
            "bqtmstpjmwydkx", "f27260e1776cbc0838ba7000028257478bc591a9245bf2efef837945d4a8b997");
 
        if(conexion != null)
        {
                System.out.println("Conexion Exitosa");
                return conexion;
        }
 
    } catch (ClassNotFoundException e) {
        e.printStackTrace();
    }
      return null;
}
}
