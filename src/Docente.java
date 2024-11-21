public class Docente extends Persona{
    private int codigo;

    public Docente(String cedula, String nombre, String fechanacimiento, String tipoSangre, int codigo,String direccion) {
        super(cedula, nombre, fechanacimiento, tipoSangre, direccion);
        this.codigo = codigo;
    }
    public int getCodigo() {
        return codigo;
    }
    @Override
    public void imprimir() {
        super.imprimir();
        System.out.println("Docente");
        System.out.println("Codigo: " + codigo);

    }
}
