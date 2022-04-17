/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package schoolerpinvoicemydata.TestQuery;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author vbat
 */
@Entity
@Table(name = "TEST")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Test.findAll", query = "SELECT t FROM Test t")
    , @NamedQuery(name = "Test.findByAutoid", query = "SELECT t FROM Test t WHERE t.autoid = :autoid")
    , @NamedQuery(name = "Test.findByTest1", query = "SELECT t FROM Test t WHERE t.test1 = :test1")
    , @NamedQuery(name = "Test.findByTest2", query = "SELECT t FROM Test t WHERE t.test2 = :test2")
    , @NamedQuery(name = "Test.findByNumber", query = "SELECT t FROM Test t WHERE t.number = :number")})
public class Test implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "AUTOID")
    private Integer autoid;
    @Column(name = "TEST1")
    private String test1;
    @Column(name = "TEST2")
    private String test2;
    @Column(name = "NUMBER")
    private Integer number;

    

    public Test(Integer autoid) {
        this.autoid = autoid;
    }

    public Integer getAutoid() {
        return autoid;
    }

    public void setAutoid(Integer autoid) {
        this.autoid = autoid;
    }

    public String getTest1() {
        return test1;
    }

    public Test(String test1, String test2, Integer number) {
        this.test1 = test1;
        this.test2 = test2;
        this.number = number;
    }

    public void setTest1(String test1) {
        this.test1 = test1;
    }

    public String getTest2() {
        return test2;
    }

    public void setTest2(String test2) {
        this.test2 = test2;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (autoid != null ? autoid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Test)) {
            return false;
        }
        Test other = (Test) object;
        if ((this.autoid == null && other.autoid != null) || (this.autoid != null && !this.autoid.equals(other.autoid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "schoolerpinvoicemydata.Test[ autoid=" + autoid + " ]";
    }
    
}
