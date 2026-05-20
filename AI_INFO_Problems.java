import java.util.Scanner;

class InvalidAge extends Exception{
    InvalidAge(String S){
        super(S);
    }
}

class InvalidEmail extends Exception{
    InvalidEmail(String S){
        super(S);
    }
}
class WeakPassword extends Exception{
    WeakPassword(String S){
        super(S);
    }
}
class InsuffientBalance extends Exception{
    InsuffientBalance(String S){
        super(S);
    }
}
public class AI_INFO_Problems {
    // {
    // userId: "501",
    // userName:"Alex",
    // userAge:"21",
    // city:"Chennai"}
    public static void main(String[] args) throws InvalidAge,InvalidEmail,WeakPassword,InsuffientBalance,ArithmeticException
    {
       int age = new Scanner(System.in).nextInt();
        String email = new Scanner(System.in).nextLine() , password = new Scanner(System.in).nextLine();
        if(age<18){
            throw new InvalidAge("Age should be Greater than 18");
        }
        if(! (email.contains("@"))){
            throw new InvalidEmail("Given email is Invalid");
        }
        if(password.length() < 6) {
            throw new WeakPassword("Password is Weak");
        }
        int balance = 100;
        System.out.println("Enter Amount:");
        int amount = new Scanner(System.in).nextInt();
        if(balance<amount){
            throw new InsuffientBalance("Amount is higher than your balance");
        }
        try{
            int n = 10/0;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
