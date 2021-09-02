package excelFiles;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import javax.security.auth.Subject;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class WritingExcelFiles {

    public static void main(String[] args) throws IOException {

        XSSFWorkbook xssfWorkbook = new XSSFWorkbook();
        XSSFSheet sheet0 = xssfWorkbook.createSheet("firstSheet");
        XSSFSheet sheet1 = xssfWorkbook.createSheet("secondSheet");
        /* Row row0 = sheet0.createRow(0);
        Cell cellA = row0.createCell(0);
        Cell cellB = row0.createCell(1);

        cellA.setCellValue("firstCell");
        cellB.setCellValue("secondCell"); */

        Row row0 = sheet0.createRow(0);

        Cell cellA = row0.createCell(0);
        Cell cellB = row0.createCell(1);
        Cell cellC = row0.createCell(2);
        Cell cellD = row0.createCell(3);
        cellA.setCellValue("RollNo");
        cellB.setCellValue("Science");
        cellC.setCellValue("English");
        cellD.setCellValue("Maths");

        for(int rows = 1; rows<5; rows++){
            Row row = sheet0.createRow(rows);
            Cell cellRoll = row.createCell(0);
            cellRoll.setCellValue(rows);

            for(int cols = 1; cols<4; cols++){
                Cell cell = row.createCell(cols);
                cell.setCellValue((int)(Math.random()*1000));

            }

        }

        //stream connectivity

        File file = new File("C:\\astha\\FileWriting\\mySecondExcel1.xlsx");
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        xssfWorkbook.write(fileOutputStream);

        //closing the stream
        fileOutputStream.close();

        System.out.println("\nExcel created !!!");

        

    }
}
