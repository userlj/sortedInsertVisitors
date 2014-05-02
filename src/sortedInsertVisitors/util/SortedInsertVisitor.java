package sortedInsertVisitors.util;

import java.util.List;

/**
 * SortedInsertVisitor
 */
public class SortedInsertVisitor implements Visitor {

	@Override
	public void visit(MyVector myVector) {
		sortedInsert(myVector);
	}

	@Override
	public void visit(MyArray myArray) {
		sortedInsert(myArray);
	}
	
	/**
	 * inserts in the correct spot
	 * @param adt
	 */
	private void sortedInsert(Object adt) {
		
		List<Integer> list = null;
		int unsortedElem = 0;
		
		if(adt instanceof MyVector) {
			list = ((MyVector) adt).getVector();
			unsortedElem = ((MyVector) adt).getUnsortedElem();
		} else if (adt instanceof MyArray) {
			list = ((MyArray) adt).getArrList(); 
			unsortedElem = ((MyArray) adt).getUnsortedElem(); 
		}
		
		/* sorted insert algorithm here */
		int size = list.size();
		for (int i=0; i<size; i++) {
			if (list.get(i) > unsortedElem) {
				list.add(i, unsortedElem);
				break;
			}
		}
		if (list.size() == size) {
			list.add(unsortedElem);
		}
		
	}

}
