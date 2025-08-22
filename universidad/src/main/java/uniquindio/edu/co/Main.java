package uniquindio.edu.co;

import uniquindio.edu.co.model.Curso;
import uniquindio.edu.co.model.Docente;
import uniquindio.edu.co.model.Estudiante;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //Creamos docentes
        Docente docente = new Docente(123, "Raul");
        Docente docente1 = new Docente(1234, "Luisa");
        Docente docente2 = new Docente(1235, "Robinson");

        //Creamos los cursos
        Curso curso = new Curso("Programación 1", 123, docente);
        Curso curso1 = new Curso("Matematicas", 1236, docente2);
        Curso curso2 = new Curso("Logica", 12389, docente1);

        //Creamos estudiantes
        Estudiante estudiante = new Estudiante("Camilo", "Rivera", "ryriverauniquindio.edu.co", "ad11", "3100000", 30);
        Estudiante estudiante1 = new Estudiante("Maria", "Rivera", "ryriverauniquindio.edu.co", "ad11fg", "3100000", 30);
        Estudiante estudiante2 = new Estudiante("Carlos", "Rivera", "ryriverauniquindio.edu.co", "ad111441", "3100000", 30);
        Estudiante estudiante3 = new Estudiante("Luisa", "Rivera", "ryriverauniquindio.edu.co", "ad11xaxa", "3100000", 30);


        curso.agregarEstudianteCurso(estudiante);
        curso1.agregarEstudianteCurso(estudiante);
        curso2.agregarEstudianteCurso(estudiante2);
        curso1.agregarEstudianteCurso(estudiante3);

        System.out.println(curso.toString());
        System.out.println(curso1.toString());
        System.out.println(curso2.toString());

    }
}