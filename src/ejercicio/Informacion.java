package  ejercicio;

public class Informacion {
 
    private String nombre;
    private String carrera;
    private int semestre;

    public Informacion(String nombre,String carrera,int semestre) {
     
        this.nombre = nombre;
        this.carrera = carrera;
        this.semestre = semestre;
     
    }

    public String getNombre() {
     
        return "El nombre es: " + nombre;
     
    }

    public void setNombre(String nombre) {
     
        this.nombre = nombre;
     
    }
 
    public String getCarrera() {
     
        return "La carrera es: " + carrera;
     
    }

    public void setCarrera(String carrera) {
     
        this.carrera = carrera;
     
    }
 
    public String getSemestre() {
     
        return "El semestre es: " + semestre;
     
    }
 
    public void setSemestre(int semestre) {
     
        this.semestre = semestre;
     
    }

    @Override
    public String toString() {
     
        return
            "\nEl nombre es: " + nombre +
            "\nLa carrera es: " + carrera +
            "\nEl semestre es: " +  semestre;
    }

}
