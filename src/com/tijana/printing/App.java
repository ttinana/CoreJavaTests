/**
 * 
 */
package com.tijana.printing;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

import com.tijana.printing.excel.ExcelReaderToList;
import com.tijana.printing.excel.model.PrivredniSubjekat;

/**
 * @author ttinana
 *
 */
public class App {

	/**
	 * @param args
	 *            support for I/O comes from Java core API libraries not from
	 *            language keywords
	 */
	public static void main(String[] args) {
		try {
			// readChars();
			// readStringsLines();
			editor();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/*
	 * STREAM is an abstraction that produces or consumes information
	 * 
	 * Byte Stream(for binary data) InputStream OuputStrean
	 * 
	 * Character stream Reader Writer read() write()
	 * 
	 */
	/**
	 * read console input - chars
	 * 
	 * @throws IOException
	 */
	public static void readChars() throws IOException {
		char c;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("enter q to quit, enter characters");
		do {
			c = (char) br.read();
			System.out.println(c);
		} while (c != 'q');
	}

	/**
	 * read console input - lines
	 * 
	 * @throws IOException
	 */
	public static void readStringsLines() throws IOException {
		String line;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		do {
			line = br.readLine();
			System.out.println("T: " + line);

		} while (!line.equals("end"));

	}

	public static void editor() throws IOException {
		String[] arrayS = new String[100];
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		for (int i = 0; i < 100; i++) {
			arrayS[i] = br.readLine();
			if (arrayS[i].equals("stop"))
				break;
		}
		for (int i = 0; i < 100; i++) {
			if (arrayS[i].equals("stop"))
				break;
			System.out.println(arrayS[i]);
		}

	}

	public static void redFromFile(String fileName) throws IOException{
		int i;
		FileInputStream fin;
		fin= new FileInputStream(fileName);
		do{
			i=fin.read();
			if(i !=-1) System.out.println((char) i);
		}while(i!=-1);
	}
	public static void propsFloat() {
		System.out.println(Math.getExponent(Float.MAX_VALUE));
		System.out.println(Math.getExponent(Float.MIN_NORMAL));
		System.out.println(Math.getExponent(Float.MIN_VALUE));
		System.out.println(Math.getExponent(Float.MAX_EXPONENT));
		System.out.println(Math.getExponent(Float.MIN_EXPONENT));

	}

	public static void printExcel() {
		String excelFilePath = "F:\\logs\\apr.xlsx";
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
