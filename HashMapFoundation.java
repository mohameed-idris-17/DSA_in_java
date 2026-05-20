import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class HashMapFoundation {



    public static void main(String[] args) {
        int[] arr = {1,2,3,4,2,3,4,1,2,5,1};
        String name = new String("mohameed Idris M");
        char[] charr = name.toLowerCase().toCharArray();
//        Map<Integer,Integer> map = new HashMap<>();
//        for(int ch : arr)
//        {
//            map.put(ch,map.getOrDefault(ch,0)+1);
//        }
        Map<Character,Integer> map2 = new LinkedHashMap<>();
        for(char ch:charr){
            map2.put(ch,map2.getOrDefault(ch,0)+1);
        }
        System.out.println(map2);
        for(Map.Entry<Character,Integer> entry: map2.entrySet()){
            System.out.println(entry.getKey()+" "+entry.getValue());

        }
        //System.out.println(map);
    }
}

