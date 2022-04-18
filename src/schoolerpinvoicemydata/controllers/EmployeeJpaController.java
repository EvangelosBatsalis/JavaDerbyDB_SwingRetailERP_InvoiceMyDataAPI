/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package schoolerpinvoicemydata.controllers;

import schoolerpinvoicemydata.entityClasses.Employee;
import schoolerpinvoicemydata.entityClasses.exceptions.NonexistentEntityException;
import schoolerpinvoicemydata.entityClasses.exceptions.PreexistingEntityException;
import java.io.Serializable;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import javax.swing.JOptionPane;

/**
 *
 * @author vbat
 */
public class EmployeeJpaController implements Serializable {
    
    String UrlConnection = "jdbc:derby://localhost:1527/InvoiceMyDataAPI";
    String DBuserName = "sa";
    String DBpassWord = "sa";

    public EmployeeJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Employee employee) throws PreexistingEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(employee);
            em.getTransaction().commit();
        } catch (Exception ex) {
            if (findEmployee(employee.getUsername()) != null) {
                throw new PreexistingEntityException("Employee " + employee + " already exists.", ex);
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Employee employee) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            employee = em.merge(employee);
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                String id = employee.getUsername();
                if (findEmployee(id) == null) {
                    throw new NonexistentEntityException("The employee with id " + id + " no longer exists.");
                }
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void destroy(String id) throws NonexistentEntityException {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Employee employee;
            try {
                employee = em.getReference(Employee.class, id);
                employee.getUsername();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The employee with id " + id + " no longer exists.", enfe);
            }
            em.remove(employee);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Employee> findEmployeeEntities() {
        return findEmployeeEntities(true, -1, -1);
    }

    public List<Employee> findEmployeeEntities(int maxResults, int firstResult) {
        return findEmployeeEntities(false, maxResults, firstResult);
    }

    private List<Employee> findEmployeeEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Employee.class));
            Query q = em.createQuery(cq);
            if (!all) {
                q.setMaxResults(maxResults);
                q.setFirstResult(firstResult);
            }
            return q.getResultList();
        } finally {
            em.close();
        }
    }

    public Employee findEmployee(String id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Employee.class, id);
        } finally {
            em.close();
        }
    }

    public int getEmployeeCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Employee> rt = cq.from(Employee.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
        //Custom SQL Queries through Controller
    public Boolean getDatabaseRecordCheck(String jTextFieldUserName){
        Boolean isEmpty = false;
        String SELECT_QUERY = "SELECT * FROM SA.EMPLOYEES WHERE USERNAME = '"+jTextFieldUserName+"'";//"SELECT * FROM SA.EMPLOYEES WHERE USERNAME = "+userName;
                
        try{
            Connection con = DriverManager.getConnection(UrlConnection,DBuserName,DBpassWord);
            Statement stmt = con.createStatement();
            ResultSet result = stmt.executeQuery(SELECT_QUERY);
            System.out.println(result);
            System.out.println(isEmpty);
            if(result.next() == false){
                isEmpty = false;
            }else{
                isEmpty = true;
                do{ 
                    String uname = result.getString("USERNAME");
                    String password = result.getString("PASSWORD");
                    System.out.println(isEmpty);
                    System.out.println("UserName: "+jTextFieldUserName+ "\t"+ "PassWord: "+password);
                }while(result.next());
            }
            
        }catch(SQLException e){
            System.out.println(e);
        }
        return isEmpty;
        
    }
    
    public Boolean getPasswordValidationCheck(String jPasswordField){
        Boolean isNumber = false;
        while(true){
            try{                
                Integer.parseInt(jPasswordField);
                //JOptionPane.showMessageDialog(null, "Password Accepted", this.getTitle(), JOptionPane.WARNING_MESSAGE);
                isNumber = true;
                break;
            }catch(NumberFormatException e){
                JOptionPane.showMessageDialog(null, "Only numbers are allowed", "warning", JOptionPane.WARNING_MESSAGE);
                isNumber = false;
                break;
            }
        }
        
        
        return isNumber;
        
        
    }
    
}
