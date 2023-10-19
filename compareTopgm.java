package collectionlistpgm;

import java.util.Arrays;

class student implements Comparable{
	 int id;
	 String name;
	 student(int id,String name){
		 this.id=id;
		 this.name=name;
		 return;
	 }
	 public String toString(){
		 return id+" "+name;
	 }
	 public int compareTo(Object obj) {
		 student s=(student)obj;
		 return this.id-s.id;
	 }
 }




public class compareTopgm {
    public static void main(String[] args) {
		student s1=new student(10,"vinnu");
		student s2=new student(3,"wonderwoman");
		student s3=new student(11,"spiderman");
		student[] arr= {s1,s2,s3};
		Arrays.sort(arr);
		for(Object a:arr) {
			System.out.println(a);
		}
	}
}
