/* Programming Fundamentals 
 * Antonio Brown 
 * Programming Assignment 4 - Set ADT
 */

public class Set {

	LinkedNode exampleNode;

	// adds the integer x to the collection. The resulting collection should not
	// contain any duplicate values

	public void add(int x) {
		if (!exists(x)) {
			LinkedNode setNode = new LinkedNode(x);
			setNode.next = exampleNode;
			exampleNode = setNode;
		}

	}

	// – deletes the integer x from the set.
	public void delete(int x) {
		if (!exists(x)) {
			return;
		}
		LinkedNode deleteInt = exampleNode;
		LinkedNode keepInt = null;

		if (!exists(x)) {
			return;
		}

		if (deleteInt.x == x) {
			exampleNode = deleteInt.next;
			return;
		}

		// keeps nodes that are not equal to delete
		while (deleteInt.x != x) {
			keepInt = deleteInt;
			deleteInt = deleteInt.next;

		}

		keepInt.next = deleteInt.next;

	}

	// Reads the input and determines if the integer is linked and returns true or
	// false
	public boolean exists(int x) {
		if (exampleNode == null) {
			return false;
		}
		LinkedNode keepInt = exampleNode;

		while (keepInt != null) {
			if (keepInt.x == x) {
				return true;
			}
			keepInt = keepInt.next;
		}
		return false;
	}

	// returns a string representing the set as a space separated list
	public String toString() {

		String nodeString = "";

		LinkedNode deleteInt = exampleNode;
		while (deleteInt != null) {
			nodeString += deleteInt.x + " ";
			deleteInt = deleteInt.next;
		}
		return nodeString;
	}
}