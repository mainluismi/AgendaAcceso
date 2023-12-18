package Main;

import Vista.Inicio;

public class Main {

    public static void main(String[] args) {
        // Se crea el objeto de la ventana principal
        Inicio pantalla = new Inicio();

        // Se hace visible la vista
        pantalla.setVisible(true);
        pantalla.setLocationRelativeTo(null);
    }
}