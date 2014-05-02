package sortedInsertVisitors.util;

/**
 * check validation of command line argument
 */
public class ArgChecker implements Checker {

	@Override
	public void check(String[] args) {
		
		if (args.length != 1) {
			System.err.println("Please input a file name as argument!");
			System.exit(1);
		}
		
		if (args[0] == null || args[0].length() == 0) {
			System.err.println("File name cannot be null or empty string, and yours is "+args[0]+"!");
			System.exit(1);
		}
	}

}
