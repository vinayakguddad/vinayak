package collectionlistpgm;
//Write pgm for Comparable based upon name(first letter)

import java.util.Arrays;

class demo implements Comparable{
	String name;
	double salary;
	demo(String name,double salary){
	this.name=name;
	this.salary=salary;
	}
	@Override
	public int compareTo(Object o) {
	       demo s=(demo)o;
	  return (int) (this.salary-s.salary);     
	//	return this.name.compareTo(s.name);
	}
}




public class sample {
  public static void main(String[] args) {
	demo d1=new demo("abcd",75.5);
	demo d2=new demo("xyz",80.25);
	demo d3=new demo("zab",100.3);
	demo arr[]= {d1,d2,d3};
	Arrays.sort(arr);
	for(demo s:arr) {
		System.out.println(s.salary+" "+s.name);
	}
}
}
