package excelFiles;

import org.apache.poi.ss.usermodel.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class ReadingExcel {
    public static void main(String[] args) throws IOException {

        //creating input Stream and chaining them
        File file = new File("C:\\astha\\FileWriting\\mySecondExcel1.xlsx");
        FileInputStream fi = new FileInputStream(file);
        Workbook workbook = WorkbookFactory.create(fi);
//        XSSFWorkbook workbook = new XSSFWorkbook(fi);

        //calling sheet, rows and cells
        Sheet sheet0 = workbook.getSheetAt(0);
//        XSSFRow row = sheet0.createRow(0);


//        Row row0 = sheet0.getRow(0);
//        Cell cell0 = row0.getCell(0);
//        System.out.println(cell0);

        for(Row row :sheet0){

            for(Cell cell :row){
                Row row1 = row;

                switch (cell.getCellType()){

                    case NUMERIC:
                        System.out.print(cell.getNumericCellValue() + "\t");
                        break;

                    case STRING:
                        System.out.print(cell.getStringCellValue() + "\t");
                        break;

                    case BLANK:
                        System.out.print("The cell is blank" + "\t");
                        break;

                }
            }

            System.out.println();
        }

        System.out.println("File read successfully!!!");
        workbook.close();
    }
}
