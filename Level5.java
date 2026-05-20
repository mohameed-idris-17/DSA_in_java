import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Level5 {
    public void GroupingByFreq(String[] arr) {
        HashMap<String, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        System.out.println(map);

        Map<Integer, List<String>> map2 = new HashMap<>();
       // List<Integer> list = new ArrayList<>(map.values());
        for(Map.Entry<String, Integer > entry : map.entrySet()){
            String key  = entry.getKey();
            int  value = entry.getValue();
            map2.putIfAbsent(value,new ArrayList<>());
            map2.get(value).add(key);

        }
        System.out.println(map2);

    }
    public static void main(String[] args) {
        Level5 obj = new Level5();
        obj.GroupingByFreq(new String[]{"a","b","c","a","b","c","a","d"});

    }
}
