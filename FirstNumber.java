import java.util.*;

public class FirstNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("ENter the number: ");
        int n = sc.nextInt();

        while(n >= 10){
            n = n/10;
        }
        System.out.println("first number is: "+n);
    }
    
}
