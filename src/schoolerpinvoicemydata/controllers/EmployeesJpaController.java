/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package schoolerpinvoicemydata.controllers;

import entityClasses.Employees;
import entityClasses.exceptions.NonexistentEntityException;
import entityClasses.exceptions.PreexistingEntityException;
import java.io.Serializable;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

/**
 *
 * @author vbat
 */
public class EmployeesJpaController implements Serializable {

    public EmployeesJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Employees employees) throws PreexistingEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(employees);
            em.getTransaction().commit();
        } catch (Exception ex) {
            if (findEmployees(employees.getUsername()) != null) {
                throw new PreexistingEntityException("Employees " + employees + " already exists.", ex);
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Employees employees) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            employees = em.merge(employees);
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                String id = employees.getUsername();
                if (findEmployees(id) == null) {
                    throw new NonexistentEntityException("The employees with id " + id + " no longer exists.");
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
            Employees employees;
            try {
                employees = em.getReference(Employees.class, id);
                employees.getUsername();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The employees with id " + id + " no longer exists.", enfe);
            }
            em.remove(employees);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Employees> findEmployeesEntities() {
        return findEmployeesEntities(true, -1, -1);
    }

    public List<Employees> findEmployeesEntities(int maxResults, int firstResult) {
        return findEmployeesEntities(false, maxResults, firstResult);
    }

    private List<Employees> findEmployeesEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Employees.class));
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

    public Employees findEmployees(String id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Employees.class, id);
        } finally {
            em.close();
        }
    }

    public int getEmployeesCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Employees> rt = cq.from(Employees.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
