package common.excel;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

import common.Employee;

public class EmployeeExcelWriter {

   public void xlsWriter(List<Employee> list) {

      HSSFWorkbook workbook = new HSSFWorkbook(); // 엑셀 만들기
      HSSFSheet sheet = workbook.createSheet(); // 시트 만들기
      HSSFRow row = sheet.createRow(0); // 첫번째 행
      HSSFCell cell; // 셀

      cell = row.createCell(0); // 첫번째 행의 첫번째 칼럼
      cell.setCellValue("EmployeeID");

      cell = row.createCell(1); // 두번째 칼럼
      cell.setCellValue("FirstName");

      cell = row.createCell(2);
      cell.setCellValue("LastName");

      cell = row.createCell(3);
      cell.setCellValue("Email");

      cell = row.createCell(4);
      cell.setCellValue("Salary");
      
      cell = row.createCell(5);
      cell.setCellValue("Jobid");

      Employee emp;

      for (int i = 0; i < list.size(); i++) {
         emp = list.get(i);
         row = sheet.createRow(i + 1);

         cell = row.createCell(0);
         cell.setCellValue(emp.getEmployeeId());

         cell = row.createCell(1);
         cell.setCellValue(emp.getFirstName());

         cell = row.createCell(2);
         cell.setCellValue(emp.getLastName());

         cell = row.createCell(3);
         cell.setCellValue(emp.getEmail());

         cell = row.createCell(4);
         cell.setCellValue(emp.getSalary());

         cell = row.createCell(5);
         cell.setCellValue(emp.getJobId());

      }

      File file = new File("employeeExcel.xls"); // 파일 생성
      FileOutputStream fos = null;

      try {
         fos = new FileOutputStream(file); // 파일을 밖으로 저장?
         workbook.write(fos);
      } catch (FileNotFoundException e) {
         e.printStackTrace();
      } catch (IOException e) {
            e.printStackTrace();
         } finally {
            try {
               if (workbook != null)
                  workbook.close();
               if (fos != null)
                  fos.close();
            } catch (IOException e) {
               e.printStackTrace();
            }


      }

   }

}