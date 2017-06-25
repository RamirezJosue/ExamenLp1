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
@Table(name = "anamesis")
@NamedQueries({
    @NamedQuery(name = "Anamesis.findAll", query = "SELECT a FROM Anamesis a")})
public class Anamesis implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "idAnamesis")
    private Integer idAnamesis;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 1)
    @Column(name = "amenesis_pre1")
    private String amenesisPre1;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 1)
    @Column(name = "amenesis_pre2")
    private String amenesisPre2;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 1)
    @Column(name = "amenesis_pre3")
    private String amenesisPre3;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 80)
    @Column(name = "ampliacion")
    private String ampliacion;
    @JoinColumn(name = "idAnalisis", referencedColumnName = "idAnalisis")
    @ManyToOne(optional = false)
    private Analisis idAnalisis;

    public Anamesis() {
    }

    public Anamesis(Integer idAnamesis) {
        this.idAnamesis = idAnamesis;
    }

    public Anamesis(Integer idAnamesis, String amenesisPre1, String amenesisPre2, String amenesisPre3, String ampliacion) {
        this.idAnamesis = idAnamesis;
        this.amenesisPre1 = amenesisPre1;
        this.amenesisPre2 = amenesisPre2;
        this.amenesisPre3 = amenesisPre3;
        this.ampliacion = ampliacion;
    }

    public Integer getIdAnamesis() {
        return idAnamesis;
    }

    public void setIdAnamesis(Integer idAnamesis) {
        this.idAnamesis = idAnamesis;
    }

    public String getAmenesisPre1() {
        return amenesisPre1;
    }

    public void setAmenesisPre1(String amenesisPre1) {
        this.amenesisPre1 = amenesisPre1;
    }

    public String getAmenesisPre2() {
        return amenesisPre2;
    }

    public void setAmenesisPre2(String amenesisPre2) {
        this.amenesisPre2 = amenesisPre2;
    }

    public String getAmenesisPre3() {
        return amenesisPre3;
    }

    public void setAmenesisPre3(String amenesisPre3) {
        this.amenesisPre3 = amenesisPre3;
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
        hash += (idAnamesis != null ? idAnamesis.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Anamesis)) {
            return false;
        }
        Anamesis other = (Anamesis) object;
        if ((this.idAnamesis == null && other.idAnamesis != null) || (this.idAnamesis != null && !this.idAnamesis.equals(other.idAnamesis))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pe.edu.upeu.model.Anamesis[ idAnamesis=" + idAnamesis + " ]";
    }
    
}
