public class test{
  public static void main(String[] args){
    int [] a = {40,30,20,50,10};
    MyOrderList c = new MyOrderList(a); // this will make a sorted Linked List
    c.print(); // this will print the sorted Linked List 10,20,30,40,50
    c.showlist();
    try{
      c.removeNode(0);
      c.print(); 
    }
    catch(InvalidException e){
      System.out.println(e);
    }
    try{
      c.removeNode(2);
      c.print(); 
    }
    catch(InvalidException e){
      System.out.println(e);
    }
    try{
      c.removeNode(6);
      c.print(); 
    }
    catch(InvalidException e){
      System.out.println(e);
    }
    try{
      Node s = c.retrieve(1);
    }
    catch(InvalidException e){
    System.out.println(e);
    }
    c.clear(); // it will clear the List
    c.print();
    c.gotoNext();
    System.out.println(c.isEmpty());
  }
}