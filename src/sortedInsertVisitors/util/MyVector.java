package sortedInsertVisitors.util;

import java.util.Vector;

/**
 * ADT MyVector
 */
public class MyVector {
	
	private Vector<Integer> vector;
	private int unsortedElem;
	
	/**
	 * @return the unsortedElem
	 */
	public int getUnsortedElem() {
		return unsortedElem;
	}

	/**
	 * @param unsortedElem the unsortedElem to set
	 */
	public void setUnsortedElem(int unsortedElem) {
		this.unsortedElem = unsortedElem;
	}

	/**
	 * constructor
	 */
	public MyVector () {
		vector = new Vector<Integer>();
	}
	
	/**
	 * accept method for visitor pattern
	 * @param visitor
	 */
	public void accept(Visitor visitor) {
		visitor.visit(this);
	}
	
	/**
	 * @return the vector
	 */
	public Vector<Integer> getVector() {
		return vector;
	}

	/**
	 * display vector
	 */
	public void display() {
		System.out.println(vector);
	}
}
