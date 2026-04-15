public class Estudiante {
    private String nombre;
    private int edad;
    private double notaPromedio;

    // Getters (Para leer los datos)
    public String getNombre() { return nombre; }
    public int getEdad() { return edad; }
    public double getNotaPromedio() { return notaPromedio; }

    // Setters (Para guardar datos con validación simple)
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        if (edad > 0) this.edad = edad; // Solo guarda si es positiva
    }

    public void setNotaPromedio(double nota) {
        if (nota >= 0 && nota <= 5) this.notaPromedio = nota; // Solo guarda si es de 0 a 5
    }
}