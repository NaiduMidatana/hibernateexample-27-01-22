package com.mouritech.employeehibernate;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.mouritech.employeehibernate.entity.Employee;

import com.mouritech.employeehibernate.util.HibernateUtil;

public class EmployeeHibernateMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee employee1 = new Employee(001,"naidu","naidu@gmail.com","vizag",10000f,"957899645");
		Employee employee2 = new Employee(002,"ramesh","ramesh@gmail.com","hyderabad",20500f,"9589956526");
		Employee employee3 = new Employee(003,"akhil","akhil@gmail.com","bangalore",30500f,"98789794611");

		Transaction transaction = null;

		try (Session session = HibernateUtil.getSessionFactory().openSession()) {

			// start the transaction
			transaction = session.beginTransaction();
			// save the student objects in to database
			session.save(employee1);
			session.save(employee2);
			session.save(employee3);
			// commit transaction
			transaction.commit();

		} catch (Exception e) {

			if (transaction != null) {
				transaction.rollback();
			}

			e.printStackTrace();
		}

		// retrieve the data from database to java program using hibernate

		try (Session session = HibernateUtil.getSessionFactory().openSession()) {

			List<Employee> employeeList = session.createQuery("from Employee", Employee.class).list();
			employeeList.forEach(emp -> System.out.println(emp));
			
//			List<Employee> employeeList = session.createQuery("from Employee", Employee.class).list();
//			employeeList.forEach(stud -> System.out.println(stud));

		} catch (Exception e) {
			if (transaction != null) {
				transaction.rollback();
			}
			e.printStackTrace();
		}

	}


	}


