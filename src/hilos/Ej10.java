package hilos;

class Serie extends Thread {
    @Override
    public void run(){
        for (int i = 1; i<11; i++) {
            System.out.println(this.getName() + " " + i);
        }
    }
}

public class Ej10 {
    public static void main(String[] args) {
        Serie serie1 = new Serie();
        Serie serie2 = new Serie();
        serie1.start();
        serie2.start();
    }
}
