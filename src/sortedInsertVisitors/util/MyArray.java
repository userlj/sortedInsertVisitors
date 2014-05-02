package sortedInsertVisitors.util;

import java.util.ArrayList;

/**
 * ADT MyArray
 */
public class MyArray {
	
	private ArrayList<Integer> arrList;
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
	 * @return the arrList
	 */
	public ArrayList<Integer> getArrList() {
		return arrList;
	}

	/**
	 * constructor
	 */
	public MyArray() {
		arrList = new ArrayList<Integer>();
	}
	
	/**
	 * accept method for visitor pattern
	 * @param visitor
	 */
	public void accept(Visitor visitor) {
		visitor.visit(this);
	}
	
	/**
	 * display arraylist
	 */
	public void display() {
		System.out.println(arrList);
	}
	
}
