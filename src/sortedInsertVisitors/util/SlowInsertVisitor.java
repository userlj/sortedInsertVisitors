package sortedInsertVisitors.util;

import java.util.Collections;
import java.util.List;

/**
 * SlowInsertVisitor
 */
public class SlowInsertVisitor implements Visitor {

	@Override
	public void visit(MyVector myVector) {
		slowInsert(myVector);
	}

	@Override
	public void visit(MyArray myArray) {
		slowInsert(myArray);
	}

	/**
	 *  adds an element to the end of the data structure and calls
	 *  a sorting algorithm to sort the entire data each time.
	 * @param adt
	 */
	private void slowInsert(Object adt) {
		
		List<Integer> list = null;
		int unsortedElem = 0;
		
		if(adt instanceof MyVector) {
			list = ((MyVector) adt).getVector();
			unsortedElem = ((MyVector) adt).getUnsortedElem();
		} else if (adt instanceof MyArray) {
			list = ((MyArray) adt).getArrList(); 
			unsortedElem = ((MyArray) adt).getUnsortedElem(); 
		}
		
		list.add(unsortedElem);
		Collections.sort(list);
	}
}
