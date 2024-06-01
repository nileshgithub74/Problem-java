import java.util.*;
import java.lang.*;
import java.io.*;

class Search
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int X = sc.nextInt();
		
		int A[] = new int[N];
		
		for(int i=0; i< N;i++){
		    A[i] =sc.nextInt();
		}
		
		boolean found = false;
		for(int i=0; i< N; i++){
		    if(A[i] == X){
		        found = true;
		        break;
		   }
		}
		    if(!found){
		        System.out.println("NO");
		    }else{
		        System.out.println("Yes");
		     }
		

	}
}
