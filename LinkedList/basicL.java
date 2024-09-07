package LinkedList;


 class Node{
  int data;
   Node next;

Node(int data){
    this.data = data;
}
}


public class basicL {
  
   public static void main(String[] args){
        Node  a = new Node(10);
        Node  b = new Node(40);
        Node  c = new Node(30);
        Node  d = new Node(40);
        Node  e = new Node(60);


        a.next = b;
        // System.out.println(b.data);
        b.next = c;
        c.next = d;
         d.next = e;


        //  System.out.println(a.next.next.next.next.data);
         

        Node temp = a;
        while(temp != null){
           System.out.print(temp.data+" ");
          temp = temp.next;
        }

    

        
    }
    
}
