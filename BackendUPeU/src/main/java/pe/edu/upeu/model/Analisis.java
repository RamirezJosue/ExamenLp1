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
@Table(name = "analisis")
@NamedQueries({
    @NamedQuery(name = "Analisis.findAll", query = "SELECT a FROM Analisis a")})
public class Analisis implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "idAnalisis")
    private Integer idAnalisis;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 80)
    @Column(name = "notivo_consulta")
    private String notivoConsulta;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 80)
    @Column(name = "riesgo")
    private String riesgo;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 5)
    @Column(name = "estado")
    private String estado;
    @Basic(optional = false)
    @NotNull
    @Column(name = "fecha")
    @Temporal(TemporalType.DATE)
    private Date fecha;
    @JoinColumn(name = "idPaciente", referencedColumnName = "idPaciente")
    @ManyToOne(optional = false)
    private Paciente idPaciente;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idAnalisis")
    @JsonIgnore
    private List<Anamesis> anamesisList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idAnalisis")
    @JsonIgnore
    private List<ExamenAuxiliares> examenAuxiliaresList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idAnalisis")
    @JsonIgnore
    private List<ExamenEstomatologico> examenEstomatologicoList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idAnalisis")
    @JsonIgnore
    private List<AntQuirurgico> antQuirurgicoList;

    public Analisis() {
    }

    public Analisis(Integer idAnalisis) {
        this.idAnalisis = idAnalisis;
    }

    public Analisis(Integer idAnalisis, String notivoConsulta, String riesgo, String estado, Date fecha) {
        this.idAnalisis = idAnalisis;
        this.notivoConsulta = notivoConsulta;
        this.riesgo = riesgo;
        this.estado = estado;
        this.fecha = fecha;
    }

    public Integer getIdAnalisis() {
        return idAnalisis;
    }

    public void setIdAnalisis(Integer idAnalisis) {
        this.idAnalisis = idAnalisis;
    }

    public String getNotivoConsulta() {
        return notivoConsulta;
    }

    public void setNotivoConsulta(String notivoConsulta) {
        this.notivoConsulta = notivoConsulta;
    }

    public String getRiesgo() {
        return riesgo;
    }

    public void setRiesgo(String riesgo) {
        this.riesgo = riesgo;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Paciente getIdPaciente() {
        return idPaciente;
    }

    public void setIdPaciente(Paciente idPaciente) {
        this.idPaciente = idPaciente;
    }

    public List<Anamesis> getAnamesisList() {
        return anamesisList;
    }

    public void setAnamesisList(List<Anamesis> anamesisList) {
        this.anamesisList = anamesisList;
    }

    public List<ExamenAuxiliares> getExamenAuxiliaresList() {
        return examenAuxiliaresList;
    }

    public void setExamenAuxiliaresList(List<ExamenAuxiliares> examenAuxiliaresList) {
        this.examenAuxiliaresList = examenAuxiliaresList;
    }

    public List<ExamenEstomatologico> getExamenEstomatologicoList() {
        return examenEstomatologicoList;
    }

    public void setExamenEstomatologicoList(List<ExamenEstomatologico> examenEstomatologicoList) {
        this.examenEstomatologicoList = examenEstomatologicoList;
    }

    public List<AntQuirurgico> getAntQuirurgicoList() {
        return antQuirurgicoList;
    }

    public void setAntQuirurgicoList(List<AntQuirurgico> antQuirurgicoList) {
        this.antQuirurgicoList = antQuirurgicoList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idAnalisis != null ? idAnalisis.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Analisis)) {
            return false;
        }
        Analisis other = (Analisis) object;
        if ((this.idAnalisis == null && other.idAnalisis != null) || (this.idAnalisis != null && !this.idAnalisis.equals(other.idAnalisis))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pe.edu.upeu.model.Analisis[ idAnalisis=" + idAnalisis + " ]";
    }
    
}
