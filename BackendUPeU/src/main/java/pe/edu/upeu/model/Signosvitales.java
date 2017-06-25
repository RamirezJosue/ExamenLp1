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
@Table(name = "signosvitales")
@NamedQueries({
    @NamedQuery(name = "Signosvitales.findAll", query = "SELECT s FROM Signosvitales s")})
public class Signosvitales implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "idSignovitales")
    private Integer idSignovitales;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 5)
    @Column(name = "presion")
    private String presion;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 5)
    @Column(name = "pulso")
    private String pulso;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 5)
    @Column(name = "temperatura")
    private String temperatura;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 5)
    @Column(name = "peso")
    private String peso;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 5)
    @Column(name = "talla")
    private String talla;
    @JoinColumn(name = "idCitas", referencedColumnName = "idCitas")
    @ManyToOne(optional = false)
    private Citas idCitas;

    public Signosvitales() {
    }

    public Signosvitales(Integer idSignovitales) {
        this.idSignovitales = idSignovitales;
    }

    public Signosvitales(Integer idSignovitales, String presion, String pulso, String temperatura, String peso, String talla) {
        this.idSignovitales = idSignovitales;
        this.presion = presion;
        this.pulso = pulso;
        this.temperatura = temperatura;
        this.peso = peso;
        this.talla = talla;
    }

    public Integer getIdSignovitales() {
        return idSignovitales;
    }

    public void setIdSignovitales(Integer idSignovitales) {
        this.idSignovitales = idSignovitales;
    }

    public String getPresion() {
        return presion;
    }

    public void setPresion(String presion) {
        this.presion = presion;
    }

    public String getPulso() {
        return pulso;
    }

    public void setPulso(String pulso) {
        this.pulso = pulso;
    }

    public String getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(String temperatura) {
        this.temperatura = temperatura;
    }

    public String getPeso() {
        return peso;
    }

    public void setPeso(String peso) {
        this.peso = peso;
    }

    public String getTalla() {
        return talla;
    }

    public void setTalla(String talla) {
        this.talla = talla;
    }

    public Citas getIdCitas() {
        return idCitas;
    }

    public void setIdCitas(Citas idCitas) {
        this.idCitas = idCitas;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idSignovitales != null ? idSignovitales.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Signosvitales)) {
            return false;
        }
        Signosvitales other = (Signosvitales) object;
        if ((this.idSignovitales == null && other.idSignovitales != null) || (this.idSignovitales != null && !this.idSignovitales.equals(other.idSignovitales))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pe.edu.upeu.model.Signosvitales[ idSignovitales=" + idSignovitales + " ]";
    }
    
}
