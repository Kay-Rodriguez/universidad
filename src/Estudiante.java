import java.awt.datatransfer.StringSelection;

public class Estudiante extends Persona{
    int codigo;

    public Estudiante(String cedula, String nombre, String fechanacimiento, String tipoSangre, int codigo, String direccion) {
        super(cedula, nombre, fechanacimiento, tipoSangre, direccion);
        this.codigo = codigo;
    }
    public int getCodigo() {
        return codigo;
    }
    @Override
    public void imprimir() {
        super.imprimir();
        System.out.println("");
        System.out.println("Los datos del estudiante son : ");
        System.out.println("Codigo del Estudiante: " + getCodigo());
    }

}
