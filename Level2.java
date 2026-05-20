import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Level2 {

    public void FirstRepeatingElement(int[] arr) {

        int fstRepeating = Integer.MAX_VALUE;
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        for(int ch = 0; ch < arr.length; ch++) {
            if(map.containsKey(arr[ch])){
                fstRepeating = Math.min(fstRepeating,map.get(arr[ch]));

            }
            else map.put(arr[ch],ch);
        }
        Set<Integer> set = new HashSet<>();

//        for(int ch : arr) {
//            if(set.contains(ch)) {
//                fstRepeating = ch;
//                break;
//            }
//            else{
//                set.add(ch);
//            }
//        }
        System.out.println(map);
        System.out.println(fstRepeating + " "+ arr[fstRepeating]);
    }

    public void CheckRepeatingElement(int[] arr) {
        HashSet<Integer> set = new HashSet<>();
        for(int ch = 0; ch < arr.length; ch++) {
            if(set.contains(arr[ch])){
                System.out.println(true );
            }
            else set.add(arr[ch]);
        }
    }

    public void ReturnAllDuplicates(int[] arr) {
        Set<Integer> set = new LinkedHashSet<>();
        Set<Integer> set2 = new LinkedHashSet<>();

        for(int ch : arr){
            if(set.contains(ch)){
                set2.add(ch);
            }
            else set.add(ch);
        }
        System.out.println(set2);
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,2,3,4,1,2,5,1};
        Level2 obj = new Level2();
        //obj.FirstRepeatingElement(arr);
        obj.ReturnAllDuplicates(arr);



    }
}
