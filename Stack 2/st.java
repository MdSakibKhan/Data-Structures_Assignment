public class st{
  Node result;
  int size = 0;
  void push(Object e){
    Node n = new Node(e,result);
    result = n;
    size++;
  }
  int pop(){
    Object c = result.element;
    result = result.next;
    size--;
    return (int)c;
  }
  int getresult(){
  return (int)result.element;
  }
}