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
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author David
 */
@Entity
@Table(name = "detalle_diagnostico")
@NamedQueries({
    @NamedQuery(name = "DetalleDiagnostico.findAll", query = "SELECT d FROM DetalleDiagnostico d")})
public class DetalleDiagnostico implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "idDetallediagnostico")
    private Integer idDetallediagnostico;
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
    @Size(max = 5)
    @Column(name = "estadoSituacion")
    private String estadoSituacion;
    @Size(max = 5)
    @Column(name = "accionrealizar")
    private String accionrealizar;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idDetallediagnostico")
    @JsonIgnore
    private List<DetalleTratamiento> detalleTratamientoList;
    @JoinColumn(name = "idDiagnostico", referencedColumnName = "idDiagnostico")
    @ManyToOne(optional = false)
    private Diagnostico idDiagnostico;
    @JoinColumn(name = "idDientes", referencedColumnName = "idDientes")
    @ManyToOne(optional = false)
    private Dientes idDientes;

    public DetalleDiagnostico() {
    }

    public DetalleDiagnostico(Integer idDetallediagnostico) {
        this.idDetallediagnostico = idDetallediagnostico;
    }

    public DetalleDiagnostico(Integer idDetallediagnostico, String estado, String ladoV, String ladoD, String ladoM, String ladoP, String ladoC) {
        this.idDetallediagnostico = idDetallediagnostico;
        this.estado = estado;
        this.ladoV = ladoV;
        this.ladoD = ladoD;
        this.ladoM = ladoM;
        this.ladoP = ladoP;
        this.ladoC = ladoC;
    }

    public Integer getIdDetallediagnostico() {
        return idDetallediagnostico;
    }

    public void setIdDetallediagnostico(Integer idDetallediagnostico) {
        this.idDetallediagnostico = idDetallediagnostico;
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

    public String getAccionrealizar() {
        return accionrealizar;
    }

    public void setAccionrealizar(String accionrealizar) {
        this.accionrealizar = accionrealizar;
    }

    public List<DetalleTratamiento> getDetalleTratamientoList() {
        return detalleTratamientoList;
    }

    public void setDetalleTratamientoList(List<DetalleTratamiento> detalleTratamientoList) {
        this.detalleTratamientoList = detalleTratamientoList;
    }

    public Diagnostico getIdDiagnostico() {
        return idDiagnostico;
    }

    public void setIdDiagnostico(Diagnostico idDiagnostico) {
        this.idDiagnostico = idDiagnostico;
    }

    public Dientes getIdDientes() {
        return idDientes;
    }

    public void setIdDientes(Dientes idDientes) {
        this.idDientes = idDientes;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idDetallediagnostico != null ? idDetallediagnostico.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DetalleDiagnostico)) {
            return false;
        }
        DetalleDiagnostico other = (DetalleDiagnostico) object;
        if ((this.idDetallediagnostico == null && other.idDetallediagnostico != null) || (this.idDetallediagnostico != null && !this.idDetallediagnostico.equals(other.idDetallediagnostico))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pe.edu.upeu.model.DetalleDiagnostico[ idDetallediagnostico=" + idDetallediagnostico + " ]";
    }
    
}
