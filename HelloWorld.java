
import java.lang.Math; // headers MUST be above the first class

// one class needs to have a main() method
public class HelloWorld
{
  // arguments are passed using the text field below this editor
  public static void main(String[] args)
  {
    int[] jahre = {1800,1900,1950,1968,1969,1990,2000,2001,2002,2010,2011,2012,2013,2016};
    for (int i=0;i<jahre.length;i++){
    int j = jahre[i];
      System.out.print("Das Jahr" + j + " ist: ");
      if ((j % 4 ==0 && j % 400 == 0)|| (j% 4 == 0 && j% 100 != 0) ){
      System.out.println("ein Schlatjahr");
      }
      else{
        System.out.println("kein Schaltjahr");
          }
      
    }
  
  }
  }
