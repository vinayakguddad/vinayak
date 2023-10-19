package collectionlistpgm;

import java.util.Arrays;

public class addmethodimplementation {
   int defaultCapacity=10;
   Object[] arr=new Object[defaultCapacity];
   int size=0;
   
   public void add(Object obj) {
	   capacity();
	   arr[size]=obj;
	   size++;
   }

   private void capacity() {
     if(size==arr.length) {
    	 int newCapacity=(arr.length*3/2)+1;
    	 arr=Arrays.copyOf(arr, newCapacity);
     }
   }
     public String toString() {
    	 StringBuilder s=new StringBuilder("[");
    	 for (int i = 0; i < size; i++) {
    		 s.append(arr[i]);
			if(i<size-1) {
				s.append(",");
				
			}
		}
    	 s.append("]");
		return s.toString();
    }
     public static void main(String[] args) {
		addmethodimplementation a=new addmethodimplementation();
		a.add(20);
		a.add(30);
		a.add("hi");
		System.out.println(a.arr.length);
		System.out.println(a);
	}
}
