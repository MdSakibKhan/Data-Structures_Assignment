public class Stack{
  Node hold;
  int size;
  void push(Object o, int i){
    Node x = new Node(o,i,hold);
    hold = x;
    size++;
  }
  char pop(){
    Object c = hold.element;
    hold=hold.next;
    size--;
    return (char)c;
  }
  char peek(){
    return (char)hold.element;
  }
  int getpos(){
    return hold.pos;
  }
}