// Definindo
import br.com.fiap.beans.Produto;
import br.com.fiap.beans.Cliente;
import javax.swing.*;

public class Main {
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

    public static void main(String[] args ) {
        // Vetor de produtos
        Produto[] vetorProdutos = new Produto[3];
        Produto objProduto = new Produto(
                Integer.parseInt(JOptionPane.showInputDialog("Codigo")),
                JOptionPane.showInputDialog("Tipo"),
                JOptionPane.showInputDialog("Marca"),
                Integer.parseInt(JOptionPane.showInputDialog("Quantidade")),
                Double.parseDouble(JOptionPane.showInputDialog("Valor"))
        );
        Cliente objCliente = new Cliente();

        int indice = 0;

        // Passando o valor de acordo com o tipo
        objProduto.setValor(1200.00);

        objProduto.valorCalculado();

        System.out.println(objProduto.getValor());
        System.out.println(objProduto.valorCalculado());

        JOptionPane.showMessageDialog(null, "Bem vindo ao Programa JAVA");
        objCliente.setNome(JOptionPane.showInputDialog("Digite seu nome: "));
        objCliente.setIdade(Integer.parseInt(JOptionPane.showInputDialog("Digite sua idade: ")));
    }
}