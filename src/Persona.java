public class Persona {

    private String nombre;
    private int edad;
    private char sexo;

    public Persona() {

    }

    public Persona(String nombre, int edad, char sexo) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public void imprimir() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Sexo: " + sexo);

    }

    public void imprimir2() {
        System.out.println("Nombre: " + this.getNombre());
        System.out.println("Edad: " + this.getEdad());
        System.out.println("Sexo: " + this.getSexo());
    }


//Usar condiciones (IF/ELSE)

    public void revisarEdad(){
        if( this.edad > 18)
        {
            System.out.println("Es mayor de edad.");
        }
        else
        {
            if (this.getEdad() > 0 && this.getEdad() <= 4)
            {
                System.out.println("Es un bebe.");
            } else
            {
                if(this.getEdad() >= 5 && this.edad <= 15)
                {
                    System.out.println("es un niño.");
                }
            }
            System.out.println("No es mayor de edad.");
        }
    }
}