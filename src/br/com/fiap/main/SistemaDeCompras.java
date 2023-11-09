package br.com.fiap.main;
import javax.swing.*;
// Setando path de caminhos arquivos
import br.com.fiap.beans.Produto;

public class SistemaDeCompras {
    // String
    static String texto(String j) {
        return JOptionPane.showInputDialog(j);
    }

    // int
    static int numInteiro(String j) {
        return Integer.parseInt(JOptionPane.showInputDialog(j));
    }

    // Double
    static double numReal(String j) {
        return Double.parseDouble(JOptionPane.showInputDialog(j));
    }

    public static void SistemaDeCompras(String[] args) {

    }
}
