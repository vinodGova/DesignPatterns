package com.designpattern.facade;



import java.sql.Connection;

public class HelperFacade {

	public static String generateReport(DBTypes dbType, ReportTypes reportType, String tableName){
		Connection con = null;
		String response=null;
		switch (dbType){
		case MYSQL: 
			con = MySqlHelper.getMySqlDBConnection();
			MySqlHelper mySqlHelper = new MySqlHelper();
			switch(reportType){
			case HTML:
				response=mySqlHelper.generateMySqlHTMLReport(tableName, con);
			
				break;
			case PDF:
				response=mySqlHelper.generateMySqlPDFReport(tableName, con);
				break;
			}
			break;
		case ORACLE: 
			con = OracleHelper.getOracleDBConnection();
			OracleHelper oracleHelper = new OracleHelper();
			switch(reportType){
			case HTML:
				response=oracleHelper.generateOracleHTMLReport(tableName, con);
				break;
			case PDF:
				response=oracleHelper.generateOraclePDFReport(tableName, con);
				break;
			}
			break;
		}
		return response;
	}
	
	public static enum DBTypes{
		MYSQL,ORACLE;
	}
	
	public static enum ReportTypes{
		HTML,PDF;
	}
}

