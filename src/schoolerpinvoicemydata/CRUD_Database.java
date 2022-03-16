/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package schoolerpinvoicemydata;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import static schoolerpinvoicemydata.Employees_.password;
import static schoolerpinvoicemydata.Employees_.username;
/**
 *
 * @author vbat
 */
public class CRUD_Database {
    
    EntityManagerFactory emf = Persistence.createEntityManagerFactory("JavaDerbyDB_SwingRetailERP_InvoiceMyDataAPIPU");
    EntityManager em = emf.createEntityManager();
    EmployeesJpaController sjc = new EmployeesJpaController(emf);   
    
    public void newUser(int kati, String userName, int passWord) throws Exception{
        Employees employee = new Employees(userName,passWord); 
        sjc.create(employee);
    }
    
}
