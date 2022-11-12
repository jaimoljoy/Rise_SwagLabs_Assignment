package Excel;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Rise_SwagLabs_ExcelHandling
{
    public String getCellValue(String path, String sheetName, int row, int cell)
    {
        String value = "";
        try
        {
            FileInputStream fis = new FileInputStream(path);
            Workbook wb = WorkbookFactory.create(fis);
            value = wb.getSheet(sheetName).getRow(row).getCell(cell).toString();
        }
        catch (Exception e) {
            e.printStackTrace();
        }

        return value;
    }

    public XSSFSheet getExcelSheet(String filePath, String sheetName)
    {
        XSSFSheet sheet = null;
        try
        {
            File file = new File(filePath);
            FileInputStream fis = new FileInputStream(file);
            XSSFWorkbook workbook = new XSSFWorkbook(fis);
            sheet=workbook.getSheet(sheetName);
        }
        catch (Exception ex)
        {
            ex.printStackTrace();
        }
        return sheet;

    }

    public void setCellvalue(String path,String sheetName, int row, int cell,String value)
    {
        try
        {
            File file = new File(path);
            FileInputStream fis = new FileInputStream(file);
            XSSFWorkbook workbook=new XSSFWorkbook(fis);
            workbook.getSheet(sheetName).createRow(row).createCell(cell).setCellValue(value);
            FileOutputStream fos = new FileOutputStream(file);
            workbook.write(fos);
            workbook.close();
        }
        catch (Exception ex)
        {
            ex.printStackTrace();
        }
    }


}