package main.java.in.aurosoft;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;
import main.java.in.aurosoft.entity.Employee;
import main.javain.aurosoft.util.JPAUtil;

public class CRUDOperations {

	public void insertEntity() {
        EntityManager entityManager = JPAUtil.getEntityManagerFactory().createEntityManager();
        EntityTransaction entityTransaction = entityManager.getTransaction();
        entityTransaction.begin();
        Employee employee = new Employee("Khushi", "Bhanu", "khushi@gmail.com");
        entityManager.persist(employee);
        entityManager.getTransaction().commit();
        entityManager.close();
    }

    public void findEntity() {
        EntityManager entityManager = JPAUtil.getEntityManagerFactory().createEntityManager();
        entityManager.getTransaction().begin();
        Employee employee = entityManager.find(Employee.class, 1);
        System.out.println("employee id :: " + employee.getId());
        System.out.println("employee firstname :: " + employee.getFirstName());
        System.out.println("employee lastname :: " + employee.getLastName());
        System.out.println("employee email :: " + employee.getEmail());
        entityManager.getTransaction().commit();
        entityManager.close();
    }

    public void updateEntity() {
        EntityManager entityManager = JPAUtil.getEntityManagerFactory().createEntityManager();
        entityManager.getTransaction().begin();

        Employee employee = entityManager.find(Employee.class, 1);
        System.out.println("employee id :: " + employee.getId());
        System.out.println("employee firstname :: " + employee.getFirstName());
        System.out.println("employee lastname :: " + employee.getLastName());
        System.out.println("employee email :: " + employee.getEmail());

        // The entity object is physically updated in the database when the transaction
        // is committed
        employee.setFirstName("Khushali");
        employee.setLastName("Bhanushali");
        entityManager.getTransaction().commit();
        entityManager.close();
    }

    public void removeEntity() {
        EntityManager entityManager = JPAUtil.getEntityManagerFactory().createEntityManager();
        entityManager.getTransaction().begin();

        Employee employee = entityManager.find(Employee.class, 1);
        System.out.println("employee id :: " + employee.getId());
        System.out.println("employee firstname :: " + employee.getFirstName());
        System.out.println("employee lastname :: " + employee.getLastName());
        System.out.println("employee email :: " + employee.getEmail());
        entityManager.remove(employee);
        entityManager.getTransaction().commit();
        entityManager.close();
    }
}
