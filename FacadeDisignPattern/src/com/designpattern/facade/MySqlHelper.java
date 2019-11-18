package com.designpattern.facade;

import java.sql.Connection;

public class MySqlHelper {

	
	public static Connection getMySqlDBConnection(){
		//get MySql DB connection using connection parameters
		return null;
	}
	
	public String generateMySqlPDFReport(String tableName, Connection con){
		//get data from table and generate pdf report
		
		return "MySQLPDFReport generatede";
	}
	
	public String generateMySqlHTMLReport(String tableName, Connection con){
		//get data from table and generate pdf report
		
		return "get data from table and generate MysqlHTML report";
	}
}
