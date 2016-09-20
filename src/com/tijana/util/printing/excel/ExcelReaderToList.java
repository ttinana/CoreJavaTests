/**
 * 
 */
package com.tijana.util.printing.excel;

/**
 * @author ttinana
 *
 */
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.tijana.util.printing.PrivredniSubjekat;

public class ExcelReaderToList {

	public List<PrivredniSubjekat> readPrivredniSubjekatFromExcel(String excelFilePath) throws IOException {
		List<PrivredniSubjekat> listPS = new ArrayList<PrivredniSubjekat>();
		FileInputStream inputStream = new FileInputStream(new File(excelFilePath));

		Workbook workbook = new XSSFWorkbook(inputStream);
		Sheet firstSheet = workbook.getSheetAt(0);
		Iterator<Row> iterator = firstSheet.iterator();

		while (iterator.hasNext()) {
			Row nextRow = iterator.next();
			Iterator<Cell> cellIterator = nextRow.cellIterator();
			PrivredniSubjekat ps = new PrivredniSubjekat();

			while (cellIterator.hasNext()) {
				Cell nextCell = cellIterator.next();
				int columnIndex = nextCell.getColumnIndex();

				switch (columnIndex) {
				case 0:
					ps.setMb((String) getCellValue(nextCell).toString());
					break;
				case 1:
					ps.setTip((String) getCellValue(nextCell).toString());
					break;
				}

			}
			listPS.add(ps);
		}

		workbook.close();
		inputStream.close();

		return listPS;
	}

	private Object getCellValue(Cell cell) {
		switch (cell.getCellType()) {
		case Cell.CELL_TYPE_STRING:
			return cell.getStringCellValue();

		case Cell.CELL_TYPE_BOOLEAN:
			return cell.getBooleanCellValue();

		case Cell.CELL_TYPE_NUMERIC:
			return cell.getNumericCellValue();

		case Cell.CELL_TYPE_ERROR:
			return cell.getErrorCellValue();

		case Cell.CELL_TYPE_BLANK:
			return "";
		}

		return null;
	}

}
