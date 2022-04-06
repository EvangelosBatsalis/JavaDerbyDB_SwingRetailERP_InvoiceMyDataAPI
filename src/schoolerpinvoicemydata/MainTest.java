/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package schoolerpinvoicemydata;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

/**
 *
 * @author vbat
 */
public class MainTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("hi");
    
        Test test = new Test();
        EntityManagerFactory emf = new EntityManagerFactory("JavaDerbyDB_SwingRetailERP_InvoiceMyDataAPIPU");
        EntityManager em = emf.createEntityManager();
        TestJpaController tjc = new TestJpaController(emf);
        
        
    }
    
}
