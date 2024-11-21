import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        String cedula;
        String nombre;
        String fechaNacimiento;
        String tipoSangre;
        String direccion;

        Scanner sc= new Scanner(System.in);
        System.out.println("Ingrese el cedula: ");
        cedula= sc.nextLine();
        System.out.println("Ingrese el nombre: ");
        nombre= sc.nextLine();
        System.out.println("Ingrese el fecha de nacimiento: ");
        fechaNacimiento= sc.nextLine();
        System.out.println("Ingrese el tipo de sangre: ");
        tipoSangre= sc.nextLine();
        System.out.println("Ingrese el direccion: ");
        direccion= sc.nextLine();

        Persona persona2=new Persona(cedula, nombre, fechaNacimiento, tipoSangre, direccion);
        persona2.imprimir();
        persona2.cambiarDatos("1753051166","Karla Rodriguez","11/10/2004","o+","Mitad del mundo");
        System.out.println("nuevos datos");
        persona2.imprimir();



/*
        Persona persona1 =new Persona ("1753051166","Karla Rodriguez","11/10/2004","o+");
        persona1.imprimir();

    Estudiante estudiante1= new Estudiante("123456789","jaimito Rogelio","23/05/2004","a-",23345);
    estudiante1.imprimir();

    EstudianteBecado becado1=new EstudianteBecado("171980854","Patricio Gomez","17/06/1997","o+",654321,"media beca");
    becado1.imprimir();

    EstudianteDeportista deportista1=new EstudianteDeportista("17530721004","David Bosmediano","09/03/2003","o-",987654,"basquet");
    deportista1.imprimir();

    //crear docentes xd */

    }
}