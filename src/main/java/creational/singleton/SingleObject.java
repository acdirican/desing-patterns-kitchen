package creational.singleton;

public class SingleObject {
	   
	   private static int i=0;
	  
	   //create an object of SingleObject
	   private static SingleObject instance = new SingleObject();

	   //make the constructor private so that this class cannot be
	   //instantiated
	   private SingleObject(){}

	   //Get the only object available
	   public static SingleObject getInstance(){
		  i++;
	      return instance;
	   }

	   public void showMessage(){
	      System.out.println("Instance request: " + i);
	   }
	}