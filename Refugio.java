import java.util.ArrayList;

public class Refugio {

    private ArrayList<Animal> animales;

    public Refugio() {
        animales = new ArrayList<>();
    }

    public void registrarPerro(Perro perro) {
        animales.add(perro);
    }

    public void registrarGato(Gato gato) {
        animales.add(gato);
    }

    public void mostrarAnimales() {
        for (Animal a : animales) {
            a.mostrarInfo();
            System.out.println("----------------");
        }
    }

    public Animal buscarAnimal(int id) {
        for (Animal a : animales) {
            if (a.getId() == id) {
                return a;
            }
        }
        return null;
    }

    public void cambiarEstado(int id, String nuevoEstado) {
        Animal a = buscarAnimal(id);

        if (a != null) {
            a.setEstado(nuevoEstado);
            System.out.println("Estado actualizado.");
        } else {
            System.out.println("Animal no encontrado.");
        }
    }

    public void ejecutarSonido(int id) {
        Animal a = buscarAnimal(id);

        if (a != null) {
            a.hacerSonido();
        } else {
            System.out.println("Animal no encontrado.");
        }
    }
}