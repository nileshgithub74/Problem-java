import java.util.*;
import java.lang.*;
import java.io.*;
class max{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t =sc.nextInt();
        
        for(int i=0 ; i< t; i++){
            int n = sc.nextInt();
            int arr[] = new int[n];
            
            int max = arr[0];
            
            for(int j=0; j<n ; j++){
                arr[j] = sc.nextInt();
                if(arr[j] > max){
                    max= arr[j];
                }
                
            }
            System.out.println(max);
        }
    }
}
