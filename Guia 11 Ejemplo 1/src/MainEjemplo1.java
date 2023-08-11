public class MainEjemplo1 {

    public static void main(String[] args) {

        Persona persona = new Persona();

        persona.setNombre("Leo ");
        persona.setApellido("Messi");
        persona.setDni(new Dni("A", 1111111));
        System.out.println(persona.toString());
        System.out.println(persona.getDni().getCaracter() + persona.getDni().getNumero());

    }
}
