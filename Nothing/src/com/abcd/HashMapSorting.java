package com.abcd;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class HashMapSorting {
	
	public static void main(String[] args) {
		
		Map<Integer, String> map = new HashMap<>();
		map.put(1003, "vijay");
		map.put(1005, "Ganesh");
		map.put(1002, "Aksha");
		map.put(1001, "sita");
		map.put(1004, "Ravi");
         map.forEach((k,v)->System.out.println(k+" "+v));
         System.out.println("===============");
        System.out.println();
        
        Set<Entry<Integer, String>>  entrySet = map.entrySet();
        
        ArrayList<Entry<Integer, String>> list = new ArrayList<>(entrySet);
       
       Collections.sort(list, (o1,o2)->o1.getValue().compareTo(o2.getValue()));// keys sort
       // Collections.sort(list, (o1,o2)->o1.getKey().compareTo(o2.getKey()));// values sort
        
        list.forEach(s->{
        	System.out.println(s.getKey()+"\t"+s.getValue());
        });
		
	}

}
