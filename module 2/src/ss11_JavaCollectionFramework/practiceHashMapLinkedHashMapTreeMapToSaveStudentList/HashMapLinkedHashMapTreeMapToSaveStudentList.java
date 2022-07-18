package ss11_JavaCollectionFramework.practiceHashMapLinkedHashMapTreeMapToSaveStudentList;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class HashMapLinkedHashMapTreeMapToSaveStudentList {
    public static void main(String[] args) {
//        Map<String,Integer> hashMap = new HashMap<>();
//        hashMap.put("Smith",30);
//        hashMap.put("Anderson",31);
//        hashMap.put("lewis",29);
//        hashMap.put("cook",29);
//        System.out.println("display entrises in Hashmap");
//        System.out.println(hashMap+ "\n");
//
//        Map<String,Integer> treeMap = new TreeMap<>(hashMap);
//        System.out.println("display treemap");
//        System.out.println(treeMap);
//

        Map<String,Integer> linkedHashmap = new LinkedHashMap<>(16,0.75f,true);
        linkedHashmap.put("Smith",30);
        linkedHashmap.put("Anderson",31);
        linkedHashmap.put("lewis",29);
        linkedHashmap.put("cook",29);
        System.out.println("\n the age for "+ "lewis is" + linkedHashmap.get("lewis"));

    }



}
