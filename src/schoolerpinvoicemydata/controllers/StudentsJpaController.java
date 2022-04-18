/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package schoolerpinvoicemydata.controllers;

import schoolerpinvoicemydata.entityClasses.Students;
import schoolerpinvoicemydata.entityClasses.exceptions.NonexistentEntityException;
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
public class StudentsJpaController implements Serializable {
    
    String UrlConnection = "jdbc:derby://localhost:1527/InvoiceMyDataAPI";
    String DBuserName = "sa";
    String DBpassWord = "sa";

    public StudentsJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Students students) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(students);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Students students) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            students = em.merge(students);
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                Integer id = students.getCustomerid();
                if (findStudents(id) == null) {
                    throw new NonexistentEntityException("The students with id " + id + " no longer exists.");
                }
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void destroy(Integer id) throws NonexistentEntityException {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Students students;
            try {
                students = em.getReference(Students.class, id);
                students.getCustomerid();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The students with id " + id + " no longer exists.", enfe);
            }
            em.remove(students);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Students> findStudentsEntities() {
        return findStudentsEntities(true, -1, -1);
    }

    public List<Students> findStudentsEntities(int maxResults, int firstResult) {
        return findStudentsEntities(false, maxResults, firstResult);
    }

    private List<Students> findStudentsEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Students.class));
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

    public Students findStudents(Integer id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Students.class, id);
        } finally {
            em.close();
        }
    }

    public int getStudentsCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Students> rt = cq.from(Students.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
    //Custom SQL Queries through Controller
    private Boolean databaseRecordCheck(String jTextFieldUserName){
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
    
    private Boolean passwordValidationCheck(String jPasswordField){
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
