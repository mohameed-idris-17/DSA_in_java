import java.util.*;
public class SlindingWindow {

        public static void main(String[] args) {

            int[] arr = {1, 2, 1, 3, 4, 2, 3};
            int k = 4;
            ArrayList<Integer> list = new ArrayList<>();
            HashMap<Integer, Integer> map = new HashMap<>();
            int l = k;
            for(int i=0;i<k;i++){
                map.put(arr[i],map.getOrDefault(arr[i],0)+1);

            }
            list.add(map.size());
            System.out.println(list);

        }
    }

