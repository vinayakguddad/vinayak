package collectionlistpgm;

import java.util.ArrayList;

public class removeAll {
    

	public static void main(String[] args) {
		ArrayList a1=new ArrayList();
		a1.add(20);
		a1.add(25);
		a1.add(true);
		ArrayList a2=new ArrayList();
		a2.add(20);
		a2.add(25);
		a2.add(false);
		a2.add(true);
		a1.removeAll(a2);
		System.out.println(a1);
		//System.out.println(a2);
	}
}
