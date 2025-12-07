


/*


 */


import java.util.*;

public class Pattern_1 {

     static void pattern_1(int n){
        for(int i=n-1;i>=0;i--){
            int p = 1;
            for(int j=0;j<=i;j++){
                System.out.print(p++ +" ");
            }

            System.out.println();
        }
    }
    public static void main(String[] args) {
        System.out.println("enter a number");
        int N = new Scanner(System.in).nextInt();
        pattern_1(N);
    }
}