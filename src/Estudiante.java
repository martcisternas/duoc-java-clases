public class Estudiante {

    static void main(String[] args) {

        Persona per1 = new Persona();

        Persona per2 = new Persona("Juan",19,'m');

        per1.imprimir();
        System.out.println("********");
        per2.imprimir();

        System.out.println("");
        System.out.println("Prueba de Accesadores y Mutadores");
        per1.setNombre("Diego");
        per1.imprimir();
        per2.setNombre("Juanito");
        System.out.println("Nombre: " + per2.getNombre());
        System.out.println("******------******");
        per2.imprimir2();
        System.out.println("");
        per1.imprimir2();

        System.out.println("*** usando if ***");
        per2.revisarEdad();

    }
}
