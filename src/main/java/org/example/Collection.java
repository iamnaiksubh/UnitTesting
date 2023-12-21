package org.example;

import java.util.HashMap;

public class Collection {

    // HashMap
    public boolean isMapEmpty(HashMap<Integer, String> map){
        return map.isEmpty();
    }

    public boolean isMapContainKey(HashMap<Integer, String> map, Integer key){
        return map.containsKey(key);
    }

    public String getMapValue(HashMap<Integer, String> map, Integer key){
        return map.getOrDefault(key , key + " not present");
    }

    // String

    public Character characterAtIndex(String word, int index){
        return word.charAt(index);
    }

    public String concatTwoString(String str1, String str2){
        return str1.concat(str2);
    }

    public int compareTwoString(String str1, String str2){
        return str1.compareTo(str2);
    }

    public String repeatString(String word, int repeatCount){
        return word.repeat(repeatCount);
    }

}
