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

/**
 *
 * @author David
 */
@Entity
@Table(name = "citas")
@NamedQueries({
    @NamedQuery(name = "Citas.findAll", query = "SELECT c FROM Citas c")})
public class Citas implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "idCitas")
    private Integer idCitas;
    @Basic(optional = false)
    @NotNull
    @Column(name = "fecha")
    @Temporal(TemporalType.DATE)
    private Date fecha;
    @Basic(optional = false)
    @NotNull
    @Column(name = "hora_inicio")
    @Temporal(TemporalType.TIME)
    private Date horaInicio;
    @Basic(optional = false)
    @NotNull
    @Column(name = "hora_fin")
    @Temporal(TemporalType.TIME)
    private Date horaFin;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idCitas")
    @JsonIgnore
    private List<Signosvitales> signosvitalesList;
    @JoinColumn(name = "idDoctor", referencedColumnName = "idDoctor")
    @ManyToOne(optional = false)
    private Doctor idDoctor;
    @JoinColumn(name = "idPaciente", referencedColumnName = "idPaciente")
    @ManyToOne(optional = false)
    private Paciente idPaciente;
    @JoinColumn(name = "idTrabajo", referencedColumnName = "idTrabajo")
    @ManyToOne(optional = false)    
    private Trabajador idTrabajo;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idCitas")
    @JsonIgnore
    private List<Tratamiento> tratamientoList;

    public Citas() {
    }

    public Citas(Integer idCitas) {
        this.idCitas = idCitas;
    }

    public Citas(Integer idCitas, Date fecha, Date horaInicio, Date horaFin) {
        this.idCitas = idCitas;
        this.fecha = fecha;
        this.horaInicio = horaInicio;
        this.horaFin = horaFin;
    }

    public Integer getIdCitas() {
        return idCitas;
    }

    public void setIdCitas(Integer idCitas) {
        this.idCitas = idCitas;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Date getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(Date horaInicio) {
        this.horaInicio = horaInicio;
    }

    public Date getHoraFin() {
        return horaFin;
    }

    public void setHoraFin(Date horaFin) {
        this.horaFin = horaFin;
    }

    public List<Signosvitales> getSignosvitalesList() {
        return signosvitalesList;
    }

    public void setSignosvitalesList(List<Signosvitales> signosvitalesList) {
        this.signosvitalesList = signosvitalesList;
    }

    public Doctor getIdDoctor() {
        return idDoctor;
    }

    public void setIdDoctor(Doctor idDoctor) {
        this.idDoctor = idDoctor;
    }

    public Paciente getIdPaciente() {
        return idPaciente;
    }

    public void setIdPaciente(Paciente idPaciente) {
        this.idPaciente = idPaciente;
    }

    public Trabajador getIdTrabajo() {
        return idTrabajo;
    }

    public void setIdTrabajo(Trabajador idTrabajo) {
        this.idTrabajo = idTrabajo;
    }

    public List<Tratamiento> getTratamientoList() {
        return tratamientoList;
    }

    public void setTratamientoList(List<Tratamiento> tratamientoList) {
        this.tratamientoList = tratamientoList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idCitas != null ? idCitas.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Citas)) {
            return false;
        }
        Citas other = (Citas) object;
        if ((this.idCitas == null && other.idCitas != null) || (this.idCitas != null && !this.idCitas.equals(other.idCitas))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pe.edu.upeu.model.Citas[ idCitas=" + idCitas + " ]";
    }
    
}
