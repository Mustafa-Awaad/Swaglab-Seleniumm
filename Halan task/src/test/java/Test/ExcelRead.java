package Test;

import org.apache.poi.ss.util.CellUtil;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExcelRead {

    static FileInputStream fis=null;
    public FileInputStream getFileInputStream() throws FileNotFoundException {
        File file= new File("C:\\Users\\Lenovo\\IdeaProjects\\Halan task\\Datafile.xlsx");
        FileInputStream fis = new FileInputStream(file);
        return fis;
    }

    public Object[][] getExcelData() throws IOException {
        fis=getFileInputStream();
        XSSFWorkbook wb= new XSSFWorkbook(fis);
        XSSFSheet sheet= wb.getSheetAt(0);
        int ttlnoofRows = (sheet.getLastRowNum()+1);
        int ttlnoofColo = 2;

        String [][] arrayExcelData= new String[ttlnoofRows][2];
        for (int i=0; i<ttlnoofRows;i++){
            for (int j=0; j<2;j++){
                XSSFRow row= sheet.getRow(i);
                arrayExcelData[i][j]= CellUtil.getCell(row,j).toString();
               // arrayExcelData[i][j]= row.getCell(j).toString();
            }
        }
        wb.close();
        return arrayExcelData;
    }
}

