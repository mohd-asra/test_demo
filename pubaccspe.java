package project;

public class pubaccspe {
	package pack1;

	public class pubaccessspecifiers {

		public void display() 
	    { 
	        System.out.println("This is Public Access Specifiers"); 
	    } 
	}

	package pack2;
	import pack1.*;

	public class accessSpecifiers4 {

		public static void main(String[] args) {
			
			pubaccessspecifiers obj = new pubaccessspecifiers(); 
	        obj.display();  
			
		}
	}


}
