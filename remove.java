package collectionlistpgm;

import java.util.ArrayList;

public class remove {
    public static void main(String[] args) {
		ArrayList a=new ArrayList();
		System.out.println(a.isEmpty());
		a.add(20);
		a.add(30);
		a.add("vinnu");
		
		//a.remove("vinnu");
		a.remove(2);
		System.out.println(a.size());
	}
}
