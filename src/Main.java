public class Main {
    public static void main(String[] args) {

        //TODO Crear un objeto persona en el main.

        Persona estudiante = new Persona();

        //TODO Utiliza los gets y sets para darle valores a las propiedades edad, nombre y telefono, por último
        // muéstralas por consola.

        estudiante.setEdad(18);
        estudiante.setNombre("Ricardo");
        estudiante.setTelefono("2772-5615");

        System.out.println("Edad:" + estudiante.getEdad());
        System.out.println("Nombre:" + estudiante.getNombre());
        System.out.println("Telefono:" + estudiante.getTelefono());




    }
}


//TODO Crear clase Persona.

class Persona{
    //TODO Crear variables las privadas edad, nombre y telefono de la clase Persona.
    private int edad;
    private String nombre;
    private String telefono;

    //TODO Crear gets y sets de cada propiedad.

    public void setEdad(int edad){
        this.edad = edad;
    }

    public int getEdad(){
        return this.edad;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public  String getNombre(){
        return this.nombre;
    }

    public void setTelefono(String telefono){
        this.telefono = telefono;
    }

    public String getTelefono(){
        return this.telefono;
    }

}







