package com.kogent.hibernate;
import java.util.Iterator;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.Query;
import org.hibernate.cfg.Configuration;

import com.kogent.hibernate.Employee;
public class TestHibernate {
	
	public static void main(String[] args) {
	    Session session = null;

	    try{
	      // This step will read hibernate.cfg.xml 
	//and prepare hibernate for use
	      SessionFactory sessionFactory = new 
	Configuration().configure().buildSessionFactory();
	       session =sessionFactory.openSession();
	        //Create new instance of Contact and set 
	//values in it by reading them from form object
	      Transaction tx = session.beginTransaction();
	       
	         System.out.println("Inserting Record");
	        Employee employee = new Employee();
	        employee.setEmployeeId(2501);
	        employee.setName("Ambrish");
	        employee.setAge(new Integer(25));
	        employee.setSalary(new Double(9856));
	        
	       session.save(employee);
	      tx.commit();
	      System.out.println("Done");
	      System.out.println("Employee Id		Name 	        Age    Salary");
	      Query query = session.createQuery("select employee1.employeeId, employee1.name, employee1.age, employee1.salary from Employee employee1");
	      for(Iterator it=query.iterate();it.hasNext();){
	            Object[] row = (Object[]) it.next();
	            System.out.print(row[0]+"            ");
	            System.out.print("       "+row[1]+ "    ");
	            System.out.print("       "+row[2]);
	            System.out.print("       "+row[3]);
	            System.out.println();
	      }
	    }catch(Exception e){
	      System.out.println(e.getMessage());
	    }finally{
	      // Actual contact insertion will happen at this step
	      session.flush();
	      session.close();

	      }
	    
	  }
	} 


