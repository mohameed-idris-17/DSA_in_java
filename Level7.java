import java.util.HashMap;
import java.util.Map;

public class Level7 {

    public void CountDistinctInWindow(int[] arr,int window){
        int s = 0 , e = window-1;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<=e;i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        for(int key:map.keySet()){
            if(map.get(key) == 1){
                System.out.print(key+" ");
            }
        }
        System.out.println();

        while(e<arr.length-1){
            map.put(arr[s],map.get(arr[s])-1);
            if(map.get(arr[s]) == 0){
                map.remove(arr[s]);
            }
            s++;
            e++;
            map.put(arr[e],map.getOrDefault(arr[e],0)+1);
            for(int key:map.keySet()){
                if(map.get(key) == 1){
                    System.out.print(key+" ");
                }
            }
            System.out.println();

        }

    }
    public static void main(String[] args) {
        Level7 obj = new Level7();
        int[] arr = {1,2,3,1,2,3,2,3,4,5,2};
        int k = 4;
        obj.CountDistinctInWindow(arr,k);
    }
}
