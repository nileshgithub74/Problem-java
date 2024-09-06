import java.util.*;

public class arralistDemo{

    public static void main(String[] args){
        // Integer  I = Integer.valueOf(5);
        // System.out.println(I);

            ArrayList<Integer> li = new ArrayList<>();

            // ArrayList<Boolean> li = new ArrayList<>();
            // ArrayList<Float> lif = new ArrayList<>();



    // add the element.
            li.add(5);
            li.add(4);
            li.add(6);
            li.add(2);
            li.add(2);

    
            // print  the element


            // System.out.print(li+" ");
            // System.out.println();

            // for(int i =0; i< li.size(); i++){
            //     System.out.print(li.get(i)+" ");
            // }
            
            // System.out.println();

            // for(Integer x : li){
            //     System.out.print(x+" ");
            // }
             
            // System.out.println();

            // addinng element at some index;
             
            li.add(1,100);
        

            System.out.println(li);

       // set the element at index 1
            li.set(1,10);
            System.out.println(li);

    // remove the element;
      li.remove(Integer.valueOf(10));

      System.out.println(li);
    
}
}
