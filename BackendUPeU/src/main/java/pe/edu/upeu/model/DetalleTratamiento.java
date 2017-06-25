/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.upeu.model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author David
 */
@Entity
@Table(name = "detalle_tratamiento")
@NamedQueries({
    @NamedQuery(name = "DetalleTratamiento.findAll", query = "SELECT d FROM DetalleTratamiento d")})
public class DetalleTratamiento implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "idDetalleTratamiento")
    private Integer idDetalleTratamiento;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 5)
    @Column(name = "estado")
    private String estado;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "lado_v")
    private String ladoV;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "lado_d")
    private String ladoD;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "lado_m")
    private String ladoM;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "lado_p")
    private String ladoP;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "lado_c")
    private String ladoC;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 5)
    @Column(name = "estadoSituacion")
    private String estadoSituacion;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 5)
    @Column(name = "estadoAccion")
    private String estadoAccion;
    @Basic(optional = false)
    @NotNull
    @Column(name = "igv")
    private double igv;
    @Basic(optional = false)
    @NotNull
    @Column(name = "precio")
    private double precio;
    @Basic(optional = false)
    @NotNull
    @Column(name = "importe")
    private double importe;
    @JoinColumn(name = "idDetallediagnostico", referencedColumnName = "idDetallediagnostico")
    @ManyToOne(optional = false)
    private DetalleDiagnostico idDetallediagnostico;
    @JoinColumn(name = "idTratamiento", referencedColumnName = "idTratamiento")
    @ManyToOne(optional = false)
    private Tratamiento idTratamiento;

    public DetalleTratamiento() {
    }

    public DetalleTratamiento(Integer idDetalleTratamiento) {
        this.idDetalleTratamiento = idDetalleTratamiento;
    }

    public DetalleTratamiento(Integer idDetalleTratamiento, String estado, String ladoV, String ladoD, String ladoM, String ladoP, String ladoC, String estadoSituacion, String estadoAccion, double igv, double precio, double importe) {
        this.idDetalleTratamiento = idDetalleTratamiento;
        this.estado = estado;
        this.ladoV = ladoV;
        this.ladoD = ladoD;
        this.ladoM = ladoM;
        this.ladoP = ladoP;
        this.ladoC = ladoC;
        this.estadoSituacion = estadoSituacion;
        this.estadoAccion = estadoAccion;
        this.igv = igv;
        this.precio = precio;
        this.importe = importe;
    }

    public Integer getIdDetalleTratamiento() {
        return idDetalleTratamiento;
    }

    public void setIdDetalleTratamiento(Integer idDetalleTratamiento) {
        this.idDetalleTratamiento = idDetalleTratamiento;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getLadoV() {
        return ladoV;
    }

    public void setLadoV(String ladoV) {
        this.ladoV = ladoV;
    }

    public String getLadoD() {
        return ladoD;
    }

    public void setLadoD(String ladoD) {
        this.ladoD = ladoD;
    }

    public String getLadoM() {
        return ladoM;
    }

    public void setLadoM(String ladoM) {
        this.ladoM = ladoM;
    }

    public String getLadoP() {
        return ladoP;
    }

    public void setLadoP(String ladoP) {
        this.ladoP = ladoP;
    }

    public String getLadoC() {
        return ladoC;
    }

    public void setLadoC(String ladoC) {
        this.ladoC = ladoC;
    }

    public String getEstadoSituacion() {
        return estadoSituacion;
    }

    public void setEstadoSituacion(String estadoSituacion) {
        this.estadoSituacion = estadoSituacion;
    }

    public String getEstadoAccion() {
        return estadoAccion;
    }

    public void setEstadoAccion(String estadoAccion) {
        this.estadoAccion = estadoAccion;
    }

    public double getIgv() {
        return igv;
    }

    public void setIgv(double igv) {
        this.igv = igv;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public double getImporte() {
        return importe;
    }

    public void setImporte(double importe) {
        this.importe = importe;
    }

    public DetalleDiagnostico getIdDetallediagnostico() {
        return idDetallediagnostico;
    }

    public void setIdDetallediagnostico(DetalleDiagnostico idDetallediagnostico) {
        this.idDetallediagnostico = idDetallediagnostico;
    }

    public Tratamiento getIdTratamiento() {
        return idTratamiento;
    }

    public void setIdTratamiento(Tratamiento idTratamiento) {
        this.idTratamiento = idTratamiento;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idDetalleTratamiento != null ? idDetalleTratamiento.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DetalleTratamiento)) {
            return false;
        }
        DetalleTratamiento other = (DetalleTratamiento) object;
        if ((this.idDetalleTratamiento == null && other.idDetalleTratamiento != null) || (this.idDetalleTratamiento != null && !this.idDetalleTratamiento.equals(other.idDetalleTratamiento))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pe.edu.upeu.model.DetalleTratamiento[ idDetalleTratamiento=" + idDetalleTratamiento + " ]";
    }
    
}
