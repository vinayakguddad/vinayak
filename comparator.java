package collectionlistpgm;

import java.util.Arrays;
import java.util.Comparator;

final class tester{
	String name;
	double salary;
	tester(String name,double salary){
		super();
		this.name=name;
		this.salary=salary;
	}
}
 class cool implements Comparator{
		public int compare(Object o1,Object o2) {
			tester s1=(tester)o1;
			tester s2=(tester)o2;
			return s1.name.compareTo(s2.name);
		}
	}





public class comparator {
public static void main(String[] args) {
	tester s1=new tester("rocky",7388.23);
	tester s2=new tester("hi",6352.63);
	tester s3=new tester("hello",866.46);
	tester arr[]= {s1,s2,s3};
	Arrays.sort(arr,new cool());
	for (tester z : arr) {
		System.out.println(z.salary+" "+z.name);
	}
}
}
