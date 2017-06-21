import java.lang.Math; // headers MUST be above the first class
 
 
public class KontoVerwaltung
{
  public static void main(String[] args)
  {
   SchoolBook myComputerBook = new SchoolBook();
    myComputerBook.title = "Java ist auch eine Insel";
    myComputerBook.pagecount = 1308;
    myComputerBook.gradeLevel = 42;
    myComputerBook.printReference();
  }
}


public class Book
{
  String title;
  int pagecount;
  
  public void printReference(){
  System.out.println(title);
  System.out.println(pagecount);
  }
  
  
  }

public class SchoolBook extends Book{
int gradeLevel = -1;
}

public class Cookbook extends Book{
boolean vegetarian;

  public Cookbook(boolean vegetarian){
  this.vegetarian = vegetarian;
  }
  
  public boolean isVegetarian(){
  return(vegetarian);
  }
  
}
