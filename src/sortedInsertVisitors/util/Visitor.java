package sortedInsertVisitors.util;

/**
 * interface for visitor
 */
public interface Visitor {
	
	/**
	 * visit method for visitor pattern
	 * @param myVector
	 */
	void visit(MyVector myVector);
	
	/**
	 * visit method for visitor pattern
	 * @param myArray
	 */
	void visit(MyArray myArray);
}
