package com.designpattern.facade;

import java.sql.Connection;

public class OracleHelper {

	public static Connection getOracleDBConnection(){
		//get Oracle DB connection using connection parameters
		return null;
	}
	
	public String generateOraclePDFReport(String tableName, Connection con){
		//get data from table and generate pdf report
		return "get data from table and generate Oraclepdf report";
	}
	
	public String generateOracleHTMLReport(String tableName, Connection con){
		return "get data from table and generate Oracle HTML report";
	}
}
