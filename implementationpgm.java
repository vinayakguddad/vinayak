package collectionlistpgm;

import java.util.Arrays;

public class implementationpgm {
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
		public int size() {
			return size;
		}
		public boolean isEmpty() {
		//	if(size==0) {
		//		return true;
		//	}
		//	return false;
	//		or
		return	size==0;
		}
		public static void main(String[] args) {
			implementationpgm i=new implementationpgm();
			i.add(20);
			i.add(20);
			i.add("vinnu");
			i.add(true);
			System.out.println(i);
		   System.out.println(i.size());
		   i.remove(1);
		//	System.out.println(i.isEmpty());
		//	i.clear();
		}

		private void clear() {
			for (int i = 0; i <size; i++) {
				arr[i]=null;
			}
			size=0;
		}

		private void remove(int index) {
			if(index<0||index>size) {
				throw new ArrayIndexOutOfBoundsException(); 
			}
			for (int i = index; i < size; i++) {
				arr[i]=arr[i+1];
				
			}
			size--;
		}
			
		}

