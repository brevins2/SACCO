/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sacco;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
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
import javax.persistence.Transient;

/**
 *
 * @author brevin
 */
@Entity
@Table(name = "admin", catalog = "sacco", schema = "")
@NamedQueries({
    @NamedQuery(name = "Admin_1.findAll", query = "SELECT a FROM Admin_1 a")
    , @NamedQuery(name = "Admin_1.findById", query = "SELECT a FROM Admin_1 a WHERE a.id = :id")
    , @NamedQuery(name = "Admin_1.findByName", query = "SELECT a FROM Admin_1 a WHERE a.name = :name")
    , @NamedQuery(name = "Admin_1.findByLocation", query = "SELECT a FROM Admin_1 a WHERE a.location = :location")
    , @NamedQuery(name = "Admin_1.findByRole", query = "SELECT a FROM Admin_1 a WHERE a.role = :role")
    , @NamedQuery(name = "Admin_1.findByPassword", query = "SELECT a FROM Admin_1 a WHERE a.password = :password")
    , @NamedQuery(name = "Admin_1.findByDateofentrance", query = "SELECT a FROM Admin_1 a WHERE a.dateofentrance = :dateofentrance")})
public class Admin_1 implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "Id")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "Name")
    private String name;
    @Basic(optional = false)
    @Column(name = "Location")
    private String location;
    @Basic(optional = false)
    @Column(name = "Role")
    private String role;
    @Basic(optional = false)
    @Column(name = "Password")
    private String password;
    @Basic(optional = false)
    @Column(name = "Date of entrance")
    private String dateofentrance;

    public Admin_1() {
    }

    public Admin_1(Integer id) {
        this.id = id;
    }

    public Admin_1(Integer id, String name, String location, String role, String password, String dateofentrance) {
        this.id = id;
        this.name = name;
        this.location = location;
        this.role = role;
        this.password = password;
        this.dateofentrance = dateofentrance;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        Integer oldId = this.id;
        this.id = id;
        changeSupport.firePropertyChange("id", oldId, id);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        String oldName = this.name;
        this.name = name;
        changeSupport.firePropertyChange("name", oldName, name);
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        String oldLocation = this.location;
        this.location = location;
        changeSupport.firePropertyChange("location", oldLocation, location);
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        String oldRole = this.role;
        this.role = role;
        changeSupport.firePropertyChange("role", oldRole, role);
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        String oldPassword = this.password;
        this.password = password;
        changeSupport.firePropertyChange("password", oldPassword, password);
    }

    public String getDateofentrance() {
        return dateofentrance;
    }

    public void setDateofentrance(String dateofentrance) {
        String oldDateofentrance = this.dateofentrance;
        this.dateofentrance = dateofentrance;
        changeSupport.firePropertyChange("dateofentrance", oldDateofentrance, dateofentrance);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Admin_1)) {
            return false;
        }
        Admin_1 other = (Admin_1) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "sacco.Admin_1[ id=" + id + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
