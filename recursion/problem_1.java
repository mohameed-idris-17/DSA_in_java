package recursion;

import java.util.*;
public class problem_1{

    //Understand recursion by print something N times
    static void rec(int n){
        if(n==0){ return; }
        System.out.println("Gate Number: "+n);
        rec(n-1);
    }


    //Print name N times using recursion
    static void rec2(int n,int N){
        if(n==N+1){ return; }
        System.out.println("count of "+ n+ "  Name is Idris ");
        rec2(n+1,N);
    }


    //Print 1 to N using recursion
    static void rec3(int n,int N){
        if(n==N+1){ return; }
        System.out.println(n);
        rec3(n+1,N);
    }

    //
    //Sum of first N numbers
    static int rec5(int n,int sum){

        if(n==0){ return sum; }
        sum+=n;
        //System.out.println(sum);
        return rec5(n-1,sum);

    }

    //Print N to 1 using recursion
    static void rec4(int n){
        if(n==0){ return; }
        System.out.print(n+" ");
        rec4(n-1);
    }




    public static void main(String[] args) {

       // int n = new Scanner(System.in).nextInt();
//        rec(n);
//        int N = new Scanner(System.in).nextInt();
//        rec2(1,N);

//        int N = new Scanner(System.in).nextInt();
//        rec3(1,N);

//        int n = new Scanner(System.in).nextInt();
//        rec4(n);
          int n = new Scanner(System.in).nextInt();

          System.out.println(rec5(n,0));


    }




}