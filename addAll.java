package collectionlistpgm;

import java.util.ArrayList;

public class addAll {
  public static void main(String[] args) {
	 ArrayList a=new ArrayList();
	 a.add(25);
	 a.add(1.25);
	 a.add(25);
	 a.add(null);
	 ArrayList a1=new ArrayList();
	 a1.add(45);
	 a1.add("vinnu");
	 System.out.println(a);
      System.out.println(a1);
      System.out.println("************");
      a.addAll(2,a1);
      System.out.println(a);
}
}
