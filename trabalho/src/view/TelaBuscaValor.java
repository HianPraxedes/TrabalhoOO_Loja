package view;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import model.*;
import controller.*;
import javax.swing.event.*;
import view.*;

/**
 * Buscar por precos
 * 
 * @author acer
 * 
 */
public class TelaBuscaValor extends JFrame implements ActionListener {

    private final JFrame janela = new JFrame("Busca");
    private final JLabel titulo = new JLabel("Escreva o valor maximo do produto");
    private final JButton confirmar = new JButton("Confirmar");
    private final JTextField eValor = new JTextField();
    Double[] valorProduto = new Double[100];
    private static DadoController dados;
    private static Double valorPro = 0.0;
    private static int x1;

    /**
     * Filtra os produtos de acordo com o preco digitado pelo usuario
     * 
     * @param d
     * @param x
     */
    public TelaBuscaValor(DadoController d, int x) {

        dados = d;
        x1 = x;

        titulo.setFont(new Font("Arial", Font.BOLD, 15));
        titulo.setBounds(100, 30, 300, 30);
        eValor.setBounds(110, 100, 250, 30);
        confirmar.setBounds(10, 100, 100, 30);

        janela.setLayout(null);
        janela.add(titulo);
        janela.add(eValor);
        janela.add(confirmar);

        janela.setSize(400, 250);
        janela.setVisible(true);

        eValor.addActionListener(this);
        confirmar.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object src = e.getSource();

        if (src == confirmar) {
            String recebeString = eValor.getText();
            valorPro = Double.parseDouble(recebeString);
            if (valorPro == 0.0) {
            } else {
                TelaListaBuscaValor listaBusca = new TelaListaBuscaValor(dados, x1, valorPro);
            }
            janela.setVisible(false);
        }

    }

}