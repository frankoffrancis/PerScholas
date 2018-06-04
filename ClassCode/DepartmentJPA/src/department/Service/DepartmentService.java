package department.Service;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import department.jpa.Entity.Department;


public class DepartmentService {

	public static void cretaeDepartment(Department dep) {
		// links your persistence xml file to your 
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("DepartmentJPA");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		entityManager.getTransaction().begin();
		// the persist method creates new row with object then persist changes
		entityManager.persist(dep);
		entityManager.getTransaction().commit();
		entityManager.close();
		entityManagerFactory.close();
	}
	public static Department findDepartment(int id) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("DepartmentJPA");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		Department department = entityManager.find(Department.class, id);
		entityManager.close();
		entityManagerFactory.close();
		return department;
	}
	public static void updateDepartment(int id, String departmentName) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("DepartmentJPA");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		Department foundDepartment = entityManager.find(Department.class,departmentName);
		foundDepartment.setDepartmentName(departmentName);
		entityManager.getTransaction().commit();
	}
	public static void removeEmployee(int eid) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("DepartmentJPA");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		entityManager.getTransaction().begin();
		Department foundDepartment = entityManager.find(Department.class, eid);
		entityManager.remove(foundDepartment);
		entityManager.getTransaction().commit();
	}
}
