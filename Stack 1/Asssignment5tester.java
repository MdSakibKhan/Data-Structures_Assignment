import java.util.Scanner;
public class Asssignment5tester{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    Stack stack = new Stack();
    String s = scan.nextLine();
    String result="";
    for(int i = 0; i<s.length(); i++){
      if(s.charAt(i)=='('||s.charAt(i)=='{'||s.charAt(i)=='['){
        stack.push(s.charAt(i),(i+1));
      }
      else if((s.charAt(i)==')'||s.charAt(i)=='}'||s.charAt(i)==']')&& stack.size==0){
        result="This expression is NOT correct.\nError character #"+(i+1)+" ";
        if(s.charAt(i)==')'){
          result= result+"'"+s.charAt(i)+"'"+"- not opened.";
        }
        else if(s.charAt(i)=='}'){
          result= result+"'"+s.charAt(i)+"'"+"- not opened.";
        }
        else if(s.charAt(i)==']'){
          result= result+"'"+s.charAt(i)+"'"+"- not opened.";
        }
        break;
      }
      else if(s.charAt(i)==')'||s.charAt(i)=='}'||s.charAt(i)==']'&& stack.size!=0){
        if(s.charAt(i)==')'){
          int p = stack.hold.pos;
          char c = stack.peek(); 
          if(stack.pop()=='('){
            result="This expression is correct.";
          }
          else{
          result="This expression is NOT correct.\nError character #"+p+" '"+c+"'  - not closed";
            break;
          }
        }
        else if(s.charAt(i)=='}'){
          int p = stack.hold.pos;
          char c = stack.peek(); 
          if(stack.pop()=='{'){
            result="This expression is correct.";
          }
          else{
            result="This expression is NOT correct.\nError character #"+p+" '"+c+"'  - not closed";
            break;
          }
        }
        else if(s.charAt(i)==']'){
          int p = stack.hold.pos;
          char c = stack.peek(); 
          if(stack.pop()=='['){
            result="This expression is correct.";
          }
          else{
           result="This expression is NOT correct.\nError character #"+p+" '"+c+"'  - not closed";
            break;
          }
        }
      }
    }
    System.out.println(result);
    
  }
}