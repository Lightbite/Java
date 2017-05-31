
import java.lang.Math; // headers MUST be above the first class
 
 
public class KontoVerwaltung
{
  public static void main(String[] args)
  {
    Konto[] Ar = new Konto[10];
   
    for (int i= 0 ; i<10 ;i++){  
     Ar[i] = new Konto(i+1);
     System.out.println(Ar[i].Kontonummer + ": " +Ar[i].Kontostand);
    }
  }
}
 
 
public class Konto
{
 
int Kontonummer;
double Kontostand;
 
public Konto (int Kontonummer){
 
  this.Kontonummer = Kontonummer;
  this.Kontostand = 0;
    }
 
  public boolean einzahlen(double x){
   
    if (x >0){
    Kontostand = Kontostand + x;
    return(true);
    }
    else{
    return(false);
    }
 
  }
  public boolean auszahlen(double x){
    if (x>0){
    Kontostand = Kontostand - x;
    return(true);
    }
    else{
    return(false);
    }
  }
 
}