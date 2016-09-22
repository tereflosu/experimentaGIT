package es.sanitas.mediadores.vo;

import java.util.Date;


public class BeanColectivos extends AbstractVO {

    /** Variable serialVersionUID */
    private static final long serialVersionUID = 10101010109L;

    private Long idPoliza;

    private Long idCompania;

    private Long idEmpresa;

    private Long idDepartamento;

    private Long idMediador;

    private Date fechaRemesa;

    private String descripcionLarga;

    private String sFRemesa;

    public void setIdPoliza( Long idPoliza ) {
        this.idPoliza = idPoliza;
    }

    public Long getIdPoliza() {
        return idPoliza;
    }

    public void setIdCompania( Long idCompania ) {
        this.idCompania = idCompania;
    }

    public Long getIdCompania() {
        return idCompania;
    }

    public void setIdEmpresa( Long idEmpresa ) {
        this.idEmpresa = idEmpresa;
    }

    public Long getIdEmpresa() {
        return idEmpresa;
    }

    public void setIdDepartamento( Long idDepartamento ) {
        this.idDepartamento = idDepartamento;
    }

    public Long getIdDepartamento() {
        return idDepartamento;
    }

    public void setIdMediador( Long idMediador ) {
        this.idMediador = idMediador;
    }

    public Long getIdMediador() {
        return idMediador;
    }

    public void setFechaRemesa( Date fechaRemesa ) {
        this.fechaRemesa = fechaRemesa;
    }

    public Date getFechaRemesa() {
        return fechaRemesa;
    }

    public void setDescripcionLarga( String descripcionLarga ) {
        this.descripcionLarga = descripcionLarga;
    }

    public String getDescripcionLarga() {
        return descripcionLarga;
    }

    public void setSFRemesa( String sFRemesa ) {
        this.sFRemesa = sFRemesa;
    }

    public String getSFRemesa() {
        return sFRemesa;
    }
}
