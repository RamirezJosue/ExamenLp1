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
@Table(name = "examen_estomatologico")
@NamedQueries({
    @NamedQuery(name = "ExamenEstomatologico.findAll", query = "SELECT e FROM ExamenEstomatologico e")})
public class ExamenEstomatologico implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "idExamenestomatologico")
    private Integer idExamenestomatologico;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "atm")
    private String atm;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "ganglios")
    private String ganglios;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "labios")
    private String labios;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "vestibulo")
    private String vestibulo;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "paladarduroblando")
    private String paladarduroblando;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "lengua")
    private String lengua;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "piso_boca")
    private String pisoBoca;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "periodonto")
    private String periodonto;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "otros")
    private String otros;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "ampliacion")
    private String ampliacion;
    @JoinColumn(name = "idAnalisis", referencedColumnName = "idAnalisis")
    @ManyToOne(optional = false)
    private Analisis idAnalisis;

    public ExamenEstomatologico() {
    }

    public ExamenEstomatologico(Integer idExamenestomatologico) {
        this.idExamenestomatologico = idExamenestomatologico;
    }

    public ExamenEstomatologico(Integer idExamenestomatologico, String atm, String ganglios, String labios, String vestibulo, String paladarduroblando, String lengua, String pisoBoca, String periodonto, String otros, String ampliacion) {
        this.idExamenestomatologico = idExamenestomatologico;
        this.atm = atm;
        this.ganglios = ganglios;
        this.labios = labios;
        this.vestibulo = vestibulo;
        this.paladarduroblando = paladarduroblando;
        this.lengua = lengua;
        this.pisoBoca = pisoBoca;
        this.periodonto = periodonto;
        this.otros = otros;
        this.ampliacion = ampliacion;
    }

    public Integer getIdExamenestomatologico() {
        return idExamenestomatologico;
    }

    public void setIdExamenestomatologico(Integer idExamenestomatologico) {
        this.idExamenestomatologico = idExamenestomatologico;
    }

    public String getAtm() {
        return atm;
    }

    public void setAtm(String atm) {
        this.atm = atm;
    }

    public String getGanglios() {
        return ganglios;
    }

    public void setGanglios(String ganglios) {
        this.ganglios = ganglios;
    }

    public String getLabios() {
        return labios;
    }

    public void setLabios(String labios) {
        this.labios = labios;
    }

    public String getVestibulo() {
        return vestibulo;
    }

    public void setVestibulo(String vestibulo) {
        this.vestibulo = vestibulo;
    }

    public String getPaladarduroblando() {
        return paladarduroblando;
    }

    public void setPaladarduroblando(String paladarduroblando) {
        this.paladarduroblando = paladarduroblando;
    }

    public String getLengua() {
        return lengua;
    }

    public void setLengua(String lengua) {
        this.lengua = lengua;
    }

    public String getPisoBoca() {
        return pisoBoca;
    }

    public void setPisoBoca(String pisoBoca) {
        this.pisoBoca = pisoBoca;
    }

    public String getPeriodonto() {
        return periodonto;
    }

    public void setPeriodonto(String periodonto) {
        this.periodonto = periodonto;
    }

    public String getOtros() {
        return otros;
    }

    public void setOtros(String otros) {
        this.otros = otros;
    }

    public String getAmpliacion() {
        return ampliacion;
    }

    public void setAmpliacion(String ampliacion) {
        this.ampliacion = ampliacion;
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
        hash += (idExamenestomatologico != null ? idExamenestomatologico.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ExamenEstomatologico)) {
            return false;
        }
        ExamenEstomatologico other = (ExamenEstomatologico) object;
        if ((this.idExamenestomatologico == null && other.idExamenestomatologico != null) || (this.idExamenestomatologico != null && !this.idExamenestomatologico.equals(other.idExamenestomatologico))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pe.edu.upeu.model.ExamenEstomatologico[ idExamenestomatologico=" + idExamenestomatologico + " ]";
    }
    
}
