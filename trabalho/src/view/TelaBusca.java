package view;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import model.*;
import controller.*;
import javax.swing.event.*;
import view.*;

/**
 * Busca pelo nome do produto desejado
 * 
 * @author acer
 * 
 */
public class TelaBusca extends JFrame implements ActionListener {

    private final JFrame janela = new JFrame("Busca");
    private final JLabel titulo = new JLabel("Escreva o nome do produto");
    private final JButton confirmar = new JButton("Confirmar");
    private final JTextField eNome = new JTextField();
    String[] nomeProduto = new String[100];
    private static DadoController dados;
    private static String nomePro = "x";
    private static int x1;

    /**
     * Sera digitado nome nome do produto,e entao o usuario apertara o botao
     * confirmar
     * 
     * @param d
     * @param x
     */
    public TelaBusca(DadoController d, int x) {

        dados = d;
        x1 = x;

        titulo.setFont(new Font("Arial", Font.BOLD, 15));
        titulo.setBounds(100, 30, 200, 30);
        eNome.setBounds(110, 100, 250, 30);
        confirmar.setBounds(10, 100, 100, 30);

        janela.setLayout(null);
        janela.add(titulo);
        janela.add(eNome);
        janela.add(confirmar);

        janela.setSize(400, 250);
        janela.setVisible(true);

        eNome.addActionListener(this);
        confirmar.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object src = e.getSource();

        if (src == confirmar) {
            nomePro = eNome.getText().toUpperCase();
            if (nomePro.equals("x")) {
            } else {
                TelaListaBusca listaBusca = new TelaListaBusca(dados, nomePro, x1);
            }
            janela.setVisible(false);
        }

    }

}
