/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compitotepgestione;

import java.sql.*;
import java.sql.DriverManager;

/**
 *
 * @author david
 */
public class JavaToSQL_LIB {
	Connection con;
	
	public JavaToSQL_LIB(String ip, String utente, String password, int porta, String db) throws ClassNotFoundException, SQLException{
		Class.forName("com.mysql.jdbc.Driver");
		con = DriverManager.getConnection(
            "jdbc:mysql://"+ip+ ":"+porta+"/"+db, utente, password);
	}
    public void aggiungi(String nomeTable, String Campi, String Valori) {
        try {
                      
            Statement stmt = con.createStatement();
            try{
                stmt.executeUpdate("INSERT INTO " + nomeTable + "(" + Campi + ")" + "VALUES(" + Valori + ")");
            }catch(SQLException es){
                System.out.println(es);
                stmt.execute("CREATE TABLE riparazione (nome VARCHAR(20) NOT NULL, cognome VARCHAR(20) NOT NULL, object VARCHAR(20) NOT NULL, codice VARCHAR(20) PRIMARY KEY, email VARCHAR(20) NOT NULL);");
                stmt.executeUpdate("INSERT INTO " + nomeTable + "(" + Campi + ")" + "VALUES(" + Valori + ")");
            }
            
            
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }

    public ResultSet visualizza(String nomeTable) {
        ResultSet rs = null;
        try {
            
            Statement stmt = con.createStatement();
            rs = stmt.executeQuery("select * from " + nomeTable);
        } catch (Exception ex) {
            System.out.println(ex);
        }
        return rs;
    }
    
    public void delete(String nomeTable, String condizione) {
        try {
            
            Statement stmt = con.createStatement();
            stmt.executeUpdate("DELETE FROM "+ nomeTable + "WHERE (" + condizione + ")");
            
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }

    public ResultSet Cerca(String campi, String nomeTable)
    //Effettua il cerca di determinati
    // campi di una tabella e ne returna il risultato dato i campi e il suo nome passato per parametro
    {
        ResultSet rs = null;
        try {
            
            Statement stmt = con.createStatement();
            rs = stmt.executeQuery("select " + campi + "from " + nomeTable);

        } catch (Exception ex) {
            System.out.println(ex);
        }
        return rs;
    }

    public ResultSet Cerca_Tutto(String nomeTable)//Effetua il cerca
    //"completo" di una tabella dato il suo nome passato come parametro 
    {
        ResultSet rs = null;
        try {
            Statement stmt = con.createStatement();
            rs = stmt.executeQuery("select * from " + nomeTable);
        } catch (Exception ex) {
            System.out.println(ex);
        }
        return rs;
    }

    public ResultSet Cerca_Condizione(String campi,String nomeTable, String Condizione)
    //Effettua il cerca in base ad una condizione
    //di determinati campi di una tabella data  ne returna il risultato dato  i campi 
    //e il suo nome passato per parametro
    {
        ResultSet rs = null;
        try {            
            Statement stmt = con.createStatement();
            System.out.println("select " + campi + " from " + nomeTable + " where (" + Condizione + ");");
            rs =(ResultSet)stmt.executeQuery("select " + campi + "from " + nomeTable + "where (" + Condizione + ");");
        } catch (Exception ex) {
            System.out.println(ex);
        }
        return rs;
    }
}
