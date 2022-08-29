package structural.composite2;

import java.util.ArrayList;
import java.util.List;

public class Supervisor extends Employee{
   
   private List<Employee> subordinates;

   // constructor
   public Supervisor(String name,String dept, int sal) {
      super(name, dept, sal);
      subordinates = new ArrayList<Employee>();
   }

   public void add(Employee e) {
      subordinates.add(e);
   }

   public void remove(Supervisor e) {
      subordinates.remove(e);
   }

   public List<Employee> getSubordinates(){
     return subordinates;
   }

   public String toString(){
      return "Supervisor" + super.toString();
   }
}