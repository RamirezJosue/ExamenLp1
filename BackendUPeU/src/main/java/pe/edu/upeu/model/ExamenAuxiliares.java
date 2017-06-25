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
@Table(name = "examen_auxiliares")
@NamedQueries({
    @NamedQuery(name = "ExamenAuxiliares.findAll", query = "SELECT e FROM ExamenAuxiliares e")})
public class ExamenAuxiliares implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "idExamenAuxiliar")
    private Integer idExamenAuxiliar;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 1)
    @Column(name = "rad_aletamordida")
    private String radAletamordida;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 1)
    @Column(name = "rad_pariapical")
    private String radPariapical;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 1)
    @Column(name = "rad_panoramica")
    private String radPanoramica;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 1)
    @Column(name = "rad_oclusal")
    private String radOclusal;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 80)
    @Column(name = "otros")
    private String otros;
    @JoinColumn(name = "idAnalisis", referencedColumnName = "idAnalisis")
    @ManyToOne(optional = false)
    private Analisis idAnalisis;

    public ExamenAuxiliares() {
    }

    public ExamenAuxiliares(Integer idExamenAuxiliar) {
        this.idExamenAuxiliar = idExamenAuxiliar;
    }

    public ExamenAuxiliares(Integer idExamenAuxiliar, String radAletamordida, String radPariapical, String radPanoramica, String radOclusal, String otros) {
        this.idExamenAuxiliar = idExamenAuxiliar;
        this.radAletamordida = radAletamordida;
        this.radPariapical = radPariapical;
        this.radPanoramica = radPanoramica;
        this.radOclusal = radOclusal;
        this.otros = otros;
    }

    public Integer getIdExamenAuxiliar() {
        return idExamenAuxiliar;
    }

    public void setIdExamenAuxiliar(Integer idExamenAuxiliar) {
        this.idExamenAuxiliar = idExamenAuxiliar;
    }

    public String getRadAletamordida() {
        return radAletamordida;
    }

    public void setRadAletamordida(String radAletamordida) {
        this.radAletamordida = radAletamordida;
    }

    public String getRadPariapical() {
        return radPariapical;
    }

    public void setRadPariapical(String radPariapical) {
        this.radPariapical = radPariapical;
    }

    public String getRadPanoramica() {
        return radPanoramica;
    }

    public void setRadPanoramica(String radPanoramica) {
        this.radPanoramica = radPanoramica;
    }

    public String getRadOclusal() {
        return radOclusal;
    }

    public void setRadOclusal(String radOclusal) {
        this.radOclusal = radOclusal;
    }

    public String getOtros() {
        return otros;
    }

    public void setOtros(String otros) {
        this.otros = otros;
    }

    public Analisis getIdAnalisis() {
        return idAnalisis;
    }

    public void setIdAnalisis(Analisis idAnalisis) {
        this.idAnalisis = idAnalisis;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idExamenAuxiliar != null ? idExamenAuxiliar.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ExamenAuxiliares)) {
            return false;
        }
        ExamenAuxiliares other = (ExamenAuxiliares) object;
        if ((this.idExamenAuxiliar == null && other.idExamenAuxiliar != null) || (this.idExamenAuxiliar != null && !this.idExamenAuxiliar.equals(other.idExamenAuxiliar))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pe.edu.upeu.model.ExamenAuxiliares[ idExamenAuxiliar=" + idExamenAuxiliar + " ]";
    }
    
}
