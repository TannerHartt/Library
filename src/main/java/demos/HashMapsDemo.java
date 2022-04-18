package demos;

import java.util.HashMap;

public class HashMapsDemo {

    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();


        map.put("Tanner", 24);
        map.put("Max", 54);
        map.put("Kenzie", 20);
        map.put("me", 20);
        System.out.println(map);



        System.out.println(map.containsValue(20));


    }
    public void insertNameAge(HashMap<String, Integer> map,String str, int age) {
        map.putIfAbsent(str, age);
    }
}
