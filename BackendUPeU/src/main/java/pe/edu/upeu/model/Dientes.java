/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.upeu.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author David
 */
@Entity
@Table(name = "dientes")
@NamedQueries({
    @NamedQuery(name = "Dientes.findAll", query = "SELECT d FROM Dientes d")})
public class Dientes implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
//    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="gen_USERS")
//    @SequenceGenerator(name="gen_USERS", sequenceName = "ARTICLE_ARTICLE_ID_SEQ")    
    @Column(name = "idDientes")
    private Integer idDientes;
    
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 60)
    @Column(name = "imagen")
    private String imagen;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 4)
    @Column(name = "codigo")
    private String codigo;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 40)
    @Column(name = "nombre")
    private String nombre;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 5)
    @Column(name = "tipoDiente")
    private String tipoDiente;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idDientes")
    @JsonIgnore
    private List<DetalleDiagnostico> detalleDiagnosticoList;

    public Dientes() {
    }

    public Dientes(Integer idDientes) {
        this.idDientes = idDientes;
    }

    public Dientes(Integer idDientes, String imagen, String codigo, String nombre, String tipoDiente) {
        this.idDientes = idDientes;
        this.imagen = imagen;
        this.codigo = codigo;
        this.nombre = nombre;
        this.tipoDiente = tipoDiente;
    }

    public Integer getIdDientes() {
        return idDientes;
    }

    public void setIdDientes(Integer idDientes) {
        this.idDientes = idDientes;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipoDiente() {
        return tipoDiente;
    }

    public void setTipoDiente(String tipoDiente) {
        this.tipoDiente = tipoDiente;
    }

    public List<DetalleDiagnostico> getDetalleDiagnosticoList() {
        return detalleDiagnosticoList;
    }

    public void setDetalleDiagnosticoList(List<DetalleDiagnostico> detalleDiagnosticoList) {
        this.detalleDiagnosticoList = detalleDiagnosticoList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idDientes != null ? idDientes.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Dientes)) {
            return false;
        }
        Dientes other = (Dientes) object;
        if ((this.idDientes == null && other.idDientes != null) || (this.idDientes != null && !this.idDientes.equals(other.idDientes))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pe.edu.upeu.model.Dientes[ idDientes=" + idDientes + " ]";
    }
    
}
