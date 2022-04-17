/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package schoolerpinvoicemydata.TestQuery;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

/**
 *
 * @author vbat
 */
public class MainTest {
    static EntityManager em;
    static EntityManagerFactory emf;

    /**
     * @param args the command line arguments
     */
    
    private static void emfAndEm(){
        emf = Persistence.createEntityManagerFactory("JavaDerbyDB_SwingRetailERP_InvoiceMyDataAPIPU");
        em = emf.createEntityManager();
    }
    
    public static void main(String[] args) {
        emfAndEm();
        List<Test> test = em.createNamedQuery("Test.findAll").getResultList();  
        System.out.println(test);
        
        TestJpaController jpa = new TestJpaController(emf);
        System.out.println(jpa.getTestCount());
    
        Test t1 = new Test("aaa","bbb",111);
        jpa.create(t1);
        
    
    }
    
    
    
}
