
import java.lang.Math; // headers MUST be above the first class



public class DatumApp
{
  public static void main(String[] args)
  {
    Datum k1 = new Datum(1, 1, 1900);
    druckeDatum();
  } 
}


public class Datum
{
  
  int t;
  int m;
  int j;
 
  public Datum(int t,m,j){
    
    if (t>=1) && (t<=31) && (m>=1) && (m<=12){
      
    this.t = t;
    this.m = m;
    this.j = j;
      
    }
    else {
      System.print.out("Kein gültiges Datum");
    }
  
  }
  
  public void druckeDatum()
  {
  	System.out.println(k1.t + ", " + k1.m +", " + k1.j);
  }

}
