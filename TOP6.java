
import java.util.*;

public class TOP6 {
    // {1) Longest Substring Without Repeating Characters
// Input:  "abcabcbb"
// Output: 3
    public static int longestSubString(char[] arr){
        Set<Character> set = new HashSet<>();
        int left = 0,maxLen = 0;
        for(int r=0;r<arr.length;r++){
            char ch = arr[r];
            if(!set.contains(ch)){
                set.add(ch);
            }
            else{
                maxLen = Math.max(maxLen,r-left);
                while(arr[left] != ch){
                    set.remove(left);
                    left++;
                }
                left++;
            }
            if(r==arr.length-1){
                maxLen = Math.max(maxLen,r-left+1);
            }
        }
        return maxLen;
    }
    //     3) At Most K Distinct Elements (Longest Subarray Length)
// Input:  arr = [1,2,1,2,3], k = 2
// Output: 4   // [1,2,1,2]
// Input:  arr = [1,2,1,3,4], k = 2
// Output: 3   // [1,2,1]

    public static int Distinct(int[] arr,int k){
        int maxLen = 0, left =0;
        Map<Integer,Integer> set = new HashMap<>();
        for(int r=0;r<arr.length;r++){
            int ch = arr[r];
            if(!set.containsKey(ch)){
                set.put(ch,1);
            }
            else if(set.containsKey(ch)){
                set.put(ch,set.getOrDefault(ch,0)+1);
            }

            if(set.size() > k)
            {
                while(set.size()>k){
                    int l = arr[left];
                    set.put(l,set.getOrDefault(l,0)-1);
                    if(set.get(l) == 0){
                        set.remove(l);
                    }
                    left++;
                }

            }
            if(set.size()<=k){
                maxLen = Math.max(maxLen,r-left+1);

            }

        }
        return maxLen;
    }
}
