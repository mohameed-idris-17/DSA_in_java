import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Level3 {

    public void FirstNonDuplicate(int[] arr) {
        int len = arr.length;
        int result = -1;
        HashMap<Integer, Integer> map = new LinkedHashMap<>();
        for (int i = 0; i < len; i++) {
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);

        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) {
                System.out.println(entry.getKey());
                break;
            }
        }
        System.out.println(map);

    }
    public static void main(String[] args) {
        Level3 obj = new Level3();
        int[] arr = {1,2,3,4,2,3,4,1,2,5,1};
        obj.FirstNonDuplicate(arr);
        //System.out.println(Arrays.toString(arr));
    }
}
