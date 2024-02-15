
import java.util.Scanner;
public class SimpleAgenda {
    public static void main(String[] args) {
        agregarContacto();
        //removerContacto(9999);
        //mostrarContacto();

    }
    public static void agregarContacto () {
        Scanner sc = new Scanner(System.in);
        String nombre;
        System.out.println("Ingrese un contacto a agregar");
        nombre = sc.nextLine();
        if (nombre.length() > 4 && nombre.length() < 8){
            System.out.println("Contacto agregado con exito");
        } else if (nombre.length() > 8 && nombre.length() < 30){
            System.out.println("Contacto agregado, contiene entre 8 y 30 ");
        } else if (nombre.length() < 4){
            System.out.println("Nombre muy corto");
        } else {
            System.out.println("Nombre muy largo");
        }
    }
    public static void removerContacto (int id) {
        if (id >= 1000 && id <= 9999){
            System.out.println("Verificando contacto a eliminar");
        } else {
            System.out.println("ID invalido");
        }
    }

    public static String actualizarContacto (int na){
        return "N/A";
    }

    public static void mostrarContacto(){
        System.out.println("Mostrando contactos...");
    }


}
