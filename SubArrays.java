import java.util.*;

public class SubArrays {



    public static void subarrays(int[] arr){
        HashMap<Integer,Integer> map = new HashMap<>();
        Map<Integer, Integer> map2 = new LinkedHashMap<>();
        for(int i=0;i<arr.length;i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
            map2.putIfAbsent(arr[i],i);
        }
        List<Integer> list = new ArrayList<>();
        for(int i:arr){
            list.add(i);
        }
        Collections.sort(list,(a,b) -> {
            if(! (map.get(a).equals(map.get(b)))){
                return map.get(b) - map.get(a);
            }
            else {
                return map2.get(a) - map2.get(b);
            }
        });
        System.out.println(map.toString());
        System.out.println(map2.toString());
        System.out.println(list.toString());

    }
    void InterSection(int[] arr1 , int[] arr2){

        LinkedHashMap<Integer,Integer> arrL1 = new LinkedHashMap<>();
        LinkedHashMap<Integer,Integer> arrL2 = new LinkedHashMap<>();
        for(int i:arr1){
            arrL1.put(i,arrL1.getOrDefault(i,0)+1);
        }
        for(int i:arr2){
            arrL2.put(i,arrL2.getOrDefault(i,0)+1);
        }
        for(int key:arrL1.keySet()){
            int value1 = arrL1.get(key);
            if(arrL2.containsKey(key)){
                int value2 = arrL2.get(key);
                int count = value1 < value2 ? value1 : value2;
                for(int i=0;i<count;i++){
                    System.out.print(key+" ");
                }
            }
        }
        System.out.println(arrL1);
        System.out.println(arrL2);
    }
    // Longest subArray with k distinct StackTraceElement
//      Input:  s = "eceba", k = 2
//      Output: 3
//      Explanation: "ece"
    static void LongestSubarrayWithK(char[] arr,int k){
        HashMap<Character,Integer> map = new HashMap<>();
        int maxLen = 0;
        int left = 0, right = k;
        for(int i=0;i<k;i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        if(map.size() == k){
            int len = 0;
            for(int value:map.values()){
                len+=value;

            }
            if(len > maxLen) maxLen = len;
        }
        while(right < arr.length){
            map.put(arr[right],map.getOrDefault(arr[right],0)+1);
            right++;
            if(map.size() > k){
                map.put(arr[left],map.getOrDefault(arr[left],0)-1);
                if(map.get(arr[left]) == 0) map.remove(arr[left]);
                left++;
            }


            if(map.size() == k){
                int len = 0;
                for(int value:map.values()){
                    len+=value;

                }
                System.out.println(map);
                if(len > maxLen) maxLen = len;
            }
        }
        System.out.println(maxLen);
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,2,3,2,3,2,1,2};
//        for(int i=0;i<arr.length;i++){
//            int min = Integer.MAX_VALUE;
//            for(int j=i;j<arr.length;j++){
//                if(arr[j]<min){
//                    min = arr[j];
//                }
//
//            }
//
//            System.out.println(min);
//        }
        SubArrays.subarrays(arr);

    }
}
