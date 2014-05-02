package sortedInsertVisitors.util;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * reads from the input file and returns one integer every time the nextInt() method is called
 */
public class FileProcessor {

	private String fileName;
	private BufferedReader reader;
	
	/**
	 * @return the fileName
	 */
	public String getFileName() {
		return fileName;
	}

	/**
	 * @param fileName the fileName to set
	 */
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	/**
	 * empty constructor
	 */
	public FileProcessor() {}
	
	/**
	 * constructor
	 * @param fileName
	 */
	public FileProcessor(String fileName) {
		this.fileName = fileName;
	}
	
	/**
	 * open input file
	 * @param fileName
	 * @throws Exception
	 */
	public void openFile() throws Exception {
		if(fileName != null) {
			reader = new BufferedReader(new FileReader(fileName));
		} else {
			throw new IllegalArgumentException("File name cannot be null.");
		}
	}
	
	/**
	 * close input file
	 * @throws IOException
	 */
	public void closeFile() throws IOException {
		if(fileName != null) {
			reader.close();
		}
	}
	
	/**
	 * return an integer from input file
	 * @return next integer in file
	 * @throws Exception
	 */
	public Integer nextInt() throws Exception {
		String line = reader.readLine();
		Integer retVal = null;
		
		if (line != null) {
			retVal = Integer.parseInt(line);
		}
		return retVal;
	}
}
