
import java.lang.Math; // headers MUST be above the first class

// one class needs to have a main() method
public class HelloWorld
{
  // arguments are passed using the text field below this editor
  public static void main(String[] args)
  {
	System.out.println(schalt(2016));	    
    
    
    }
  
  public static boolean schalt(int j){
      if ((j % 4 ==0 && j % 400 == 0)|| (j% 4 == 0 && j% 100 != 0)){
      return true;
      }
      else{
      return false;
      }    
    }
  
  }
