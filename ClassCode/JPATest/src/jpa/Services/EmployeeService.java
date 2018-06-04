package jpa.Services;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import test.jpa.Entity.Employee;

public class EmployeeService {

	public static void main(String[] args) {
		Employee emp = new Employee();
	/*	emp.setEid(1);
		emp.seteName("Franklyn");
		emp.setSalary(150000);
		emp.setDeg("Developer");
		createEmployee(emp);*/
		int eid = 1;
		/*emp = findEmployee(eid);
		System.out.println(emp.toString());*/
		updateEmployeeSalary(eid, 200000);
		removeEmployee(eid);
	}
	public static void createEmployee(Employee newEmployee) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("JPATest");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		entityManager.getTransaction().begin();
		entityManager.persist(newEmployee);
		entityManager.getTransaction().commit();
		entityManager.close();
		entityManagerFactory.close();
	}
	public static Employee findEmployee(int eid) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("JPATest");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		Employee foundEmployee = entityManager.find(Employee.class, eid);
		return foundEmployee;
	}
	// version 1
	public static void updateEmployeeSalary(int eid, double newSalary) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("JPATest");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		entityManager.getTransaction().begin();
		Employee foundEmployee = entityManager.find(Employee.class, eid);
		foundEmployee.setSalary(newSalary);
		entityManager.getTransaction().commit();
	}
	
	//version 2
	public static void updateEmployeeSalary2(Employee e, double newSalary) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("JPATest");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		entityManager.getTransaction().begin();
		entityManager.merge(e);
		e.setSalary(newSalary);
		entityManager.getTransaction().commit();
	}
	public static void removeEmployee(int eid) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("JPATest");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		entityManager.getTransaction().begin();
		Employee foundEmployee = entityManager.find(Employee.class, eid);
		entityManager.remove(foundEmployee);
		entityManager.getTransaction().commit();
	}
}
