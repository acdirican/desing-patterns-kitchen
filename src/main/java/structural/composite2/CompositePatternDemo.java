package structural.composite2;

public class CompositePatternDemo {
	   public static void main(String[] args) {
	   
	      Supervisor CEO = new Supervisor("John","CEO", 30000);

	      Supervisor headSales = new Supervisor("Robert","Head Sales", 20000);

	      Supervisor headMarketing = new Supervisor("Michel","Head Marketing", 20000);

	      Officer clerk1 = new Officer("Laura","Marketing", 10000);
	      Officer clerk2 = new Officer("Bob","Marketing", 10000);

	      Officer salesExecutive1 = new Officer("Richard","Sales", 10000);
	      Officer salesExecutive2 = new Officer("Rob","Sales", 10000);

	      CEO.add(headSales);
	      CEO.add(headMarketing);

	      headSales.add(salesExecutive1);
	      headSales.add(salesExecutive2);

	      headMarketing.add(clerk1);
	      headMarketing.add(clerk2);

	      //print all employees of the organization
	      System.out.println(CEO); 
	      
	      for (Employee employee : CEO.getSubordinates()) {
	         System.out.println(employee);
	         
	         if (employee instanceof Supervisor) {
		         for (Employee e : ((Supervisor) employee).getSubordinates()) {
		            System.out.println("->" + e);
		         }
	         }
	      }		
	   }
	}