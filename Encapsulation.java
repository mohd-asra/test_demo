package threads;

class Encapsulate 
{ 
   private String Name; //can be accessed using setter and getter methods.


   public String getName()   //getter
   { 
     return Name; 
   } 

   public void setName(String newName)  //setter
   { 
     Name = newName; 
   } 

}
public class Encapsulation 
{     
   public static void main (String[] args)  
   { 
       Encapsulate obj = new Encapsulate(); 
       obj.setName(" asra "); 
       System.out.println("My name is" + obj.getName()); 
          
   } 
}

