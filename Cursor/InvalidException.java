public class InvalidException extends Exception{
  String s = " ";
  public InvalidException(String a){
    s=a;
  }
  public String toString(){
  return s;
  }
}