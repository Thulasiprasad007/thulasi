package dao;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import pojo.Employee;
/*
 GET:
 No records means NULL, If no row is available in the session cache 
 LOAD:
 No records means ObjectNotFoundException
 */

public class GetLoadMain
{

	public static void main(String[] args) 
	{
		SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		Session session =sessionFactory.openSession();
	
		//start a transaction
		Transaction tx = session.beginTransaction();

		//EmployeePojo e1=new EmployeePojo();
		Scanner scan = new Scanner(System.in);
		System.out.println("Eno: ");
		int eno1=scan.nextInt();
		//CTS_EMPDEMO MYSQL TABLE
		//Employee obj1 = (Employee) session.load(Employee.class,eno1);//No records means ObjectNotFoundException
		Employee obj1 = (Employee) session.get(Employee.class,eno1);//No records means NULL
		
		System.out.println("Persistent Object: "+obj1);
		System.out.println("Current Salary: "+obj1.getEmpSal());
		System.out.println("Appraisal Amt: ");
		float salary1=scan.nextFloat();
		obj1.setEmpSal(obj1.getEmpSal()+salary1);
		System.out.println("Current salary:"+obj1.getEmpSal());
		tx.commit();

		 Transaction tx11 = session.beginTransaction();
		 System.out.println("Enter ENO to delete: ");
		 int eno3=scan.nextInt();
		 Employee u = (Employee) session.load(Employee.class,eno3);
		 session.delete(u);//HIBERNATE CRUD
		 tx11.commit();
		 System.out.println("\n\n Record Deleted "+u.getEmpNo());

	}


	}


