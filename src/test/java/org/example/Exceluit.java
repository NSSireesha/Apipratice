package org.example;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.util.Iterator;

public class Exceluit {
    public static void main(String[] args) {

        FileInputStream fis = new FileInputStream("\"C:\\Users\\sireesha_narakuchi\\OneDrive - EPAM\\Pictures\\exceldata.xlsx");

        XSSFWorkbook workbook= new XSSFWorkbook();

       int count= workbook.getNumberOfSheets();

       for (int i=0; i<count; i++)
       {
           if (workbook.getSheetName(i).equalsIgnoreCase("sheet1"))
           {
               XSSFSheet sheet =workbook.getSheetAt(i);

               Iterator<Row> rows =sheet.iterator();


               Row firstrow= rows.next();

               Iterator<Cell> cell= firstrow.cellIterator();

               int k=0;
               int column;
               while(cell. hasNext())
               {
                 Cell value=  cell.next();

                if (value.getStringCellValue().equalsIgnoreCase("Testcase"))
                {
                    column=k;
                }
               }
               k++;

               while(rows.hasNext())
               {
                   Row r= rows.next();

                 if(  r.getCell(k).getStringCellValue().equalsIgnoreCase("purchase"))
                 {
                     System.out.println(r.);
                 }
               }
           }
       }
    }
}
