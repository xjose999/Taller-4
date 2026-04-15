// Clase A
class Secreto {
    private String contraseña = "Admin123";
}

// Clase B (Prueba)
public class Hacker {
    public static void main(String[] args) {
        Secreto s = new Secreto();

        // ERROR DE COMPILACIÓN:
        // 'contraseña' has private access in 'Secreto'
        // System.out.println(s.contraseña);
    }
}