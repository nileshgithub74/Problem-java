// // public class BasicProblem{

// //     //  static void swap(int a, int b){

// //     //     System.out.println("Orginial values  before swap");
// //     //     System.out.println("a : "+a);
// //     //     System.out.println("b : "+ b);

// //     //     int tem  = a;
// //     //     a = b;
// //     //     b = tem;

// //     //     System.out.println("After Swap");   
// //     //     System.out.println("a : "+a);
// //     //     System.out.println("b : "+b);
// //     //  }

// //     static void SwapAddition(int a, int b){
// //         System.out.println("Orginial values  before swap");
// //             System.out.println("a : "+a);
// //             System.out.println("b : "+ b);

// //             a = a+b;
// //             b = a- b;
// //             a  = a- b;

// //             System.out.println("After Swap");   
// //                 System.out.println("a : "+a);
// //                 System.out.println("b : "+b);

// //     }

// //     public static void main(String[] args) {
// //         int a = 5;
// //         int b = 6;

// //         SwapAddition(a,b);

// //     }

// // }








// public class BasicProblem {

//     // static void reverse(int[] arr) {
//     //     int[] b = new int[arr.length];

//     //     for (int i = 0; i < arr.length; i++) {
//     //         b[i] = arr[arr.length - i - 1];
//     //     }

//     //     for (int i = 0; i < b.length; i++) {
//     //         System.out.print(b[i] + " ");
//     //     }
//     // }

//       static void   reverse(int[] arr){


//         for(int i=0, j = arr.length-1; i< j ; i++, j--){
//             int tem = arr[i];
//             arr[i] = arr[j];7
//         }
//       }

 

//     public static void main(String[] args) {
//         int[] arr = {1, 3, 4, 5, 2, 6, 7};
//         reverse(arr);
//     }
// }
