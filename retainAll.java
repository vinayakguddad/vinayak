package collectionlistpgm;

import java.util.ArrayList;

public class retainAll {
   public static void main(String[] args) {
	ArrayList a1=new ArrayList();
	a1.add(10);
	a1.add(20.5);
	//a1.add(10);
	a1.add(1000.80);
	a1.add("rocky");
	a1.add('a');
  ArrayList a2=new ArrayList();
  a2.add(10);
  a2.add("rocky");
  a2.add(true);
  //a2.add('a');
  a2.add(1000.80);
  a2.add(false);
  a1.retainAll(a2);
  System.out.println(a1);
  System.out.println(a2);
  
}
}
