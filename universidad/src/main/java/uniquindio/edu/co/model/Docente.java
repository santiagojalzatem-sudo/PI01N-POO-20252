package uniquindio.edu.co.model;

public class Docente {

    private int cedula;
    private String nombre;

    public Docente(int cedula, String nombre){
        this.cedula=cedula;
        this.nombre=nombre;
    }

    @Override
    public String toString() {
        return "Docente{" +
                "cedula=" + cedula +
                ", nombre='" + nombre + '\'' +
                '}';
    }
}
