package utiliTies;

import java.io.IOException;

import org.testng.annotations.DataProvider;

public class DataProviders {

	//DataProvider 1
	
	@DataProvider(name="LoginData")
	public String [][] getData() throws IOException
	{
		String path=".\\testData\\Copy of Opencart_LoginData.xlsx";
		ExcelUtility xlutil=new ExcelUtility(path);
		
		int totalrows=xlutil.getRowCount("Sheet1");	
		int totalcols=xlutil.getCellCount("Sheet1",1);
				
		String logindata[][]=new String[totalrows][totalcols];
		
		for(int rowsindex=1;rowsindex<=totalrows;rowsindex++) 
		{		
			for(int cloumnindex=0;cloumnindex<totalcols;cloumnindex++)  
			{
				logindata[rowsindex-1][cloumnindex]= xlutil.getCellData("Sheet1",rowsindex, cloumnindex);  
			}
		}
	return logindata;
				
	}
	
	//DataProvider 2
	
	//DataProvider 3
	
	//DataProvider 4
}
