import java.lang.Math; // headers MUST be above the first class

// one class needs to have a main() method
public class HelloWorld
{
  // arguments are passed using the text field below this editor
  public static void main(String[] args)
  {
   double x=1.66666;
   byte y = 3;
    runden(x,y);
    
  }

  public static void runden(double x,byte y){
  	x = Math.round(x*(Math.pow(10,y)));
  	x = x/Math.pow(10,y);
    System.out.print(x);
  }
}
