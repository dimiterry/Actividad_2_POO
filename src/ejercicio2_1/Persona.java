package ejercicio2_1;

public class Persona {

    // Atributos
    String nombre;
    String apellidos;
    String numeroDocumentoIdentidad;
    int anoNacimiento;
    String paisNacimiento;
    char genero;

    // Constructor
    Persona(String nombre, String apellidos, String numeroDocumentoIdentidad,
            int anoNacimiento, String paisNacimiento, char genero) {

        this.nombre = nombre;
        this.apellidos = apellidos;
        this.numeroDocumentoIdentidad = numeroDocumentoIdentidad;
        this.anoNacimiento = anoNacimiento;
        this.paisNacimiento = paisNacimiento;
        this.genero = genero;
    }

    // Método que imprime los datos de una persona
    void imprimir() {
        System.out.println("Nombre = " + nombre);
        System.out.println("Apellidos = " + apellidos);
        System.out.println("Número de documento de identidad = "
                + numeroDocumentoIdentidad);
        System.out.println("Año de nacimiento = " + anoNacimiento);
        System.out.println("País de nacimiento = " + paisNacimiento);
        System.out.println("Género = " + genero);
        System.out.println();
    }

    // Método main
    public static void main(String[] args) {

        Persona p1 = new Persona("Pedro", "Pérez", "1053121010",
                1998, "Colombia", 'H');

        Persona p2 = new Persona("Luis", "León", "1053223344",
                2001, "Colombia", 'H');

        p1.imprimir();
        p2.imprimir();
    }
}
