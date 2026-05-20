import java.util.*;

public class Day1Pratice {

    public void countFrequency(int[] arr){
        int len =  arr.length;
        if(len==0) return;
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        for(int ch:arr){
            map.put(ch,map.getOrDefault(ch,0)+1);

        }
        for(int key:map.keySet()){
            System.out.print(key+":"+map.get(key)+" , ");
        }
    }
    public void MaxFrequency(int[] arr){
        int len =  arr.length;
        if(len==0) return;
        LinkedHashMap<Integer,Integer> map = new LinkedHashMap<Integer,Integer>();

        for(int ch:arr){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        int max = Integer.MIN_VALUE,max_k =0 ;
        for(int  key:map.keySet()){
            if(map.get(key)>max){
                max = map.get(key);
                max_k =key;
            }
        }
    System.out.println(max_k);
    }
    public boolean ContainsDuplicate(int[] arr){
        int len =  arr.length;
        if(len==0) return false;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int ch:arr){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        for(int key:map.keySet()){
            if(map.get(key)!=1) return false;
        }
        return true;
    }
    public int FirstRepetition(int[] arr){
        int len =  arr.length;
        if(len==0) return 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int ch:arr){
           if(map.containsKey(ch)){
               return ch;
           }
           map.put(ch,map.getOrDefault(ch,0)+1);
        }
        return -1;
    }
    public int NonFirstRepetition(int[] arr){
        int len =  arr.length;
        if(len==0) return 0;
        HashMap<Integer,Integer> map = new LinkedHashMap<>();
        for(int ch:arr){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        for(int key:map.keySet()){
            if(map.get(key)==1) return key;
        }
        return -1;
    }

    public void ReturnAllDuplicate(int[] arr){
        int len =  arr.length;
        if(len==0) System.out.println(-1);
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int ch:arr){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        for(int key:map.keySet()){
            if(map.get(key)>1) System.out.println(key);
        }

    }

    public void sortFrequency(int[] arr){
        int len =  arr.length;
        if(len==0) return;
        HashMap<Integer,Integer> map = new HashMap<>();
        HashMap<Integer,Integer> map2 = new HashMap<>();
        for(int ch=0;ch<len;ch++){
            map.put(arr[ch],map.getOrDefault(arr[ch],0)+1);
            map2.putIfAbsent(arr[ch],ch);

        }
        List<Integer> list = new ArrayList<>();
        for(int i=0;i<len;i++){
            list.add(arr[i]);
        }

        Collections.sort(list,(a,b) -> {
            if(!(map.get(a).equals(map.get(b)))) {
                 return map.get(b) - map.get(a); }
            else return map2.get(a) - map2.get(b);
        });
        System.out.println(map);
        System.out.println(map2);
        System.out.println(list);
    }

    public void StringsortFrequency(String[] arr){
        int len =  arr.length;
        if(len==0) return;
        HashMap<String,Integer> map = new HashMap<>();
        HashMap<String,Integer> map2 = new HashMap<>();
        for(int ch=0;ch<len;ch++){
            map.put(arr[ch],map.getOrDefault(arr[ch],0)+1);
            map2.putIfAbsent(arr[ch],ch);

        }
        List<String> list = new ArrayList<>();
        for(int i=0;i<len;i++){
            list.add(arr[i]);
        }

        Collections.sort(list,(a,b) -> {
            if(!(map.get(a).equals(map.get(b)))) {
                return map.get(b) - map.get(a); }
            else return map2.get(a) - map2.get(b);
        });
        System.out.println(map);
        System.out.println(map2);
        System.out.println(list);
    }


    public void LongestSubArray(String arr ){
        int len =  arr.length();
        if(len==0) return;

        int start = 0,Ss =0,se=0;
        int max = Integer.MIN_VALUE;
        HashMap<Character,Integer> map = new HashMap<>();


        for(int e=0;e<len;e++){
            char ch = arr.charAt(e);
            if(map.containsKey(ch)){
                start = Math.max(start,map.get(ch)+1);
            }
            map.put(ch,e);
            if(max<e-start+1){
                max = e-start+1;
                Ss = start;
                se = e+1;
            }


        }

            System.out.println(arr.substring(Ss,se));


    }

    public void longestSubstring(String str) {
       // "abcabcbb" → 3
        int left = 0, right = 0, max = 0;
        HashSet<Character> set = new HashSet<>();

        while (right < str.length()) {
            char c = str.charAt(right);

            if (!set.contains(c)) {
                set.add(c);
                max = Math.max(max, right - left + 1);
                right++;
            } else {
                set.remove(str.charAt(left));
                left++;
            }
        }

        System.out.println(max);
    }

    public void moveZeroToEnd(int[] arr){
        int p = arr.length-1;
        List<Integer> list = new ArrayList<>();
        for(int i=0;i<=p;i++){
            if(arr[i] != 0){
                list.add(arr[i]);
            }
        }
        for(int i=list.size();i<arr.length;i++) list.add(0);
        System.out.println(Arrays.toString(arr));
        System.out.println(list);
    }
    void smallestSubArray(int[] arr){
        
    }
    public static void main(String[] args) {
     Day1Pratice dp = new Day1Pratice();
     int[] arr = {1,1,2,2,2,3};
     String[] sarr = {"apple","banana","apple","orange","banana"};
     //dp.CountFrequency(arr);
        // //dp.MaxFrequency(arr);
      //  System.out.println(dp.ContainsDuplicate(arr));
        //System.out.println(dp.FirstRepetition(arr));
       // dp.ReturnAllDuplicate(arr);
        //System.out.println(dp.NonFirstRepetition(arr));
        //dp.sortFrequency(arr);
       // dp.StringsortFrequency(sarr);
        dp.LongestSubArray("orangee");
    }
}
