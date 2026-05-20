import java.util.*;
public class TOP220 {





        public static String minWindow(String s, String target) {

            if (s.length() < target.length()) return "";

            Map<Character, Integer> targetMap = new HashMap<>();

            for (char ch : target.toCharArray()) {
                targetMap.put(ch, targetMap.getOrDefault(ch, 0) + 1);
            }

            int left = 0;
            int matched = 0;

            int minLen = Integer.MAX_VALUE;
            int start = 0;

            Map<Character, Integer> windowMap = new HashMap<>();

            for (int right = 0; right < s.length(); right++) {

                char rightChar = s.charAt(right);

                windowMap.put(rightChar,
                        windowMap.getOrDefault(rightChar, 0) + 1);

                if (targetMap.containsKey(rightChar) &&
                        windowMap.get(rightChar) <= targetMap.get(rightChar)) {

                    matched++;
                }

                while (matched == target.length()) {

                    if (right - left + 1 < minLen) {
                        minLen = right - left + 1;
                        start = left;
                    }

                    char leftChar = s.charAt(left);

                    windowMap.put(leftChar,
                            windowMap.get(leftChar) - 1);

                    if (targetMap.containsKey(leftChar) &&
                            windowMap.get(leftChar) < targetMap.get(leftChar)) {

                        matched--;
                    }

                    left++;
                }
            }

            return minLen == Integer.MAX_VALUE
                    ? ""
                    : s.substring(start, start + minLen);
        }
    public static void shortString(char[] arr){

//        Input:
//        "aabcbcdbca"
//
//        Output:
//        "dbca"
        Set<Character> set = new HashSet<>();
        for(char i:arr) set.add(i);
        HashMap<Character,Integer> hmap = new HashMap<>();
        int left = 0,minLen = Integer.MAX_VALUE , required = 0,start = 0;
        for(int right =0;right<arr.length;right++){
            char rigch = arr[right];
            hmap.put(rigch,hmap.getOrDefault(rigch,0)+1);
            if(hmap.get(rigch) == 1) required++;
            while(required == set.size()){
                if(minLen > right-left+1){
                    minLen = right-left+1;
                    start = left;
                }
                char lefch = arr[left];
                hmap.put(lefch,hmap.getOrDefault(lefch,0)-1);
                if(hmap.get(lefch) == 0) required--;
                left++;
            }
        }
        for(int i=0;i<minLen;i++) System.out.print(arr[start+i]);
    }
        public static void main(String[] args) {

            System.out.println(
                    minWindow("ADOBECODEBANC", "ABC")
            );

            System.out.println(
                    minWindow("a", "aa")
            );

            System.out.println(
                    minWindow("aaflslflsldkalskaaa", "aaa")
            );
        }
    }

//public class Subsetsum {

//     public static void main(String[] args) {
//         int[] arr = {2, 3, 5, 7};
//         int target = 10;

//         find(arr, 0, target, new ArrayList<>());
//     }

//     static void find(int[] arr, int start, int target, List<Integer> list) {

//         // 🎯 If sum reached
//         if (target == 0) {
//             System.out.println(list);
//             return;
//         }

//         // ❌ If exceeded
//         if (target < 0) return;

//         // 🔁 This loop replaces ALL nested loops
//         for (int i = start; i < arr.length; i++) {

//             // choose element
//             list.add(arr[i]);

//             // go deeper (like next loop)
//             find(arr, i + 1, target - arr[i], list);

//             // undo choice
//             list.remove(list.size() - 1);
//         }
//     }

