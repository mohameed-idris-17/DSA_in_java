/******************************************************************************

 Online Java Compiler.
 Code, Compile, Run and Debug java program online.
 Write your code in this editor and press "Run" button to execute it.

 *******************************************************************************/
import java.util.*;
public class New
{

    public static int SecondLargest(int[] arr){
        int fi=Integer.MIN_VALUE,se = Integer.MIN_VALUE;
        for(int number: arr){
            if(number > fi){
                se = fi;
                fi = number;
            }
            else if((number > se)&&(number != fi)){
                se = number;
            }
        }
        return se;
    }

    public static void Method(int[] arr){
        List<Integer> odd = new ArrayList<>(),even = new ArrayList<>();
        for(int number :arr){
            if(number%2==1) odd.add(number);
            else even.add(number);
        }
        for(int i=0;i<odd.size()-1;i++){
            int max = Integer.MIN_VALUE;
            for(int j=i+1;j<odd.size();j++){


                if(odd.get(i) < odd.get(j)){
                    int temp = odd.get(i); //temp = arr[i];
                    odd.set(i,odd.get(j)); //arr[i] = arr[j];
                    odd.set(j,temp);  //arr[j] = temp
                }

            }
        }

        for(int i=0;i<even.size()-1;i++){
            for(int j=i+1;j<even.size();j++){
                if(even.get(i) > even.get(j)){
                    int temp = even.get(i);
                    even.set(i,even.get(j));
                    even.set(j,temp);
                }
            }
        }
        System.out.println(odd);
        System.out.println(even);
    }
    public static char NonRepeating(char[] arr){
        Map<Character,Integer> map = new LinkedHashMap<>();
        for(char ch:arr) map.put(ch,map.getOrDefault(ch,0)+1);
        for(char key: map.keySet()){
            if(map.get(key) == 1) return key;
        }
        return '#';
    }

    public static void SuffixChanging(String[] arr){
        Map<String,Integer> map = new HashMap<>();
        for(String str :arr) map.put(str,map.getOrDefault(str,0)+1);
        for(String key: map.keySet()) {
            if(map.get(key) > 1){
                System.out.print(key+" ");
            }
        }
    }
    public static int Sum(int[] arr,int k){
        int count = 0;
        for(int i=0;i<arr.length;i++){
            int sum = 0;
            for(int j=i;j<arr.length;j++){
                sum+=arr[j];
                if(sum == k ) count++;
            }

        }
        return count;
    }

    public static void LongestWithoutRepeating(char[] arr){
        Set<Character> set = new HashSet<>();
        int left = 0,maxLen = 0, maxL = 0,maxR = 0;
        for(int right=0;right <arr.length;right++ ){
            char ch = arr[right];
            if(set.contains(ch)){
                if(maxLen < right-left){
                    maxLen = right-left;
                    maxL = left;
                    maxR = right;
                }
                left++;
            }
            set.add(ch);

            if(right == arr.length-1){
                if(maxLen < right-left){
                    maxLen = right-left;
                    maxL = left;
                    maxR = right;
                }
                left++;
            }
        }
        for(int i=maxL;i<maxR;i++){
            System.out.print(arr[i]);
        }
    }
    public static void consequective(int[] arr){
        int maxLen = 0,left = 0,maxL = 0,maxR =0;
        Arrays.sort(arr);
        // System.out.println(Arrays.toString(arr));
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]+1 != arr[i+1]){
                if(maxLen < i-left+1){
                    maxLen = i-left+1;
                    maxL = left;
                    maxR = i;

                }
                left = i+1;

            }
            if(arr.length-2 == i){
                if(maxLen < i-left+1){
                    maxLen = i-left+1;
                    maxL = left;
                    maxR = i+1;

                }
            }
        }
        for(int i=maxL;i<=maxR;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void Distinct(int[] arr,int k){
        Map<Integer,Integer> map = new HashMap<>(); //{1,2,3,4}
        int maxLen = 0, maxL = 0,maxR = 0,left = 0;
        for(int right = 0;right<arr.length;right++){
            int ch = arr[right];
            map.put(ch,map.getOrDefault(ch,0)+1);
            if(map.size()<=k){
                if(maxLen < right-left+1){
                    maxLen = right-left+1;
                    maxL = left;
                    maxR = right;

                }

            }
            else{
                while(map.size()>k){
                    int le = arr[left];
                    map.put(le,map.getOrDefault(le,0)-1);
                    if(map.get(le) == 0) map.remove(le);
                    left++;
                }
                if(maxLen < right-left+1){
                    maxLen = right-left+1;
                    maxL = left;
                    maxR = right;

                }
            }
        }
        for(int i=maxL;i<=maxR;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static int SubArray(int[] arr,int k){
        int count = 0;
        for(int i=0;i<arr.length;i++){
            int sum = 1;
            for(int j=i;j<arr.length;j++){
                sum*=arr[j];
                if(sum < k ) count++;

            }
        }
        return count;
    }

    public static void Conseq(int[] arr){
        Set<Integer> set = new HashSet<>();
        for(int i:arr){
            set.add(i);
        }
        int maxLen = 0 ,start = 0;
        for(int i:arr){
            if(!set.contains(i-1)){

                int len =1, curr = i;

                while(set.contains(curr+1)){
                    len++;
                    curr++;
                }

                if(len > maxLen){
                    maxLen = len;
                    start =i;
                }

            }
        }
        for(int i=0;i<maxLen;i++){
            System.out.print(i+start+" ");
        }
    }

    public static void SubArrayMax(int[] arr,int z){
        int maxLen = 0,maxL = 0,maxR = 0;
        for(int i=0;i<arr.length;i++){

            for(int j=i+1;j<arr.length;j++){
                int sum = 0;
                for(int k=i;k<=j;k++){
                    sum+=arr[k];

                }
                if(((j-i+1) > maxLen) && (sum == z)){
                    maxLen = j-i+1;
                    maxR  = j;
                    maxL = i;
                }
            }
        }
        for(int i=maxL;i<=maxR;i++){
            System.out.print(arr[i]+" ");
        }

    }
    public static void window(int[] arr,int k){
        Set<Integer> set = new HashSet<>();
        int left =0;
        for(int i=0;i<k;i++){
            set.add(arr[i]);
        }
        boolean bool1 = false;
        List<Integer> list = new ArrayList<>();
        for(int s: set){
            if((s < 0) && (!bool1)){
                list.add(s);
                break;
            }
        }
        for(int right = k ;right<arr.length;right++){
            set.remove(arr[left]);
            set.add(arr[right]);
            left++;
            boolean bool = false;
            for(int s: set){

                if(s < 0) {
                    list.add(s);
                    bool = true;
                    break;
                }

            }
            if(!bool) list.add(0);
        }
        System.out.println(list);
    }

    public static void longestStringMostDistinct(char[] arr,int k){
        Map<Character,Integer> map = new HashMap<>();
        int maxLen = 0, left = 0, maxL = 0,maxR = 0;
        for(int right = 0;right<arr.length;right++){
            char ch = arr[right];
            map.put(ch,map.getOrDefault(ch,0)+1);
            if(map.size() > k){
                if(maxLen < right-left){
                    maxLen = right-left;
                    maxR = right-1;
                    maxL = left;
                }
                while(map.size()==k){
                    char le = arr[left];
                    map.put(le,map.getOrDefault(le,0)-1);
                    if(map.get(le) == 0) map.remove(le);
                    left++;
                }

            }

        }
        for(int i=maxL;i<=maxR;i++){
            System.out.print(arr[i]+" ");
        }

    }

    public static boolean anagram(char[] arr1,char[] arr2){
        Set<Character> set1 = new TreeSet<>(), set2 = new TreeSet<>();
        for(char a: arr1) set1.add(a);
        for(char b: arr2) set2.add(b);

        if(set1.size() != set2.size()) return false;
        else{
            List<Character> l1 = new ArrayList<>(set1) ,l2 = new ArrayList<>(set2);
            for(int i=0;i<l1.size();i++){
                if(l1.get(i) != l2.get(i)) return false;
            }
        }
        return true;

    }

    public static void ReArrange(int[] arr){
        List<Integer> po = new ArrayList<>() ,ne = new ArrayList<>();
        for(int i:arr) if( i > 0 ) po.add(i); else ne.add(i);
        int min = po.size() < ne.size() ? po.size():ne.size();
        for(int i=0;i<min;i++){
            System.out.print(po.get(i)+" "+ne.get(i)+" ");

        }
        for(int i = min;i<po.size();i++){
            System.out.print(po.get(i)+" ");
        }
        for(int i = min;i<ne.size();i++){
            System.out.print(ne.get(i)+" ");
        }

    }
    public static int missing(int[] arr){
        int n = arr.length+1;
        int total = (n*(n+1))/2;
        int curr = 0;
        for(int i:arr) curr+=i;
        return total - curr;
    }

    public static void DistinctInWindow(int[] arr,int k){
        Map<Integer,Integer> map = new HashMap<>();
        int left = 0;
        for(int i=0;i<k;i++){
            int ch = arr[i];
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        List<Integer> list = new ArrayList<>();
        int count1 = 0;
        for(int key:map.keySet()){
            if(map.get(key) == 1) count1++;
        }
        list.add(count1);
        for(int right = k; right<arr.length;right++){
            int ch = arr[right] , le = arr[left];
            map.put(ch,map.getOrDefault(ch,0)+1);
            map.put(le, map.getOrDefault(le,0)-1);
            left++;
            int count = 0;
            for(int key:map.keySet()){
                if(map.get(key) == 1) count++;
            }
            list.add(count);
        }
        System.out.println(list);
    }

    public static void Diamond(int n){

        for(int i=0;i<n;i++){

            for(int j=n;j>i;j--){
                System.out.print(" ");
            }
            for(int j=0;j<=i;j++){
                System.out.print("*");
            }
            for(int j=0;j<i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=1;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print(" ");
            }
            for(int j=n;j>i;j--){
                System.out.print("*");
            }
            for(int j=n-1;j>i;j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int[] nums = {1,2,1,3,4,2,3}; //-1,-1,-7,-15,-15,0
        //	System.out.println(SecondLargest(nums));
        //	Method(nums);
        //	System.out.println(NonRepeating("aabbcc".toCharArray()));
        String[] strArr = {"x","x","x","x","y","a","a"};
        //	SuffixChanging(strArr);
        //	System.out.println(Sum(nums,0));
        //	LongestWithoutRepeating("abba".toCharArray());
//	consequective(nums);
//	Distinct(nums,2);
        //SubArrayMax(nums,3);
        //Conseq(nums);
        //  System.out.println(SubArrayMax(nums,3));
        // window(nums,2);
        // longestStringMostDistinct("aaabbcc".toCharArray(),2);
// System.out.println(anagram("hello".toCharArray(),"world".toCharArray()));
//ReArrange(nums);
        //System.out.println(missing(nums));
        // DistinctInWindow(nums,4);
        Diamond(5);
    }
}