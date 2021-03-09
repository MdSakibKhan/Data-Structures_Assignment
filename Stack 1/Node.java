public class Node{
  Object element;
  Node next;
  int pos=0;
  public Node(Object o, int i, Node n){
    element = o;
    pos=i;
    next=n;
  }
}