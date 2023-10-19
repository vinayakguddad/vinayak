package collectionlistpgm;

import java.util.LinkedList;

public class linkedlist {
public static void main(String[] args) {
	LinkedList l=new LinkedList();
	l.add(25);
	l.add(56);
	l.add(100);
	l.add(20.30);
	l.add(25);
	//System.out.println(l.peek());    //peek will give first value but it will not remove in o/p
	
	System.out.println(l.poll());    //poll will also give first value but it will removed in o/p
	System.out.println(l);
}
}
