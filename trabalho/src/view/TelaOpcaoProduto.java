package view;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import controller.DadoController;
import controller.TelaMenuController;

/**
 * Opcao do produto
 * 
 * @author acer
 *
 */
public class TelaOpcaoProduto extends JFrame implements ActionListener {

    private final JFrame janela = new JFrame("Opcao do cliente");
    private final JLabel titulo = new JLabel("Escolha uma opcao");
    private final static JButton sapatilha = new JButton("Sapatilha");
    private final static JButton bota = new JButton("Bota");
    private final static JButton chuteira = new JButton("Chuteira");
    private final static JButton chinelo = new JButton("Chinelo");
    private final static JButton tenis = new JButton("Tenis");
    public static DadoController dados;
    public static int posi;
    public static int x1;

    /**
     * Tela mostra as opcoes de cadastro de produto pelo cliente sendo essas
     * opcoes:Sapatilha, bota, chuteira, chinelo, tenis
     * 
     * @param d
     * @param x
     * @param pos
     */
    public TelaOpcaoProduto(DadoController d, int x, int pos) {

        dados = d;
        posi = pos;
        x1 = x;

        titulo.setFont(new Font("Arial", Font.BOLD, 15));
        titulo.setBounds(120, 30, 200, 30);
        sapatilha.setBounds(30, 80, 100, 30);
        bota.setBounds(200, 80, 100, 30);
        chuteira.setBounds(30, 120, 100, 30);
        chinelo.setBounds(200, 120, 100, 30);
        tenis.setBounds(30, 160, 100, 30);

        janela.setLayout(null);

        janela.add(titulo);
        janela.add(sapatilha);
        janela.add(bota);
        janela.add(chuteira);
        janela.add(chinelo);
        janela.add(tenis);

        sapatilha.addActionListener(this);
        bota.addActionListener(this);
        chuteira.addActionListener(this);
        chinelo.addActionListener(this);
        tenis.addActionListener(this);

        janela.setSize(400, 300);
        janela.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object botaoPressionado = e.getSource();

        if (botaoPressionado == sapatilha) {
            TelaCadastroProduto produto = new TelaCadastroProduto(dados, x1, 1);
            janela.setVisible(false);
        } else if (botaoPressionado == bota) {
            TelaCadastroProduto produto = new TelaCadastroProduto(dados, x1, 2);
            janela.setVisible(false);
        } else if (botaoPressionado == chuteira) {
            TelaCadastroProduto produto = new TelaCadastroProduto(dados, x1, 3);
            janela.setVisible(false);
        } else if (botaoPressionado == chinelo) {
            TelaCadastroProduto produto = new TelaCadastroProduto(dados, x1, 4);
            janela.setVisible(false);
        } else {
            TelaCadastroProduto produto = new TelaCadastroProduto(dados, x1, 5);
            janela.setVisible(false);
        }

    }

}
