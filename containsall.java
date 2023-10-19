package collectionlistpgm;

import java.util.ArrayList;

public class containsall {
   public static void main(String[] args) {
	ArrayList a=new ArrayList();
	a.add(20);
	a.add(30);
	a.add(true);
	a.add(25);
	a.add(1000);
	ArrayList a1=new ArrayList();
	a1.add(20);
	a1.add(30);
	a1.add(true);
//	a1.add(2000);
	System.out.println(a.containsAll(a1));
}
}
