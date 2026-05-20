import java.util.*;
public class Hashmap{
   public static void main(String[] args) {
//        int n = new Scanner(System.in).nextInt();
//        for(int i=1;i<=n;i++){
//            for(int j=1;j<=n-i;j++){
//                System.out.print(" ");
//            }
//            for(int j=1;j<=2*i-1;j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//        for(int i=n;i>=1;i--){
//            for(int j=1;j<=n-i;j++){
//                System.out.print(" ");
//
//            }
//            for(int j=1;j<=2*i-1;j++){
//                System.out.print("*");
//            }
//            System.out.println();
  //      }
//       Scanner sc = new Scanner(System.in);
//       int r = sc.nextInt()  , c = sc.nextInt();
//       int[][] mat = new int[r][c];
//       for(int i=0;i<r;i++){
//           for(int j=0;j<c;j++){
//               mat[i][j] = sc.nextInt();
//           }
//       }
//       for(int j=0;j<c;j++){
//           System.out.print(mat[0][j]+" ");
//       }
//       for(int j=1;j<r;j++){
//           System.out.print(mat[j][c-1]+" ");
//       }
//       for(int i=c-1;i>=0;i--){
//           System.out.print(mat[r-1][i]+" ");
//       }
//       for(int i=0;i<c-1;++){
//           System.out.print(mat[r-2][]+" ");
//       }

       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       int[]  arr = new int[n];
       int sum = 0;
       for(int i=0;i<n;i++)
           arr[i] = sc.nextInt();
       for(int i =0;i<n;i++){
           int min = 99999;
           for(int j =0;j<=i;j++){
               if(arr[j]<min){
                   min = arr[j];
               }
           }
           System.out.print(min+" ");
           sum+=min;
       }
       System.out.println(sum);
    }
}