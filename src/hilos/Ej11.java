package hilos;

class Serie extends Thread {
    private int fin;
    private int incremento;

    public Serie(int fin, int incremento) {
        this.fin = fin;
        this.incremento = incremento;
    }
    
    @Override
    public void run(){
        for (int i = 1; i<this.fin; i+=this.incremento) {
            System.out.println(this.getName() + " " + i);
        }
    }
}

public class Ej11 {
    public static void main(String[] args) {
        Serie serie1 = new Serie(25, 5);
        Serie serie2 = new Serie(9, 3);
        Serie serie3 = new Serie(100, 10);
        serie1.start();
        serie2.start();
        serie3.start();
    }
}
