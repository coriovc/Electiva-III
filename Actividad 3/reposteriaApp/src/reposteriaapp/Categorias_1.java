/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reposteriaapp;

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
 * @author Mau
 */
@Entity
@Table(name = "categorias", catalog = "reposteria", schema = "")
@NamedQueries({
    @NamedQuery(name = "Categorias_1.findAll", query = "SELECT c FROM Categorias_1 c")
    , @NamedQuery(name = "Categorias_1.findByidcate", query = "SELECT c FROM Categorias_1 c WHERE c.idcate = :idcate")
    , @NamedQuery(name = "Categorias_1.findBynombrecate", query = "SELECT c FROM Categorias_1 c WHERE c.nombrecate = :nombrecate")
    , @NamedQuery(name = "Categorias_1.findByprecio", query = "SELECT c FROM Categorias_1 c WHERE c.precio = :precio")
    , @NamedQuery(name = "Categorias_1.findBystock", query = "SELECT c FROM Categorias_1 c WHERE c.stock = :stock")})
public class Categorias_1 implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_cate")
    private Integer idcate;
    @Basic(optional = false)
    @Column(name = "nombre_cate")
    private String nombrecate;
    @Basic(optional = false)
    @Column(name = "precio")
    private String precio;
    @Basic(optional = false)
    @Column(name = "stock")
    private String stock;

    public Categorias_1() {
    }

    public Categorias_1(Integer idcate) {
        this.idcate = idcate;
    }

    public Categorias_1(Integer idcate, String nombrecate, String precio, String stock) {
        this.idcate = idcate;
        this.nombrecate = nombrecate;
        this.precio = precio;
        this.stock = stock;
    }

    public Integer getidcate() {
        return idcate;
    }

    public void setidcate(Integer idcate) {
        Integer oldidcate = this.idcate;
        this.idcate = idcate;
        changeSupport.firePropertyChange("idcate", oldidcate, idcate);
    }

    public String getnombrecate() {
        return nombrecate;
    }

    public void setnombrecate(String nombrecate) {
        String oldnombrecate = this.nombrecate;
        this.nombrecate = nombrecate;
        changeSupport.firePropertyChange("nombrecate", oldnombrecate, nombrecate);
    }

    public String getprecio() {
        return precio;
    }

    public void setprecio(String precio) {
        String oldprecio = this.precio;
        this.precio = precio;
        changeSupport.firePropertyChange("precio", oldprecio, precio);
    }

    public String getstock() {
        return stock;
    }

    public void setstock(String stock) {
        String oldstock = this.stock;
        this.stock = stock;
        changeSupport.firePropertyChange("stock", oldstock, stock);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idcate != null ? idcate.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Categorias_1)) {
            return false;
        }
        Categorias_1 other = (Categorias_1) object;
        if ((this.idcate == null && other.idcate != null) || (this.idcate != null && !this.idcate.equals(other.idcate))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "reposteriaapp.Categorias_1[ idcate=" + idcate + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
