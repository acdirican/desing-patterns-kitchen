package structural.composite2;

import java.util.ArrayList;
import java.util.List;

public abstract class Employee {
   private String name;
   private String dept;
   private int salary;


   // constructor
   public Employee(String name,String dept, int sal) {
      this.name = name;
      this.dept = dept;
      this.salary = sal;

   }

   

   public String toString(){
      return "[ Name : " + name + ", dept : " + dept + ", salary :" + salary+" ]";
   }   
}