import java.util.*;
public class MyOrderList implements Cursor{
  Node head;
  int count;
  Node cr = null;
  public MyOrderList(int [] ar){
   Arrays.sort(ar);
   head = new Node(ar[0],null);
   Node tail = head;
   for(count = 1; count<ar.length;count++){
       Node x = new Node(ar[count],null);
       tail.next=x;
       tail=x;
     }
   tail.next=head;
  }
  public void print(){
    System.out.print(head.element+" ");
    for(Node n = head.next; n!=head; n=n.next){
      System.out.print(n.element+" ");
    }
    System.out.prin tln();
  }
  public void removeNode(int key)throws InvalidException{
    if(key<0 || key>count-1){
      throw new InvalidException("Invalid Node");
    }
    
    else if(key==0){
      Node store = head.next;
      for(Node tail = head.next ; tail!=head; tail=tail.next){
        if(tail.next==head){
        tail.next=tail.next.next;
        head= store;
        }
      }
      count--;
    }
    else if(key>=1 && key<count-1){
      int c = 1;
      for(Node n = head; c<count-1; c++, n=n.next){
        if(c==key){
          n.next=n.next.next;
        }
        }
      count--;
    }
    else if(key==count-1){
      int c=0;
      for(Node n = head; c<count; c++, n=n.next){
        if(n.next.next==head){
        n.next=n.next.next;
        break;
        }
    }
      count--;
  }
  }
  public void clear(){
    if(count!=0){
      head.element=0;
      for(Node n = head.next ; n!=head ; n=n.next){
      n.element=new Integer(0);
      }
    }
  }
  public Node retrieve (int searchKey)throws InvalidException{
    int c =0;
    if(searchKey>=0 && searchKey<count){
    for(Node n = head; c<=count-1; c++, n=n.next){
      cr=n;
  }
    }
    else{
    throw new InvalidException("searchKey Not Found");
    }
    return cr;
  }
  public void showlist(){
  print();
  }
  public void showlist(Node h){
    System.out.print(h.element+" ");
    for(Node n = h.next; n!=head; n=n.next){
    System.out.print(n.element+" ");
    }
    System.out.println();
  }
  void gotoNext(){
    if(cr!=null){
    showlist(cr.next);isEmpty()
  }
  boolean isEmpty(){
    if((int)head.element!=0){return false;}
    for(Node n=head.next ; n!=head; n=n.next){
      if((int)n.element!=0){
        return false;
      }
    }
    return true;
  }
}