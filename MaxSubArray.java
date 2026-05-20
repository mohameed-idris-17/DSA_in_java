import java.util.HashMap;

public class MaxSubArray {
    public static void main(String[] args) {
        int count = 0;
        int pre_sum = 0;
        int[] arr = {1,-1,1};

        int k = 1;
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        map.put(-1, 0);
        for(int i=0;i<arr.length;i++) {
            pre_sum += arr[i];
            int dif = pre_sum-k;
            if(map.containsValue(dif)) {
                count++;
                map.put(i,pre_sum);
            }
            map.put(i,pre_sum);

        }
        System.out.println(map);
        System.out.println(count);
    }
}
