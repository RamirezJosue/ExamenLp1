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
@Table(name = "ant_quirurgico")
@NamedQueries({
    @NamedQuery(name = "AntQuirurgico.findAll", query = "SELECT a FROM AntQuirurgico a")})
public class AntQuirurgico implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "idAntquirurgico")
    private Integer idAntquirurgico;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 5)
    @Column(name = "diabetes")
    private String diabetes;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 5)
    @Column(name = "tuberculosis")
    private String tuberculosis;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 5)
    @Column(name = "enfHepaticas")
    private String enfHepaticas;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 5)
    @Column(name = "fiebrereumatica")
    private String fiebrereumatica;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 5)
    @Column(name = "enfRenal")
    private String enfRenal;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 5)
    @Column(name = "enfCardiovascular")
    private String enfCardiovascular;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 5)
    @Column(name = "anemia")
    private String anemia;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 5)
    @Column(name = "anesticiallocal")
    private String anesticiallocal;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 5)
    @Column(name = "otrasdrogas")
    private String otrasdrogas;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 5)
    @Column(name = "hemorragias")
    private String hemorragias;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 5)
    @Column(name = "infecciones")
    private String infecciones;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 5)
    @Column(name = "alergiapenicylina")
    private String alergiapenicylina;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "otros")
    private String otros;
    @JoinColumn(name = "idAnalisis", referencedColumnName = "idAnalisis")
    @ManyToOne(optional = false)
    private Analisis idAnalisis;

    public AntQuirurgico() {
    }

    public AntQuirurgico(Integer idAntquirurgico) {
        this.idAntquirurgico = idAntquirurgico;
    }

    public AntQuirurgico(Integer idAntquirurgico, String diabetes, String tuberculosis, String enfHepaticas, String fiebrereumatica, String enfRenal, String enfCardiovascular, String anemia, String anesticiallocal, String otrasdrogas, String hemorragias, String infecciones, String alergiapenicylina, String otros) {
        this.idAntquirurgico = idAntquirurgico;
        this.diabetes = diabetes;
        this.tuberculosis = tuberculosis;
        this.enfHepaticas = enfHepaticas;
        this.fiebrereumatica = fiebrereumatica;
        this.enfRenal = enfRenal;
        this.enfCardiovascular = enfCardiovascular;
        this.anemia = anemia;
        this.anesticiallocal = anesticiallocal;
        this.otrasdrogas = otrasdrogas;
        this.hemorragias = hemorragias;
        this.infecciones = infecciones;
        this.alergiapenicylina = alergiapenicylina;
        this.otros = otros;
    }

    public Integer getIdAntquirurgico() {
        return idAntquirurgico;
    }

    public void setIdAntquirurgico(Integer idAntquirurgico) {
        this.idAntquirurgico = idAntquirurgico;
    }

    public String getDiabetes() {
        return diabetes;
    }

    public void setDiabetes(String diabetes) {
        this.diabetes = diabetes;
    }

    public String getTuberculosis() {
        return tuberculosis;
    }

    public void setTuberculosis(String tuberculosis) {
        this.tuberculosis = tuberculosis;
    }

    public String getEnfHepaticas() {
        return enfHepaticas;
    }

    public void setEnfHepaticas(String enfHepaticas) {
        this.enfHepaticas = enfHepaticas;
    }

    public String getFiebrereumatica() {
        return fiebrereumatica;
    }

    public void setFiebrereumatica(String fiebrereumatica) {
        this.fiebrereumatica = fiebrereumatica;
    }

    public String getEnfRenal() {
        return enfRenal;
    }

    public void setEnfRenal(String enfRenal) {
        this.enfRenal = enfRenal;
    }

    public String getEnfCardiovascular() {
        return enfCardiovascular;
    }

    public void setEnfCardiovascular(String enfCardiovascular) {
        this.enfCardiovascular = enfCardiovascular;
    }

    public String getAnemia() {
        return anemia;
    }

    public void setAnemia(String anemia) {
        this.anemia = anemia;
    }

    public String getAnesticiallocal() {
        return anesticiallocal;
    }

    public void setAnesticiallocal(String anesticiallocal) {
        this.anesticiallocal = anesticiallocal;
    }

    public String getOtrasdrogas() {
        return otrasdrogas;
    }

    public void setOtrasdrogas(String otrasdrogas) {
        this.otrasdrogas = otrasdrogas;
    }

    public String getHemorragias() {
        return hemorragias;
    }

    public void setHemorragias(String hemorragias) {
        this.hemorragias = hemorragias;
    }

    public String getInfecciones() {
        return infecciones;
    }

    public void setInfecciones(String infecciones) {
        this.infecciones = infecciones;
    }

    public String getAlergiapenicylina() {
        return alergiapenicylina;
    }

    public void setAlergiapenicylina(String alergiapenicylina) {
        this.alergiapenicylina = alergiapenicylina;
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
        hash += (idAntquirurgico != null ? idAntquirurgico.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof AntQuirurgico)) {
            return false;
        }
        AntQuirurgico other = (AntQuirurgico) object;
        if ((this.idAntquirurgico == null && other.idAntquirurgico != null) || (this.idAntquirurgico != null && !this.idAntquirurgico.equals(other.idAntquirurgico))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pe.edu.upeu.model.AntQuirurgico[ idAntquirurgico=" + idAntquirurgico + " ]";
    }
    
}
