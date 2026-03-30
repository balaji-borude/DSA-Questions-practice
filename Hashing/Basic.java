package Hashing;
import java.util.HashMap;

public class Basic {
    
    public static void main(String[] args) {
        
        // create the hashmap 

        HashMap<String,Integer> hm = new HashMap<>();

        // 1. .putt(key,value);  --> time complexity is --> 0(n)
        hm.put("India", 200);
        hm.put("China",300);
        hm.put("Russia",3000);

        System.out.println(hm);

        // 2.  .get(key) --> get the value from the hashmap
        System.out.println(hm.get("India"));

        //3.  .containsKey(key) ---> return if the key is present in the hasTable 
        System.out.println(hm.containsKey("China"));

        //4.  .remove(key) --> remove the key from the hashtable 
        hm.remove("Russia");

        System.out.println(hm);




    }
}
