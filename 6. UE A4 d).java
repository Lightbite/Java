import java.lang.Math; // headers MUST be above the first class
 
 
public class KontoVerwaltung
{
  public static void main(String[] args)
  {
    System.out.println("Setup Normale Konten:");
    Konto[] Ar = new Konto[10];
   
    for (int i= 0 ; i<10 ;i++){  
     Ar[i] = new Konto(i+1);
     System.out.println(Ar[i].Kontonummer + ": " +Ar[i].Kontostand);
    }
    
	System.out.println("Setup Spaar Konten:");
    Spaarkonto[] SAr = new Spaarkonto[10];
   
    for (int i= 0 ; i<10 ;i++){  
     SAr[i] = new Spaarkonto(i+1);
     System.out.println(SAr[i].Kontonummer + ": " +SAr[i].Kontostand);
    }
    System.out.println("Einzahlung Spaar Konto: 100,50,300");
    SAr[0].Kontostand = 100;
	SAr[1].Kontostand = 50;
	SAr[2].Kontostand = 300;

    System.out.println("Verzinsen Spaar Konten:");
    Spaarkonto.jahresabschluss(SAr);
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

public class Spaarkonto
{
 
int Kontonummer;
double Kontostand;
double Zinssatz = 0.04;

public Spaarkonto (int Kontonummer){
 
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
  public void verzinsen(){
   	Kontostand = Kontostand + Kontostand *Zinssatz;
    }
  
  public static void jahresabschluss(Spaarkonto[] SAr){
  
    for (int i= 0 ; i<10 ;i++){  
     SAr[i].verzinsen();
     System.out.println(SAr[i].Kontonummer + ": " +SAr[i].Kontostand);
    }
  
  }
}
