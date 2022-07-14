package Encapsulamento;

public class Main {
    public static void main(String[] args) {
        ControleRemoto c = new ControleRemoto();
        c.ligar();
        c.maisVolume();
        c.maisVolume();
        c.abrirMenu();
        c.play();
        c.play();
        c.pause();
        c.pause();
    }
}
