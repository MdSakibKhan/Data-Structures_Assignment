public class ArrayQueue implements Queue{
  int size;
  int front;
  int rear;
  Object [] data;
  
  public ArrayQueue(){
    size=0;
    front = -1;
    rear = -1;
    data = new Object[5];
  }
  
  public int size(){
    return size;
  } 
  
  public boolean isEmpty(){
  if(size==0) return true;
  else return false;
  }
  
  public void enqueue(Object o) throws QueueOverflowException{
    if(size<data.length){
    if(front==-1) front=(front+1)%data.length;
    rear=(rear+1)%data.length;
    data[(front+rear)%data.length]=o;
    size++;
    }
    else throw new QueueOverflowException();
  } 
  
  public Object dequeue() throws QueueUnderflowException{
    if(size==0) throw new QueueUnderflowException();
    else{
    Object r = data[front];
    data[front]=null;
    front=(front+1)%data.length;
    size--;
    return r;
    }
  }
  
  public Object peek() throws QueueUnderflowException{
    if(size==0) throw new QueueUnderflowException();
    else return data[front];
  }
  
  public String toString(){
    if(size==0) return "Empty queue";
    String s = "[";
    for(int i = front,c=0; c<size ; i=(i+1)%data.length,c++){
    s=s+" "+data[i];
    }
    s=s+" ]";
    return s;
  }
  
  public Object[] toArray(){
    Object s[] = new Object[size];
    for(int i = front, c=0; c<size; i= (i+1)%data.length , c++){
    s[c]=data[i];
    }
    return s;
  }
  
  public int search(Object o){
    for(int i = front, c=0; c<size; c++, i=(i+1)%data.length){
    if(data[i].equals(o)) return c;
    }
    return -1;
  }
  
}