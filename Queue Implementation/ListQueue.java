public class ListQueue implements Queue{
  int size;
  Node front;
  Node rear;
  
  
  public ListQueue(){
    size = 0;
    front = null;
    rear = null;
  }
  
  public int size(){
    return size;
  } 
  
  
  public boolean isEmpty(){
    if(size==0) return true;
    return false;
  } 
  
  public void enqueue(Object o) throws QueueOverflowException{
    if(size==0){
      front = new Node(o,null);
      rear=front;
      size++;
    }
    else{
      Node n = new Node(o,null);
      rear.next = n;
      rear=n;
      size++;
    }
  } 
  
  
  public Object dequeue() throws QueueUnderflowException{
    if(size==0) throw new QueueUnderflowException();
    else{
      Object p = front.val;
      front=front.next;
      size--;
      return p;
    }
  }
  
  public Object peek() throws QueueUnderflowException{
    if(size==0) throw new QueueUnderflowException();
    else return front.val;
  }
  
  
  public String toString(){
    if(size==0) return "Empty queue";
    String s = "[";
    for(Node i = front; i!=null; i=i.next){
      s=s+" "+i.val;
    }
    s=s+" ]";
    return s;
  }
  
  
  public Object[] toArray(){
    Object data[] = new Object[size];
    int c=0;
    for(Node i = front; i!=null;c++, i=i.next){
      data[c]=i.val;
    }
    return data;
  }
  
  public int search(Object o){
    int c=0;
    for(Node i = front; c<size && i!=null;c++, i=i.next){
      if(i.val.equals(o)) return c;
    }
    return -1;
  } 
  
}