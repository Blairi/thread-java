package hilos;

class Saludo extends Thread{
    
    @Override
    public void run(){
        System.out.println("\tSoy el hilo " + this.getName());
        System.out.println("\t " + this.getName() + " termine");
    }
}

public class Ej4 {

    public static void main(String[] args) {
        
        Saludo saludo = new Saludo();
        // EJecutar hilo
        System.out.println("Nuevo hilo:");
        saludo.start();
        
        // Termina procesos principal
        System.out.println("Padre: termine...");
    }
    
}
