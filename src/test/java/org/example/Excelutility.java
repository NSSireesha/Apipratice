package org.example;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.xwpf.usermodel.ICell;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

public class Excelutility {

    public static void main(String[] args) throws IOException {


        FileInputStream fis = new FileInputStream("C:\\Users\\sireesha_narakuchi\\OneDrive - EPAM\\Pictures\\exceldata.xlsx");

        XSSFWorkbook workbook = new XSSFWorkbook(fis);

        int sheets= workbook.getNumberOfSheets();

        for (int i=0; i<sheets; i++) {
            if (workbook.getSheetName(i).equalsIgnoreCase("Sheet1")) {
                XSSFSheet sheet = workbook.getSheetAt(i);

                Iterator<Row> row = sheet.iterator();

                Row firstrow = row.next();

                Iterator<Cell> cell = firstrow.cellIterator();
                int k = 0;
                while (cell.hasNext()) {
                    Cell value = cell.next();
                    k = 0;
                    int column;
                    if (value.getStringCellValue().equalsIgnoreCase("Test case"))
                    {
                        column = k;
                    }
                }
                k++;
Row r=row.next();
if (r.getCell(k).getStringCellValue().equalsIgnoreCase("Purchase"))
{
    Iterator <Cell> c=r.cellIterator();
    while(c.hasNext())
    {
       Cell value1= cell.next();
       System.out.println(value1.getStringCellValue());
    }
}
            }

        }

    }
}

