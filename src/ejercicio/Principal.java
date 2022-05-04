package ejercicio;

public class Principal {
 
    public static void main(String args[]) {
     
        Informacion info = new Informacion("Jesus","Informatica",2);
     
        String numCon = info.getNombre() + "\n" + info.getCarrera() + "\n" + info.getSemestre();
     
        System.out.println(numCon);
        System.out.println(info);
     
        System.out.println("TEC 2");
     
    }

}
