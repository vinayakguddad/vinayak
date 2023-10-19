package collectionlistpgm;

import java.util.PriorityQueue;

public class priorityqueue {
public static void main(String[] args) {
	PriorityQueue p=new PriorityQueue();
//	p.add(26);
//	p.add(25);
//	p.add(2);
//	p.add(100);
//	p.add(86);
//	p.add(3);
    p.add("mala");
	p.add("vinnu");
	p.add("parimala");
	
	
	//System.out.println(p.peek());   //peek will give first value in that o/p, but it will not remove in o/p
	System.out.println(p.poll());    //poll will give first value removed in o/p
	System.out.println(p);
}
}
