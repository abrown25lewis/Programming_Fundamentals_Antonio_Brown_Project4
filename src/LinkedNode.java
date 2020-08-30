/* Programming Fundamentals 
 * Antonio Brown 
 * Programming Assignment 4 - Set ADT
 */

// This is the LinkedNode example provided
// It sets up the nodes to be used be the other classes
public class LinkedNode {
	int x; // The data value
	LinkedNode next; // Reference to the next LinkedNode

	// Default constructor
	LinkedNode() {
		next = null;
	}

	// Constructor that initializes the data value
	LinkedNode(int x) {
		this.x = x;
	}

}
