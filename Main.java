import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        while (t-- > 0) {
            int n = scanner.nextInt();
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            int[] a = new int[n];

            for (int i = 0; i < n; i++) {
                a[i] = scanner.nextInt();
            }
            // Your code goes here
            int originalCost =0;
            for(int i=0; i<n; i++){
                originalCost += a[i];
            }
            int buyingprice=0;
            for(int i=0; i<n; i++){
                
                if(a[i] > y)
                     buyingprice += (a[i] - y);
                else{
                    buyingprice += 0;
                }
                
                
                
            }
            if( x+buyingprice >= originalCost){
                System.out.println("NO COUPON");
            }else{
                System.out.println("COUPON");
                
            }
        }
    }
}
