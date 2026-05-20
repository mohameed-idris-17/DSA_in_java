import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Level6 {
    public void ReturnIndexElement(String[] arr){
        int n =  arr.length;
        Map<String, List<Integer>> map = new HashMap<>();
        for(int i=0;i<n;i++){
            map.putIfAbsent(arr[i],new ArrayList<>(i));
            map.get(arr[i]).add(i);
        }
       // Map<String, List<Integer>> map2 = new HashMap<>();
        System.out.println(map);
        for(Map.Entry<String,List<Integer>> entry:map.entrySet()){
            //String key = entry.getKey();
            List<Integer> value = entry.getValue();
            for(int i=0;i<value.size()-1;i++){
                for(int j=i+1;j<value.size();j++){
                    System.out.print("("+value.get(i)+","+value.get(j)+") ");
                }
            }

        }
    }
    public static void main(String[] args) {
        Level6 obj = new Level6();
        obj.ReturnIndexElement(new String[]{"a","b","c","d","e","a","b","c","b","a"});


    }
}
