// public class Recursion {


//     public static int Sum(int n ){
//         if(n <= 0){
//             return  0;
//         }
//         else{
//             return n + Sum(n-1);
//         }
//     }
//     public static void main(String[] args){

//         int num = 10;
         
//         System.out.println(Sum(num));

//     }
    
// }

public class Recursion {

    public static void   NaturalNumber(int n){
        if(n==0){
            return;
        }

        NaturalNumber(n-1);
        System.out.print(n+ " ");


    }
      
    public static void main(String[] args){
        int n = 10;
        NaturalNumber(n);
    }
}


