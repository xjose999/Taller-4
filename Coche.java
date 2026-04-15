public class Coche {
    // 1. Propiedades privadas
    private String marca;
    private String modelo;
    private int velocidadMaxima;

    public Coche(String marca, String modelo, int velocidadMaxima) {
        this.marca = marca;
        this.modelo = modelo;
        this.velocidadMaxima = velocidadMaxima;
    }

    // 2. Método acelerar con validación
    public void acelerar(int incremento) {
        if (incremento > 0) {
            this.velocidadMaxima += incremento;
            System.out.println("Velocidad aumentada. Nueva velocidad máxima: " + this.velocidadMaxima);
        } else {
            System.out.println("Error: El incremento debe ser positivo.");
        }
    }
}
