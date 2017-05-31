
import java.lang.Math; // headers MUST be above the first class



public class DatumApp
{
  public static void main(String[] args)
  {
    Datum k1 = new Datum(1, 1, 1900);
    druckeDatum(k1);
  } 
  
  public static void druckeDatum(Datum k1)
  {
  	System.out.println(k1.t + ", " + k1.m +", " + k1.j);
  }
}


public class Datum
{
  
  int t;
  int m;
  int j;
 
  public Datum(int t,int m,int j){
    
    if (t>=1 && t<=31 && m>=1 && m<=12){
      
    this.t = t;
    this.m = m;
    this.j = j;
      
    }
    else {
      System.out.print("Kein gültiges Datum");
    }
  
  }
  
  

}
