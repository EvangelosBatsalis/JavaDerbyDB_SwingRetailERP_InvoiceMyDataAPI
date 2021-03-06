/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package schoolerpinvoicemydata.entityClasses;

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
@Table(name = "STUDENTS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Students.findAll", query = "SELECT s FROM Students s"),
    @NamedQuery(name = "Students.findByCustomerid", query = "SELECT s FROM Students s WHERE s.customerid = :customerid"),
    @NamedQuery(name = "Students.findByStudentfirstname", query = "SELECT s FROM Students s WHERE s.studentfirstname = :studentfirstname"),
    @NamedQuery(name = "Students.findByStudentlastname", query = "SELECT s FROM Students s WHERE s.studentlastname = :studentlastname"),
    @NamedQuery(name = "Students.findByParentfirstname", query = "SELECT s FROM Students s WHERE s.parentfirstname = :parentfirstname"),
    @NamedQuery(name = "Students.findByParentlastname", query = "SELECT s FROM Students s WHERE s.parentlastname = :parentlastname"),
    @NamedQuery(name = "Students.findByAddress", query = "SELECT s FROM Students s WHERE s.address = :address"),
    @NamedQuery(name = "Students.findByPostalcode", query = "SELECT s FROM Students s WHERE s.postalcode = :postalcode"),
    @NamedQuery(name = "Students.findByArea", query = "SELECT s FROM Students s WHERE s.area = :area"),
    @NamedQuery(name = "Students.findByPhonenumber1", query = "SELECT s FROM Students s WHERE s.phonenumber1 = :phonenumber1"),
    @NamedQuery(name = "Students.findByPhonenumber2", query = "SELECT s FROM Students s WHERE s.phonenumber2 = :phonenumber2"),
    @NamedQuery(name = "Students.findByPhonenumber3", query = "SELECT s FROM Students s WHERE s.phonenumber3 = :phonenumber3"),
    @NamedQuery(name = "Students.findByEmail1", query = "SELECT s FROM Students s WHERE s.email1 = :email1"),
    @NamedQuery(name = "Students.findByEmail2", query = "SELECT s FROM Students s WHERE s.email2 = :email2")})
public class Students implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "CUSTOMERID")
    private Integer customerid;
    @Column(name = "STUDENTFIRSTNAME")
    private String studentfirstname;
    @Column(name = "STUDENTLASTNAME")
    private String studentlastname;
    @Column(name = "PARENTFIRSTNAME")
    private String parentfirstname;
    @Column(name = "PARENTLASTNAME")
    private String parentlastname;
    @Column(name = "ADDRESS")
    private String address;
    @Column(name = "POSTALCODE")
    private Integer postalcode;
    @Column(name = "AREA")
    private String area;
    @Column(name = "PHONENUMBER1")
    private Integer phonenumber1;
    @Column(name = "PHONENUMBER2")
    private Integer phonenumber2;
    @Column(name = "PHONENUMBER3")
    private Integer phonenumber3;
    @Column(name = "EMAIL1")
    private String email1;
    @Column(name = "EMAIL2")
    private String email2;

    public Students() {
    }

    public Students(Integer customerid) {
        this.customerid = customerid;
    }

    public Integer getCustomerid() {
        return customerid;
    }

    public void setCustomerid(Integer customerid) {
        this.customerid = customerid;
    }

    public String getStudentfirstname() {
        return studentfirstname;
    }

    public void setStudentfirstname(String studentfirstname) {
        this.studentfirstname = studentfirstname;
    }

    public String getStudentlastname() {
        return studentlastname;
    }

    public void setStudentlastname(String studentlastname) {
        this.studentlastname = studentlastname;
    }

    public String getParentfirstname() {
        return parentfirstname;
    }

    public void setParentfirstname(String parentfirstname) {
        this.parentfirstname = parentfirstname;
    }

    public String getParentlastname() {
        return parentlastname;
    }

    public void setParentlastname(String parentlastname) {
        this.parentlastname = parentlastname;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getPostalcode() {
        return postalcode;
    }

    public void setPostalcode(Integer postalcode) {
        this.postalcode = postalcode;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public Integer getPhonenumber1() {
        return phonenumber1;
    }

    public void setPhonenumber1(Integer phonenumber1) {
        this.phonenumber1 = phonenumber1;
    }

    public Integer getPhonenumber2() {
        return phonenumber2;
    }

    public void setPhonenumber2(Integer phonenumber2) {
        this.phonenumber2 = phonenumber2;
    }

    public Integer getPhonenumber3() {
        return phonenumber3;
    }

    public void setPhonenumber3(Integer phonenumber3) {
        this.phonenumber3 = phonenumber3;
    }

    public String getEmail1() {
        return email1;
    }

    public void setEmail1(String email1) {
        this.email1 = email1;
    }

    public String getEmail2() {
        return email2;
    }

    public void setEmail2(String email2) {
        this.email2 = email2;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (customerid != null ? customerid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Students)) {
            return false;
        }
        Students other = (Students) object;
        if ((this.customerid == null && other.customerid != null) || (this.customerid != null && !this.customerid.equals(other.customerid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "schoolerpinvoicemydata.Students[ customerid=" + customerid + " ]";
    }
    
}
