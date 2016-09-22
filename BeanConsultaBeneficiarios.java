package es.sanitas.mediadores.vo;

import java.sql.Date;


public class BeanConsultaBeneficiarios extends AbstractVO {

    /** Variable serialVersionUID */
    private static final long serialVersionUID = 101010101060L;

    /** Variable con el idCliente */
    private Long idCliente;

    /** Variable con el idProducto */
    private int idProducto;

    /** Variable con el nombre del beneficiario */
    private String nombre;

    /** Variable con el apellido1 del beneficiario */
    private String apellido1;

    /** Variable con el apellido2 del beneficiario */
    private String apellido2;

    /** Variable con el gen_c_tipo_doc del beneficiario */
    private int genCTipoDocumento;

    /** Variable con el numero_doc_acred del beneficiario */
    private String numDocAcreditativo;

    /** Variable con el parentesco del beneficiario */
    private String parentesco;

    /** Variable con el f_nacimiento del beneficiario */
    private Date fNacimiento;

    /** Variable con el descProducto del producto */
    private String descProducto;

    /** Variable que indica el tipo de producto */
    private int tipoProducto;

    /** Variable con el fAlta del producto */
    private Date fAlta;

    /** Variable con el fEstado del producto */
    private Date fEstado;

    /** Variable con el idEstado del producto */
    private int idEstadoProd;

    /** Variable con el descEstadoProducto del producto */
    private String descEstadoProd;

    /** Variable con el email del beneficiario */
    private String email;

    /** Variable con el gec_c_sexo del beneficiario */
    private int genCSexo;

    /** Variable con el idOficina del beneficiario */
    private int idOficina;

    /** Variable con el gen_c_parentesco del beneficiario */
    private int genCParentesco;

    /** Variable con el sw_autoriza_informacion del beneficiario */
    private Boolean bAutoriza;

    /** Variable con el idClienteBupa del beneficiario */
    private String idClieBupa;

    /** Variable con el idEstado del beneficiario */
    private int idEstadoBeneficiario;

    /** Variable con el numero_beneficiario del beneficiario */
    private int numeroBeneficiario;

    /** Variable con el descSexo del beneficiario */
    private String descSexo;

    /** Variable con el num_prefijo_pais del beneficiario */
    private int prefijoPais;

    /** Variable con el num_telefono del beneficiario */
    private Long numeroTelefono;

    /** Variable con el num_telefono_extranjero del beneficiario */
    private String numeroTelefonoExtranjero;
    
    /** Variable con la profesión del beneficiario */
    private String sProfesion;

    public void setIdCliente( Long idCliente ) {
        this.idCliente = idCliente;
    }

    public Long getIdCliente() {
        return idCliente;
    }

    public void setIdProducto( int idProducto ) {
        this.idProducto = idProducto;
    }

    public int getIdProducto() {
        return idProducto;
    }

    public void setNombre( String nombre ) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setApellido1( String apellido1 ) {
        this.apellido1 = apellido1;
    }

    public String getApellido1() {
        return apellido1;
    }

    public void setApellido2( String apellido2 ) {
        this.apellido2 = apellido2;
    }

    public String getApellido2() {
        return apellido2;
    }

    public void setGenCTipoDocumento( int genCTipoDocumento ) {
        this.genCTipoDocumento = genCTipoDocumento;
    }

    public int getGenCTipoDocumento() {
        return genCTipoDocumento;
    }

    public void setNumDocAcreditativo( String numDocAcreditativo ) {
        this.numDocAcreditativo = numDocAcreditativo;
    }

    public String getNumDocAcreditativo() {
        return numDocAcreditativo;
    }

    public void setParentesco( String parentesco ) {
        this.parentesco = parentesco;
    }

    public String getParentesco() {
        return parentesco;
    }

    public void setFNacimiento( Date fNacimiento ) {
        this.fNacimiento = fNacimiento;
    }

    public Date getFNacimiento() {
        return fNacimiento;
    }

    public void setDescProducto( String descProducto ) {
        this.descProducto = descProducto;
    }

    public String getDescProducto() {
        return descProducto;
    }

    public void setFAlta( Date fAlta ) {
        this.fAlta = fAlta;
    }

    public Date getFAlta() {
        return fAlta;
    }

    public void setFEstado( Date fEstado ) {
        this.fEstado = fEstado;
    }

    public Date getFEstado() {
        return fEstado;
    }

    public void setIdEstadoProd( int idEstadoProd ) {
        this.idEstadoProd = idEstadoProd;
    }

    public int getIdEstadoProd() {
        return idEstadoProd;
    }

    public void setDescEstadoProd( String descEstadoProd ) {
        this.descEstadoProd = descEstadoProd;
    }

    public String getDescEstadoProd() {
        return descEstadoProd;
    }

    public void setEmail( String email ) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setGenCSexo( int genCSexo ) {
        this.genCSexo = genCSexo;
    }

    public int getGenCSexo() {
        return genCSexo;
    }

    public void setGenCParentesco( int genCParentesco ) {
        this.genCParentesco = genCParentesco;
    }

    public int getGenCParentesco() {
        return genCParentesco;
    }

    public void setBAutoriza( Boolean bAutoriza ) {
        this.bAutoriza = bAutoriza;
    }

    public Boolean getBAutoriza() {
        return bAutoriza;
    }

    public void setIdClieBupa( String idClieBupa ) {
        this.idClieBupa = idClieBupa;
    }

    public String getIdClieBupa() {
        return idClieBupa;
    }

    public void setIdEstadoBeneficiario( int idEstadoBeneficiario ) {
        this.idEstadoBeneficiario = idEstadoBeneficiario;
    }

    public int getIdEstadoBeneficiario() {
        return idEstadoBeneficiario;
    }

    public void setNumeroBeneficiario( int numeroBeneficiario ) {
        this.numeroBeneficiario = numeroBeneficiario;
    }

    public int getNumeroBeneficiario() {
        return numeroBeneficiario;
    }

    public void setDescSexo( String descSexo ) {
        this.descSexo = descSexo;
    }

    public String getDescSexo() {
        return descSexo;
    }

    public void setPrefijoPais( int prefijoPais ) {
        this.prefijoPais = prefijoPais;
    }

    public int getPrefijoPais() {
        return prefijoPais;
    }

    public void setNumeroTelefono( Long numeroTelefono ) {
        this.numeroTelefono = numeroTelefono;
    }

    public Long getNumeroTelefono() {
        return numeroTelefono;
    }

    public void setNumeroTelefonoExtranjero( String numeroTelefonoExtranjero ) {
        this.numeroTelefonoExtranjero = numeroTelefonoExtranjero;
    }

    public String getNumeroTelefonoExtranjero() {
        return numeroTelefonoExtranjero;
    }

    public void setIdOficina( int idOficina ) {
        this.idOficina = idOficina;
    }

    public int getIdOficina() {
        return idOficina;
    }

    public void setTipoProducto( int tipoProducto ) {
        this.tipoProducto = tipoProducto;
    }

    public int getTipoProducto() {
        return tipoProducto;
    }

	public String getSProfesion() {
		return sProfesion;
	}

	public void setSProfesion(String sProfesion) {
		this.sProfesion = sProfesion;
	}

    
    
    
}
