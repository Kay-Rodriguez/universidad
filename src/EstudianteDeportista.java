public class EstudianteDeportista extends Estudiante {
    private String deporte;

    public EstudianteDeportista(String cedula, String nombre, String fechanacimiento, String tipoSangre, int codigo, String deporte,String direccion) {
        super(cedula, nombre, fechanacimiento, tipoSangre, codigo,direccion);
        this.deporte = deporte;

    }
    private String getDeporte() {
        return deporte;
    }
    @Override
    public void imprimir () {
        super.imprimir();
        System.out.println(getDeporte());
    }
}
