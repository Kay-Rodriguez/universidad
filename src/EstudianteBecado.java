public class EstudianteBecado extends Estudiante {
    private String tipoBeca;

    public EstudianteBecado(String cedula, String nombre, String fechanacimiento, String tipoSangre, int codigo, String tipoBeca,String direccion) {
        super(cedula, nombre, fechanacimiento, tipoSangre, codigo, direccion);
        this.tipoBeca = tipoBeca;

    }
    private String getTipoBeca() {
        return tipoBeca;
    }
    @Override
    public void imprimir () {
        super.imprimir();
        System.out.println("Estudiante Becado");
        System.out.println("tipoBeca: " + tipoBeca);
    }
}
