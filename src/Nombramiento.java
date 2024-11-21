public class Nombramiento extends Docente{
    private String tipoNombramiento;

    public Nombramiento(String cedula, String nombre, String fechanacimiento, String tipoSangre, int codigo, String tipoNombramiento,String direccion) {
        super(cedula, nombre, fechanacimiento, tipoSangre, codigo,direccion);
        this.tipoNombramiento = tipoNombramiento;

    }
    public String getTipoNombramiento() {
        return tipoNombramiento;
    }
    @Override
    public void imprimir() {
        super.imprimir();
        System.out.println("Docente Nombramiento");
        System.out.println(getTipoNombramiento());
    }
}
