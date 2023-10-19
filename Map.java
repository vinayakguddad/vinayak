package collectionlistpgm;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.TreeMap;

public class Map {
   public static void main(String[] args) {
	//  HashMap<Character,String> h=new HashMap();
//	  h.put('a', "hhj");
//	  h.put('n', "hgg");
//	  h.put('B', "hii");
//	  for(Entry<Character, String> o : h.entrySet()) {
//	
//		  System.out.println(o.getKey()+" "+ o.getValue());
//	  }
//}

//    LinkedHashMap<Integer,String> l=new LinkedHashMap();
//    l.put(88888, null);
 //   l.put(29, "hi");
//    l.put(29, "hello");
//    l.put(30,"guuu");
//    for(Entry<Integer,String> j:l.entrySet()) {
//    	System.out.println(j.getValue()+" "+j.getKey());
 //  }
	   
      TreeMap<String,String> h=new TreeMap();
      h.put("hii","gffs");
      h.put("nimmu", "vinnu");
	   h.put("xxx", "byy");
	   h.put("zzz", null);
	   for(Entry<String,String> f:h.entrySet()) {
//		System.out.println(f);
	   System.out.println(f.getKey()+" "+f.getValue());
		
	   }
		System.out.println(h.containsValue("vinnu"));
	//   System.out.println(h.get("zzz")); 
   }}

