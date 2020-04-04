package com.cts.springmvc.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.cts.springmvc.entity.Employee;



@Repository//marker for persistence layer
public class EmployeeDAOImpl
{

	@Autowired
	SessionFactory sessionFactory;//dispatcher-servlet.xm

	public void createEmployee(Employee employee) {
		Session session = sessionFactory.openSession();
		session.save(employee);//persist hibernate
		System.out.println("Record Inserted");
		session.close();
	}
	
	public List<Employee> getEmployee() 
	{
		//get the hibernate session
		Session session = sessionFactory.openSession();
		//create a query.. sort by lastName
	//sorting the record by name 	
		Query theQuery = session.createQuery("from Employee order by name");
		List<Employee> e1 = theQuery.list();
		return e1;
	}
	public void deleteEmp(long theId)
	{
		Session session = sessionFactory.openSession();
		//:abc runtime variable
		Query theQuery = session.createQuery("delete from Employee where id=:abc");
		theQuery.setParameter("abc", theId);
		theQuery.executeUpdate();
	}
	
	 
	public void update(String username,String name)
	{
		Session session = sessionFactory.openSession();
		//:abc runtime variable
		Query theQuery = session.createQuery("update Employee set username=? where name=?");
		theQuery.setParameter(0,username);
		theQuery.setParameter(1,name);
		theQuery.executeUpdate();
	}
	
	  public boolean checkLogin(String AuserName, String AuserPassword){
			System.out.println("In Check login");
			Session session = sessionFactory.openSession();
			boolean userFound = false;
			//Query using Hibernate Query Language
			String SQL_QUERY ="from Admin as o where o.Ausername=? and o.Apassword=?";
			Query query = session.createQuery(SQL_QUERY);
			query.setParameter(0,AuserName);//first ?
			query.setParameter(1,AuserPassword);//second ?
			List list = query.list();

			if ((list != null) && (list.size() > 0)) {
				userFound= true;
			}

			session.close();
			return userFound;              
   }

	  
	  
}
