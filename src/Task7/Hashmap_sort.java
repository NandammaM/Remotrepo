package Task7;

import java.util.*;

public class Hashmap_sort {

	static Map<String, Integer> map = new HashMap<>();
	 
    
    public static void sortbykey()
    {
        
        TreeMap<String, Integer> sorted
            = new TreeMap<>(map);
 
        
        for (Map.Entry<String, Integer> entry :
             sorted.entrySet()) {
            System.out.println("Key = " + entry.getKey()
                               + ", Value = "
                               + entry.getValue());
        }
    }
 
   
    public static void main(String args[])
    {
       
        map.put("Gani", 80);
        map.put("Digant", 90);
        map.put("Bhushi", 80);
        map.put("Sonu", 75);
        map.put("Anant", 40);
 
        
        sortbykey();
    }
}
