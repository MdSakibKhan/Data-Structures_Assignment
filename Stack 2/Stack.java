public class Stack{
  Node top;
  int size = 0;
  Stack(){
  }
  Stack(Node e, Node c){
  }
  public static String postFix="";
  void push(Object e){
    if(size!=0){
    if(precedence(peek())<=precedence(e)){
    Node n = new Node(e,top);
    top = n;
    size++;
    }
    else{
    postFix=postFix+pop();
    Node n = new Node(e,top);
    top = n;
    size++;
    }
  }
    else{
    Node n = new Node(e,top);
    top = n;
    size++;
    }
  }
  Object pop(){
    Object c = top.element;
    top = top.next;
    size--;
    return c;
  }
  Object peek(){
  return top.element;
  }
  int precedence(Object c){
    if(c.equals('+')||c.equals('-')){
      return 1;
    }
    else return 2;
  }
}
