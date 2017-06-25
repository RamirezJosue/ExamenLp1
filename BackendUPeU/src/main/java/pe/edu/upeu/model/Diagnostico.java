/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.upeu.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author JOSUE
 */
@Entity
@Table(name = "diagnostico")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Diagnostico.findAll", query = "SELECT d FROM Diagnostico d")
    , @NamedQuery(name = "Diagnostico.findByIdDiagnostico", query = "SELECT d FROM Diagnostico d WHERE d.idDiagnostico = :idDiagnostico")
    , @NamedQuery(name = "Diagnostico.findByEstado", query = "SELECT d FROM Diagnostico d WHERE d.estado = :estado")
    , @NamedQuery(name = "Diagnostico.findByFecha", query = "SELECT d FROM Diagnostico d WHERE d.fecha = :fecha")
    , @NamedQuery(name = "Diagnostico.findByDescripcion", query = "SELECT d FROM Diagnostico d WHERE d.descripcion = :descripcion")
    , @NamedQuery(name = "Diagnostico.findByModeloEstudio", query = "SELECT d FROM Diagnostico d WHERE d.modeloEstudio = :modeloEstudio")
    , @NamedQuery(name = "Diagnostico.findByOtros", query = "SELECT d FROM Diagnostico d WHERE d.otros = :otros")})
public class Diagnostico implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idDiagnostico")
    private Integer idDiagnostico;
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
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 80)
    @Column(name = "descripcion")
    private String descripcion;
    @Size(max = 80)
    @Column(name = "modelo_estudio")
    private String modeloEstudio;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 80)
    @Column(name = "otros")
    private String otros;
    @JoinColumn(name = "idDoctor", referencedColumnName = "idDoctor")
    @ManyToOne(optional = false)
    private Doctor idDoctor;
    @JoinColumn(name = "idPaciente", referencedColumnName = "idPaciente")
    @ManyToOne(optional = false)
    private Paciente idPaciente;

    public Diagnostico() {
    }

    public Diagnostico(Integer idDiagnostico) {
        this.idDiagnostico = idDiagnostico;
    }

    public Diagnostico(Integer idDiagnostico, String estado, Date fecha, String descripcion, String otros) {
        this.idDiagnostico = idDiagnostico;
        this.estado = estado;
        this.fecha = fecha;
        this.descripcion = descripcion;
        this.otros = otros;
    }

    public Integer getIdDiagnostico() {
        return idDiagnostico;
    }

    public void setIdDiagnostico(Integer idDiagnostico) {
        this.idDiagnostico = idDiagnostico;
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

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getModeloEstudio() {
        return modeloEstudio;
    }

    public void setModeloEstudio(String modeloEstudio) {
        this.modeloEstudio = modeloEstudio;
    }

    public String getOtros() {
        return otros;
    }

    public void setOtros(String otros) {
        this.otros = otros;
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

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idDiagnostico != null ? idDiagnostico.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Diagnostico)) {
            return false;
        }
        Diagnostico other = (Diagnostico) object;
        if ((this.idDiagnostico == null && other.idDiagnostico != null) || (this.idDiagnostico != null && !this.idDiagnostico.equals(other.idDiagnostico))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Diagnostico{" + "idDiagnostico=" + idDiagnostico + ", estado=" + estado + ", fecha=" + fecha + ", descripcion=" + descripcion + ", modeloEstudio=" + modeloEstudio + ", otros=" + otros + ", idDoctor=" + idDoctor + ", idPaciente=" + idPaciente + '}';
    }

    
    
}
