public class Prueba {
    public static void main(String[] args) {
        Estudiante e1 = new Estudiante();

        // Guardar datos
        e1.setNombre("Manuel");
        e1.setEdad(21);
        e1.setNotaPromedio(4.8);

        // Mostrar datos
        System.out.println("Nombre: " + e1.getNombre());
        System.out.println("Edad: " + e1.getEdad());
        System.out.println("Nota: " + e1.getNotaPromedio());
    }
}