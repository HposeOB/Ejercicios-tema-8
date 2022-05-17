public class Main{
    public static void main(String[] args) {

        Persona persona = new Persona();

        persona.setEdad(30);
        persona.setNombre("Antonio");
        persona.setTelefono("+34666555444");


        System.out.println("Nombre: " + persona.getNombre() + "\n" + "Edad: " + persona.getEdad() + "\n" + "Telefono: " + persona.getTelefono());
    }


}