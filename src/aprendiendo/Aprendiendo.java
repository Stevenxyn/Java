package aprendiendo;

import javax.swing.JOptionPane;

public class Aprendiendo {

    public static void main(String[] args) {

        String cadena;
        int entero;
        char letra;
        double decimal;

        cadena = JOptionPane.showInputDialog("Digite una cadena: ");  //PARA Cadenas de texto revisar InputDialog
        entero = Integer.parseInt(JOptionPane.showInputDialog("Digite un entero: ")); //PARA Numeros enteros revisar parseInt
        letra = JOptionPane.showInputDialog("Digite un caracter: ").charAt(0); //PARA Caracteres REVISAR .CharAt(0)
        decimal = Double.parseDouble(JOptionPane.showInputDialog("Digite un numero decimal: ")); //PARA numeros Decimales revisar Double.parseDouble

//        JOptionPane.showMessageDialog(null, "La cadena es: " + cadena);
//        JOptionPane.showMessageDialog(null, "El entero es: " + entero);
//        JOptionPane.showMessageDialog(null, "El caracter es: " + letra);
//        JOptionPane.showMessageDialog(null, "El decimal es: " + decimal);


       //En un solo bloque muestra todo
        JOptionPane.showMessageDialog(null, "\n La cadena es: " + cadena
                + "\n El entero es: " + entero
                + "\n El caracter es: " + letra
                + "\n El decimal es: "+decimal);

    }

}
