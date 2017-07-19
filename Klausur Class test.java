public class Main {

 public static void main(String[] args) {
   
   Auto[] Ar = new Auto[1];   // 1 zeiliges Array vom typ Auto erstellen 
   
   Ar[0] = new Auto(17,27000,true);  // Werte des nullten Array-Eintrages definieren
   
     System.out.println("Modell:" +Ar[0].modell + " Preis:" +Ar[0].preis +" Benzin:" +Ar[0].benzin);
   
	Ar[0].setpreis(12000);  // Methode über Array bzw. Objekt ansprechen
   
   System.out.println("Modell:" +Ar[0].modell + " Preis:" +Ar[0].preis +" Benzin:" +Ar[0].benzin);
   
   System.out.println(Ar[0].getbenzin());
 }
}

public class Auto 
{

int modell;
int preis;
boolean benzin;
  
public Auto(int modell, int preis, boolean benzin){
  this.modell = 2000 + modell;
  this.preis = preis;
  this.benzin = benzin;
  }
  
  
  public void setpreis(int preis){
  this.preis = preis;
  }
  
  public boolean getbenzin(){
  return this.benzin;
  }
}
