import java.util.Scanner;

public class MinTOMax
 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        while (t-- > 0) {
            int n = scanner.nextInt();
            int[] a = new int[n];

            for (int i = 0; i < n; i++) {
                a[i] = scanner.nextInt();
            }

            // Your code goes here
            int min= a[0];
            int count =0;
            for(int i=0; i< n; i++){
                if(a[i] < min){
                    min = a[i];
                    
                }
            }
            for(int i=0; i<n; i++)
                  if(a[i] > min)
                      count++;
            System.out.println(count);
        }
    }
}

