public class DocenteContrato extends Docente{
 private String tipoContrato;

    public DocenteContrato(String cedula, String nombre, String fechanacimiento, String tipoSangre, int codigo, String tipoContrato,String direccion) {
        super(cedula, nombre, fechanacimiento, tipoSangre, codigo,direccion);
        this.tipoContrato = tipoContrato;

    }
    public String getTipoContrato() {
        return tipoContrato;
    }
    public void imprimir() {
        super.imprimir();
        System.out.println("Tipo de Contrato: " + tipoContrato);

    }
}
