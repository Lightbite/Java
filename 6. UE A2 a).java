import java.lang.Math; // headers MUST be above the first class

// one class needs to have a main() method
public class HelloWorld
{
  // arguments are passed using the text field below this editor
  public static void main(String[] args)
  {
   double x=1.66666;
    runden(x);
    
  }

  public static void runden(double x){
  	x = Math.round(x*100);
  	x = x/100;
    System.out.print(x);
  }
}
