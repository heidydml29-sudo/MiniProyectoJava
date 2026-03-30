import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Refugio refugio = new Refugio();

        int opcion = 0;

        while (opcion != 7) {

            System.out.println("===== REFUGIO DE ANIMALES =====");
            System.out.println("1. Registrar perro");
            System.out.println("2. Registrar gato");
            System.out.println("3. Mostrar animales");
            System.out.println("4. Buscar animal por id");
            System.out.println("5. Cambiar estado");
            System.out.println("6. Ejecutar sonido");
            System.out.println("7. Salir");

            try {

                System.out.print("Seleccione una opcion: ");
                opcion = sc.nextInt();

                if (opcion == 1) {

                    System.out.print("ID: ");
                    int id = sc.nextInt();

                    System.out.print("Nombre: ");
                    String nombre = sc.next();

                    System.out.print("Edad: ");
                    int edad = sc.nextInt();

                    Perro p = new Perro(id, nombre, edad, "ACTIVO");
                    refugio.registrarPerro(p);

                }

                else if (opcion == 2) {

                    System.out.print("ID: ");
                    int id = sc.nextInt();

                    System.out.print("Nombre: ");
                    String nombre = sc.next();

                    System.out.print("Edad: ");
                    int edad = sc.nextInt();

                    Gato g = new Gato(id, nombre, edad, "ACTIVO");
                    refugio.registrarGato(g);

                }

                else if (opcion == 3) {

                    refugio.mostrarAnimales();

                }

                else if (opcion == 4) {

                    System.out.print("ID a buscar: ");
                    int id = sc.nextInt();

                    Animal a = refugio.buscarAnimal(id);

                    if (a != null) {
                        a.mostrarInfo();
                    } else {
                        System.out.println("No encontrado");
                    }

                }

                else if (opcion == 5) {

                    System.out.print("ID: ");
                    int id = sc.nextInt();

                    System.out.print("Nuevo estado: ");
                    String estado = sc.next();

                    refugio.cambiarEstado(id, estado);

                }

                else if (opcion == 6) {

                    System.out.print("ID: ");
                    int id = sc.nextInt();

                    refugio.ejecutarSonido(id);

                }

            } catch (Exception e) {

                System.out.println("Error en la entrada de datos.");
                sc.nextLine();

            }

        }

    }
}