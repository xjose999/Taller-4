public class PruebaCoche {
    public static void main(String[] args) {
        Coche miCoche = new Coche("Mazda", "3", 180);

        // 3. INTENTO DE ACCESO DIRECTO (Esto fallará)
        // Error: 'marca' has private access in 'Coche'
        // System.out.println(miCoche.marca);

        // Error: 'velocidadMaxima' has private access in 'Coche'
        // miCoche.velocidadMaxima = -500;

        // La única forma de interactuar es a través de sus métodos permitidos
        miCoche.acelerar(20);
    }
}