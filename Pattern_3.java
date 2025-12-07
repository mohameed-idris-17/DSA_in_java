import java.util.*;
public class Pattern_3{
    static void pattern_3(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<(n)-1-i;j++){
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

        for(int i=0;i<n;i++){
            for(int j=0;j<i;j++){
                System.out.print(" ");
            }
            for(int j=0;j<n-i;j++){
                System.out.print("*");
            }
            for (int j=0;j<n-i-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args){
        int N =  Integer.parseInt(args[0]);
        pattern_3(N);
    }
}