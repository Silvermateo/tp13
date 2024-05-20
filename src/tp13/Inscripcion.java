
package new13;


public class Inscripcion {
    private int nota;
    private int idAlumno;
    private int idMateria;

    public Inscripcion(int nota, int idAlumno, int idMateria) {
        this.nota = nota;
        this.idAlumno = idAlumno;
        this.idMateria = idMateria;
    }

    public int getNota() {
        return nota;
    }

    public int getIdAlumno() {
        return idAlumno;
    }

    public int getIdMateria() {
        return idMateria;
    }
}
