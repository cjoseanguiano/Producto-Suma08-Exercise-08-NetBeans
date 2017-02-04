/*
8. Leer dos números y realizar el producto median sumas.
 */
package productosuma;

import javax.swing.JOptionPane;

/**
 *
 * @author carlosjoseanguiano
 */
public class ProductoSuma {

    public static void main(String[] args) {
        int num_uno;
        int num_dos;
        int suma = 0;
        int contador = 1;

        num_uno = Integer.parseInt(JOptionPane.showInputDialog("Ingresa a numero"));
        num_dos = Integer.parseInt(JOptionPane.showInputDialog("Ingresa b numero"));

        do {
            suma = suma + num_uno;
            contador++;
        } while (contador <= num_dos);
        System.out.println("Producto " + suma);
    }

}
