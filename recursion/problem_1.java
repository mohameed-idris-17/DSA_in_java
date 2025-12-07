import java.util.*;
public class problem_1 {

    static void rec(int n){
        if(n==0){ return; }
        System.out.println("Gate Number: "+n);
        rec(n-1);
    }
    public static void main(String[] args) {
        int n = new Scanner(System.in).nextInt();
        rec(n);
    }
}