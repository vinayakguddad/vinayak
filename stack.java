package collectionlistpgm;

import java.util.Stack;

public class stack {
public static void main(String[] args) {
	Stack s=new Stack();
	s.push(25);
	s.push(56);
	s.push(true);
	s.push("sheela");
	s.push(56);
	s.push(20);
	//System.out.println(s.peek());    //peek will give last value but it will not removed in o/p
	
	System.out.println(s.pop());   //pop will give last value but it will remove in o/p
	System.out.println(s);
}
}
