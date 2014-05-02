package sortedInsertVisitors.driver;

import java.io.IOException;

import sortedInsertVisitors.util.ArgChecker;
import sortedInsertVisitors.util.Checker;
import sortedInsertVisitors.util.FileProcessor;
import sortedInsertVisitors.util.MyArray;
import sortedInsertVisitors.util.MyVector;
import sortedInsertVisitors.util.SlowInsertVisitor;
import sortedInsertVisitors.util.SortedInsertVisitor;
import sortedInsertVisitors.util.Visitor;

/**
 * driver class
 */
public class Driver {
	
	public static void main(String[] args){
		
		Checker argChecker = new ArgChecker();
		argChecker.check(args);
		
		String fileName = args[0];
		FileProcessor fileProcessor = new FileProcessor(fileName);

		// Create two instances of each of the two ADTs
		MyVector vectorSortedInsert = new MyVector();
		MyVector vectorSlowInsert = new MyVector();
		MyArray arraySortedInsert = new MyArray();
		MyArray arraySlowInsert = new MyArray();

		// each visitor is applied to a different instance
		Visitor sortedInsertVisitor = new SortedInsertVisitor();
		Visitor slowInsertVisitor =  new SlowInsertVisitor();
		
		try {
			fileProcessor.openFile();
			Integer nextI = null;
			
			while((nextI = fileProcessor.nextInt()) != null) {
				
				vectorSortedInsert.setUnsortedElem(nextI);
				vectorSortedInsert.accept(sortedInsertVisitor);
				
				vectorSlowInsert.setUnsortedElem(nextI);
				vectorSlowInsert.accept(slowInsertVisitor);
				
				arraySortedInsert.setUnsortedElem(nextI);
				arraySortedInsert.accept(sortedInsertVisitor);
				
				arraySlowInsert.setUnsortedElem(nextI);
				arraySlowInsert.accept(slowInsertVisitor);
				
			}
			
			System.out.print("vector-sorted insert:\t");
			vectorSortedInsert.display();
			
			System.out.print("vector-slow insert:\t");
			vectorSlowInsert.display();
			
			System.out.print("array-sorted insert:\t");
			arraySortedInsert.display();
			
			System.out.print("array-slow insert:\t");
			arraySlowInsert.display();
			
	
		} catch (Exception e) {
			System.err.println(e.getMessage());
			System.exit(1);
			
		} finally {
			
			try {
				fileProcessor.closeFile();
				
			} catch (IOException e) {
				System.err.println(e.getMessage());
				System.exit(1);
			}
		}
	}
}
