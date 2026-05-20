import java.util.Arrays;

//⚔️ Problem 1 — Rotate Array (VERY IMPORTANT)
//❓ Problem
//[1,2,3,4,5], k = 2
//
//        👉 Output:
//
//        [4,5,1,2,3]
public class RotateArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int k = 2;
        rotate(arr,0,arr.length-1);
        rotate(arr,0,k-1);
        rotate(arr,k,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    static int[] rotate(int[] arr,int strt, int end){
        while(strt<end){
            int temp = arr[strt];
            arr[strt] = arr[end];
            arr[end] = temp;
            strt++;
            end--;
        }
        return arr;
    }
}
