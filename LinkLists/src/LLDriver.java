
public class LLDriver {

	public static void main(String[] args) {
		LinkedList myList = new LinkedList();
		
		myList.insert(2);
		myList.insert(9);
		myList.insert(23);
		myList.insert(73);
		myList.insert(42);
		myList.insertHead(12);
		myList.insertAt(118, 3);
		myList.show();
		myList.remove(3);

		myList.show();

	}

}
