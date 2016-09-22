package es.sanitas.mediadores.vo;

import java.util.Date;


/**
 * Objeto contenedor de la tabla con las comprobaciones de las remesas de empresa
 */
public class BeanCheckRemesasEmpresa extends AbstractVO {

    /** Variable serialVersionUID */
    private static final long serialVersionUID = 165101010108L;

    /**
     * Variable ultimaRefacturacion
     */
    private Boolean ultimaRefacturacion = false;

    /**
     * Variable descargaMasiva
     */
    private Boolean descargaMasiva = false;

    /**
     * Variable mostrarRefacturacion
     */
    private Boolean mostrarRefacturacion = false;

    /**
     * Variable mostrarCheckDescarga
     */
    private Boolean mostrarCheckDescarga = false;

    /**
     * Variable UltimaRefacturacion
     */
    private Date fUltimaRefacturacion;

    /**
     * Establece el valor de la variable ultimaRefacturacion
     * 
     * @param ultimaRefacturacion
     *            Variable de tipo Boolean con el valor de ultimaRefacturacion
     */
    public void setUltimaRefacturacion( Boolean ultimaRefacturacion ) {
        this.ultimaRefacturacion = ultimaRefacturacion;
    }

    /**
     * Devuelve el valor de la variable ultimaRefacturacion
     * 
     * @return ultimaRefacturacion Objeto de tipo Boolean
     */
    public Boolean getUltimaRefacturacion() {
        return ultimaRefacturacion;
    }

    /**
     * Establece el valor de la variable descargaMasiva
     * 
     * @param descargaMasiva
     *            Variable de tipo Boolean con el valor de descargaMasiva
     */
    public void setDescargaMasiva( Boolean descargaMasiva ) {
        this.descargaMasiva = descargaMasiva;
    }

    /**
     * Devuelve el valor de la variable descargaMasiva
     * 
     * @return descargaMasiva Objeto de tipo Boolean
     */
    public Boolean getDescargaMasiva() {
        return descargaMasiva;
    }

    /**
     * Establece el valor de la variable fUltimaRefacturacion
     * 
     * @param fUltimaRefacturacion
     *            Variable de tipo Date con el valor de fUltimaRefacturacion
     */
    public void setFUltimaRefacturacion( Date fUltimaRefacturacion ) {
        this.fUltimaRefacturacion = fUltimaRefacturacion;
    }

    /**
     * Devuelve el valor de la variable fUltimaRefacturacion
     * 
     * @return fUltimaRefacturacion Objeto de tipo Date
     */
    public Date getFUltimaRefacturacion() {
        return fUltimaRefacturacion;
    }

    /**
     * Establece el valor de la variablemostrarRefacturacion
     * 
     * @param mostrarRefacturacion
     *            Variable de tipo Boolean con el valor de mostrarRefacturacion
     */
    public void setMostrarRefacturacion( Boolean mostrarRefacturacion ) {
        this.mostrarRefacturacion = mostrarRefacturacion;
    }

    /**
     * Devuelve el valor de la variable mostrarRefacturacion
     * 
     * @return mostrarRefacturacion Objeto de tipo Boolean
     */
    public Boolean getMostrarRefacturacion() {
        return mostrarRefacturacion;
    }

    /**
     * Establece el valor de la variable mostrarCheckDescarga
     * 
     * @param mostrarCheckDescarga
     *            Variable de tipo Boolean con el valor de mostrarCheckDescarga
     */
    public void setMostrarCheckDescarga( Boolean mostrarCheckDescarga ) {
        this.mostrarCheckDescarga = mostrarCheckDescarga;
    }

    /**
     * Devuelve el valor de la variable mostrarCheckDescarga
     * 
     * @return mostrarCheckDescarga Objeto de tipo Boolean
     */
    public Boolean getMostrarCheckDescarga() {
        return mostrarCheckDescarga;
    }
}
