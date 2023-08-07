
package ejemplo;

public class Ejemplo {

    /*public static void main(String[] args) {
        // TODO code application logic here
        Persona maria=new Persona("Lopez","Maria",30); ("Lopez","Maria",30)
        maria.saludar ();
        maria.setNombre("Juana");
        maria.saludar();
        System.out.println(maria.getEdad());
        maria.setEdad(40);
        System.out.println(maria.getEdad());
    }*/
    
    public static void main(String[] args){
        Libro platero=new Libro("901643714", "Platero y Yo", "JR Gimenez",1995);
        System.out.println("ISBN "+platero.getIsbn());
        System.out.println("Titulo "+platero.getTitulo());
        System.out.println("Autor "+platero.getAutor());
        System.out.println("Edicion "+platero.getEdicion());
        
        platero.setEdicion(2023);
        System.out.println("Edition "+platero.getEdicion());    
    
    }
    
/*public static void main(String[]args){ 
    for (int k=0;k<=10;k++){
    System.out.println(“Simulacro”);
    }*/
}


