import java.util.*;

public class TOP10 {


    public int CountSubArray(int[] arr , int k){
        int count = 0;
//        arr = [2, 1, 4, 3]
//        K = 8
      //  output = 8
        for(int i=0;i<arr.length;i++){
            int sum = 0;
            for(int j=i;j<arr.length;j++){
                sum+=arr[j];
                if(sum<k){
                    count++;
                }
            }
        }
        return count;
    }
    public void longestConsequtiveArray(int[] arr){

        //input : 1,2,0,1,2,3,4,5,6,1,2,3,4,5,6,7,8,9
        // ouput: 1,2,3,4,5,6,7,8,9
        int MaxLen = 0,maxL = 0,maxR = 0,left =0;

        for(int right = 0;right<arr.length-1;right++){
            if(arr[right]+1 != arr[right+1]){
                if(MaxLen < right-left+1){
                    MaxLen = right-left+1;
                    maxR = right;
                    maxL = left;
                }
                left = right+1;
            }
            if(right == arr.length-2){
                if(MaxLen < right-left+2){
                    MaxLen = right-left+2;
                    maxR = right+1;
                    maxL = left;
                }
                left = right+1;
            }
        }
        for(int i=maxL;i<=maxR;i++)
            System.out.print(arr[i]+" ");
    }
    //abcabcdefbb => abcdef
    public void longestArraywithoutDuplicate(char[] arr){
        int MaxLen = 0,maxL = 0,maxR = 0,left =0;
        HashSet<Character> set = new HashSet<>();
        for(int right =0;right<arr.length;right++){
            while(set.contains(arr[right])) {
                set.remove(arr[left]);
                left++;
            }
            set.add(arr[right]);
            if(MaxLen < right -left+1){
                MaxLen = right-left+1;
                maxL = left;
                maxR = right;
            }
        }
        for(int i=maxL;i<=maxR;i++)
            System.out.print(arr[i]+" ");
    }
    //Input:  "catcat"
    //Output: "catc3a4t5"
    public String problem(String str){
        char[] arr = str.toCharArray();
        StringBuilder sb = new StringBuilder();
        Set<Character> set = new HashSet<>();
        for(int i=0;i<arr.length;i++){
            char ch = arr[i];
            if(set.contains(ch)){
                sb.append(ch+""+i);
            }
            else{
                sb.append(ch);
                set.add(ch);
            }

        }
        return sb.toString();

    }
    //Find all pairs with same frequency
    //   Input:  [1,1,2,2,3]
        //   Output: [(1,2)]
//    Input:  [4,4,5,5,6,7]
//    Output: [(4,5), (6,7)]
    public void problem(int[] arr){
        HashMap<Integer,Integer> map = new HashMap<>();
        HashMap<Integer, List<Integer>> map2 = new HashMap<>();
        for(int i:arr) map.put(i,map.getOrDefault(i,0)+1);

        for(int key:map.keySet()){
            int value = map.get(key);
            if(map2.containsKey(value)){
                map2.get(value).add(key);
            }
            else{
                map2.put(value,new ArrayList<>());
                map2.get(value).add(key);
            }
        }

        for(int key:map2.keySet()){
            List<Integer> list = map2.get(key);
            for(int i=0;i<list.size();i++){
                for(int j=i+1;j<list.size();j++){
                    System.out.println(list.get(i)+","+list.get(j));
                }
            }
        }
    }

    public static int smallestSubarray(int[] arr) {
//
//        [1,2,1,3,2]
//        Distinct elements = {1,2,3}
        int n = arr.length;

        // Step 1: total distinct count
        Set<Integer> set = new HashSet<>();
        for (int num : arr) set.add(num);
        int required = set.size();

        // Step 2: sliding window
        Map<Integer, Integer> map = new HashMap<>();
        int left = 0, maxLen = Integer.MIN_VALUE, formed = 0;

        for (int right = 0; right < n; right++) {
            int val = arr[right];
            map.put(val, map.getOrDefault(val, 0) + 1);

            if (map.get(val) == 1) formed++;

            while (formed == required) {
                maxLen = Math.max(maxLen, right - left + 1);

                int leftVal = arr[left];
                map.put(leftVal, map.get(leftVal) - 1);

                if (map.get(leftVal) == 0) formed--;

                left++;
            }
        }

        return maxLen;
    }

    public static void LongestWithoutRepeating(char[] arr){
        int left =0 ,maxLen = 0;
        HashSet<Character> set = new HashSet<>();
        for(int right = 0;right<arr.length;right++){
            char ch = arr[right];
            if(!(set.contains(ch))){
                set.add(ch);
            }
            else{
                maxLen = Math.max(maxLen,right-left);

                while(arr[left] != ch){
                    set.remove(arr[left]);
                    left++;
                }
                left++;
            }
            if (right == arr.length-1)
                maxLen = Math.max(maxLen,right-left+1);
        }
        System.out.println(maxLen);
    }
    public static void main(String[] args) {
        TOP10 obj = new TOP10();

    }
}
