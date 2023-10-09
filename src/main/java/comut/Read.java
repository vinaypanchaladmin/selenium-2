package comut;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.DataProvider;

public class Read {
	
   public WebDriver driver ;
   Row row ;
   org.apache.poi.ss.usermodel.Cell cell ;
   @DataProvider(name="hello")
   public Object[][] reader() throws IOException{
	   File f = new File("./data/userdata.xlsx");
	   FileInputStream fis = new FileInputStream(f);
	   XSSFWorkbook w =  new XSSFWorkbook(fis);
	    XSSFSheet s = w.getSheet("userdata.xlsx");
	   int nor = s.getPhysicalNumberOfRows()	;
	   int noc = s.getRow(0).getPhysicalNumberOfCells();
	   
	   Object data [][] = new Object[nor][noc];
	   for(int i=1;i<=nor-1;i++) {
		   for(int j=0;j<noc-1;j++) {
			   row = s.getRow(i);
			   cell = row.getCell(j);
			   if(cell.getCellType()==CellType.STRING) {
				   data[i][j]= cell ;
				   
			   }
			   else if(cell.getCellType()==CellType.NUMERIC) {
				   data[i][j] = String.valueOf(cell.getNumericCellValue());
			   }
			   
			   
		   }
	   }
	return data;
	   
	   
	   
	   
	   
   }

}
