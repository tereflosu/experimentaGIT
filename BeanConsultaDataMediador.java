package es.sanitas.mediadores.vo;

public class BeanConsultaDataMediador extends AbstractVO {

    /** Variable serialVersionUID */
    private static final long serialVersionUID = 101010101011L;

    /** Variable fecha del proceso */
    private Long fProceso;

    /** Variable fecha del proceso */
    private Long fProcesoIni;

    /** Variable fecha del proceso */
    private Long fProcesoFin;

    /** Variable id mediador */
    private Long idMediador;

    /** Variable altas reales */
    private Long altasRealPMI;

    /** Variable bajas reales */
    private Long bajasRealPMI;

    public void setFProceso( Long fProceso ) {
        this.fProceso = fProceso;
    }

    public Long getFProceso() {
        return fProceso;
    }

    public void setIdMediador( Long idMediador ) {
        this.idMediador = idMediador;
    }

    public Long getIdMediador() {
        return idMediador;
    }

    public void setAltasRealPMI( Long altasRealPMI ) {
        this.altasRealPMI = altasRealPMI;
    }

    public Long getAltasRealPMI() {
        return altasRealPMI;
    }

    public void setBajasRealPMI( Long bajasRealPMI ) {
        this.bajasRealPMI = bajasRealPMI;
    }

    public Long getBajasRealPMI() {
        return bajasRealPMI;
    }

    public void setFProcesoIni( Long fProcesoIni ) {
        this.fProcesoIni = fProcesoIni;
    }

    public Long getFProcesoIni() {
        return fProcesoIni;
    }

    public void setFProcesoFin( Long fProcesoFin ) {
        this.fProcesoFin = fProcesoFin;
    }

    public Long getFProcesoFin() {
        return fProcesoFin;
    }
}
