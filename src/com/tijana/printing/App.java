/**
 * 
 */
package com.tijana.printing;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

import com.tijana.printing.excel.ExcelReaderToList;
import com.tijana.printing.excel.SimpleExcelReader;
import com.tijana.printing.excel.model.PrivredniSubjekat;

/**
 * @author ttinana
 *
 */
public class App {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String excelFilePath = "D:\\a\\apr.xlsx";
		try {
			// SimpleExcelReader.redExcel(excelFilePath);

			ExcelReaderToList reader = new ExcelReaderToList();
			List<PrivredniSubjekat> lps = reader.readPrivredniSubjekatFromExcel(excelFilePath);
			for (PrivredniSubjekat ps : lps) {
				System.out.println(ps.getMb() + " " + ps.getTip());

			}
			System.out.println("hello");

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
