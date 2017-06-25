/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.upeu.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author David
 */
@Entity
@Table(name = "tratamiento")
@NamedQueries({
    @NamedQuery(name = "Tratamiento.findAll", query = "SELECT t FROM Tratamiento t")})
public class Tratamiento implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "idTratamiento")
    private Integer idTratamiento;
    @Basic(optional = false)
    @NotNull
    @Column(name = "fecha")
    @Temporal(TemporalType.DATE)
    private Date fecha;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "descripcion")
    private String descripcion;
    @Basic(optional = false)
    @NotNull
    @Column(name = "costo_total")
    private double costoTotal;
    @JoinColumn(name = "idCitas", referencedColumnName = "idCitas")
    @ManyToOne(optional = false)
    private Citas idCitas;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idTratamiento")
    @JsonIgnore
    private List<DetalleTratamiento> detalleTratamientoList;

    public Tratamiento() {
    }

    public Tratamiento(Integer idTratamiento) {
        this.idTratamiento = idTratamiento;
    }

    public Tratamiento(Integer idTratamiento, Date fecha, String descripcion, double costoTotal) {
        this.idTratamiento = idTratamiento;
        this.fecha = fecha;
        this.descripcion = descripcion;
        this.costoTotal = costoTotal;
    }

    public Integer getIdTratamiento() {
        return idTratamiento;
    }

    public void setIdTratamiento(Integer idTratamiento) {
        this.idTratamiento = idTratamiento;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getCostoTotal() {
        return costoTotal;
    }

    public void setCostoTotal(double costoTotal) {
        this.costoTotal = costoTotal;
    }

    public Citas getIdCitas() {
        return idCitas;
    }

    public void setIdCitas(Citas idCitas) {
        this.idCitas = idCitas;
    }

    public List<DetalleTratamiento> getDetalleTratamientoList() {
        return detalleTratamientoList;
    }

    public void setDetalleTratamientoList(List<DetalleTratamiento> detalleTratamientoList) {
        this.detalleTratamientoList = detalleTratamientoList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idTratamiento != null ? idTratamiento.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tratamiento)) {
            return false;
        }
        Tratamiento other = (Tratamiento) object;
        if ((this.idTratamiento == null && other.idTratamiento != null) || (this.idTratamiento != null && !this.idTratamiento.equals(other.idTratamiento))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pe.edu.upeu.model.Tratamiento[ idTratamiento=" + idTratamiento + " ]";
    }
    
}
