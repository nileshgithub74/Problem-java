
// Sorting an Array consiting of only 0's and 1's 

import java.util.*;
public class TwoPointer {

    static void printArray(int[] arr){
        for(int i=0; i< arr.length; i++){
            System.out.print( arr[i]+ " ");
        }

    }

    static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    // static void sortZeroAndOnes(int[] arr){
    //     int n = arr.length;
    //     int count =0;

    //     for(int i =0; i< n; i++){
    //         if(arr[i] ==0){
    //             count++;
    //         }
    //     }

    //     for(int i=0; i<n; i++){
    //         if(i < count){
    //             arr[i] =0;
    //         }else{
    //             arr[i] = 1; 
    //         }

    //     }


    // }

    // static void sortZeroAndOnes(int[] arr){
    //     int n = arr.length;
    //     int i=0; int j = n-1;

    //     while(i<j){

    //         if(arr[i] ==1 && arr[j ] == 0){
    //             swap(arr,i,j);
    //             i++;
    //             j--;
    //         }
    //         if(arr[i] == 0){
    //             i++;
    //         }
    //         if(arr[j] ==1){
    //             j--;
    //         }

    //     }
        // printArray(arr);
           

    // }

        static void sortEvenOdd(int[] arr){
        int n = arr.length;
        int i=0; int j = n-1;

        while(i<j){

            if(arr[i] %2 ==1  && arr[j ] %2 == 0){
                swap(arr,i,j);
                i++;
                j--;
            }
            if(arr[i] %2== 0){
                i++;
            }
            if(arr[j] %2 ==1){
                j--;
            }

        }
       
           

    }


     






    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

    System.out.println("Enter the size of the array : ");
    int size = sc.nextInt();

    int[] arr = new int[size];

    System.out.println("Enter the element in the array : ");
    for(int i=0; i<size; i++){
        arr[i] = sc.nextInt();


    }
   System.out.println("Orginial array : ");
    printArray(arr);
    System.out.println();

    sortEvenOdd(arr);
    System.out.println("Sorted array : ");
    printArray(arr);
    System.out.println();






    }


    
}
