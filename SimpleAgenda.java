
import java.util.Scanner;
public class SimpleAgenda {
    public static String[] contactos = new String[10];


    public static void main(String[] args) {
        agregarContacto();
        agregarContacto();
        agregarContacto();
        agregarContacto();
        agregarContacto();
        agregarContacto();
        agregarContacto();
        agregarContacto();
        agregarContacto();
        agregarContacto();
        agregarContacto();
        agregarContacto();
        //removerContacto();
        //removerContacto(9999);
        mostrarContactos();


    }

    public static void agregarContacto() {
        String nombre;
        boolean existe = false;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un contacto a agregar.");
        nombre = sc.nextLine();

        for (int i = 0; i < contactos.length; i++) {
            if (contactos[i] != null && contactos[i].equals(nombre)) {
                existe = true;
                break;
            }
        }
        if (existe) {
            System.out.println("Ya se ha agregado anteriormente");
        } else {
            // Aplicar la lógica de añadir el elemento a la posición actual del arreglo
            for (int i = 0; i < contactos.length; i++) {
                if (contactos[i] == null) {
                    contactos[i] = nombre;
                    System.out.println("Agregado satisfactoriamente");
                    break;
                }
            }
        }


    }

    public static void removerContacto() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el contacto a remover:");
        String contactoRemover = scanner.nextLine();

        boolean encontrado = false;
        for (int i = 0; i < contactos.length; i++) {
            if (contactos[i] != null && contactos[i].equals(contactoRemover)) {
                contactos[i] = null;
                encontrado = true;
                System.out.println("El contacto " + contactoRemover + " fue removido exitosamente!");
                break;
            }
        }

        if (!encontrado) {
            System.out.println("No existe tal contacto");
        }
    }

    public static String actualizarContacto(int na) {
        return "N/A";
    }

    public static void mostrarContacto() {
        boolean appears = false;
        System.out.println("Ingrese contacto a mostrar");
        Scanner sc = new Scanner(System.in);
        String contactoExiste = sc.nextLine();
        for (int i = 0; i < contactos.length; i++) {
            if (contactos[i] != null && contactos[i].equals(contactoExiste)) {
                appears = true;
                System.out.println("El contacto " + contactoExiste + " existe.");
                break;
            }
        }

        if (!appears) {
            System.out.println("No existen registros de este contacto contacto");
        }
    }

    public static void mostrarContactos(){
        System.out.println("Mostrando contactos...");
        for (int i = 0; i < contactos.length; i++) {
            if (contactos[i] != null){
                System.out.println(contactos[i]);
            }
        }
    }
}
