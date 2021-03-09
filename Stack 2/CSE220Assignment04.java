// This will only work for digits with operators. Not with brackets. Working on that.....
// Example : 8/2+5-3*8
// Post Fix Expression: 82/538*-+ 
// Answer: -15 
import java.util.Scanner;
public class CSE220Assignment04{
  public static String postFixBuilder(String s){
    Stack headStack = new Stack(null,null);
    Stack stack = new Stack();
    for(int i = 0; i<s.length(); i++){
      if(Character.isDigit(s.charAt(i))){
        stack.postFix=stack.postFix+s.charAt(i);
      }
      else if(s.charAt(i)=='+'||s.charAt(i)=='-'||s.charAt(i)=='*'||s.charAt(i)=='/'||s.charAt(i)=='%'){
        stack.push(s.charAt(i));
      }
      }
    for(Node i = stack.top; i!=null; i=i.next){
      stack.postFix=stack.postFix+stack.pop();
    }
    return stack.postFix;
  }
  public static int postFixEvaluator(String s){
    st n = new st();
    for(int i = 0; i<s.length(); i++){
      if(Character.isDigit(s.charAt(i))){
      n.push((Character.getNumericValue(s.charAt(i))));
      }
      else if(s.charAt(i)=='+'){
        int p = n.pop();
        n.push(n.pop()+p);
      }
      else if(s.charAt(i)=='-'){
        int p = n.pop();
        n.push(n.pop()-p);
      }
      else if(s.charAt(i)=='*'){
        int p = n.pop();
        n.push(n.pop()*p);
      }
      else if(s.charAt(i)=='/') {
        int p = n.pop();
        n.push(n.pop()/p);
      }
      else if(s.charAt(i)=='%'){
        int p = n.pop();
        n.push(n.pop()%p);
      }
      }
      return n.getresult();
    }
  public static void main(String[]args){
    String exp=new Scanner(System.in).next();
    String postFixExp = postFixBuilder(exp);
    System.out.println("Post Fix Expression: "+postFixExp);
    int result = postFixEvaluator(postFixExp);
    System.out.println("Answer: "+result);
  }
}