package view;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import model.*;
import controller.*;
import javax.swing.event.*;
import view.*;

public class TelaLista extends JFrame implements ListSelectionListener {

    private final JFrame janela = new JFrame("Lista de usuarios");
    private final JLabel titulo = new JLabel("Escolha seu usuario");
    private JList<String> listaProdutosCadastrados;
    String[] nomeProduto = new String[100];
    private static DadoController dados;
    int y = 0;


    public TelaLista(DadoController d) {
        dados = d;

                titulo.setFont(new Font("Arial", Font.BOLD, 15));
                titulo.setBounds(250, 30, 150, 30);

                nomeProduto = new TelaListaController(dados).getNomePr();

                listaProdutosCadastrados = new JList<String>(nomeProduto);
                listaProdutosCadastrados.setBounds(20, 50, 550, 350);
                listaProdutosCadastrados.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
                listaProdutosCadastrados.setVisibleRowCount(10);

                janela.setLayout(null);

                janela.add(titulo);
                janela.add(listaProdutosCadastrados);

                janela.setSize(600, 450);
                janela.setVisible(true);

                listaProdutosCadastrados.addListSelectionListener(this);
        }


    @Override
    public void valueChanged(ListSelectionEvent e) {
        Object src = e.getSource();

		if(e.getValueIsAdjusting() && src == listaProdutosCadastrados) {
			TelaProduto produto = new TelaProduto(dados,listaProdutosCadastrados.getSelectedIndex());
		}
        janela.setVisible(false);
        
    }
}