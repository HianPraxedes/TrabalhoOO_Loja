package view;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import model.*;
import controller.*;
import javax.swing.event.*;
import view.*;

/**
 * Tela para Editar dados do usuário
 * 
 * @author acer
 *
 */
public class TelaEditarPessoa implements ActionListener {

    private final JFrame janela = new JFrame("Edicao de usuario");
    private final JLabel titulo = new JLabel("Edicao");
    private final JButton confirmar = new JButton("Confirmar");
    private final JButton apagar = new JButton("apagar");
    private JTextField eNome;
    private final JTextField eCpf;
    private final JTextField eDataNasc;
    private final JTextField eTelefone;
    private final JLabel nome = new JLabel("Nome: ");
    private final JLabel cpf = new JLabel("CPF: ");
    private final JLabel dataNasc = new JLabel("Data de nascimento (xx/xx/xx): ");
    private final JLabel telefone = new JLabel("Telefone: ");
    public static DadoController dados;
    public static int posi;

    /**
     * Sera utilizado a TelaEditarPessoas para alterar dados cadastrados no sistema
     * de algum vendedor e/ou cliente
     * 
     * @param d
     * @param pos
     */
    public TelaEditarPessoa(DadoController d, int pos) {
        dados = d;
        posi = pos;

        titulo.setFont(new Font("Arial", Font.BOLD, 20));
        titulo.setBounds(250, 30, 150, 30);
        nome.setFont(new Font("Arial", Font.BOLD, 15));
        nome.setBounds(10, 100, 100, 30);
        cpf.setFont(new Font("Arial", Font.BOLD, 15));
        cpf.setBounds(10, 150, 100, 30);
        dataNasc.setFont(new Font("Arial", Font.BOLD, 15));
        dataNasc.setBounds(10, 200, 250, 30);
        telefone.setFont(new Font("Arial", Font.BOLD, 15));
        telefone.setBounds(10, 250, 100, 30);

        eNome = new JTextField(dados.getPessoas()[pos]);
        eNome.setBounds(250, 100, 250, 30);
        eCpf = new JTextField(dados.getCpf()[pos]);
        eCpf.setBounds(250, 150, 250, 30);
        eDataNasc = new JTextField(dados.getTipoDatNas()[pos]);
        eDataNasc.setBounds(250, 200, 250, 30);
        eTelefone = new JTextField(dados.getTel()[pos]);
        eTelefone.setBounds(250, 250, 250, 30);

        confirmar.setBounds(450, 350, 100, 30);
        apagar.setBounds(250, 350, 100, 30);

        janela.setLayout(null);

        janela.add(titulo);
        janela.add(nome);
        janela.add(cpf);
        janela.add(dataNasc);
        janela.add(telefone);
        janela.add(eNome);
        janela.add(eCpf);
        janela.add(eDataNasc);
        janela.add(eTelefone);
        janela.add(confirmar);
        janela.add(apagar);

        eNome.addActionListener(this);
        eCpf.addActionListener(this);
        eDataNasc.addActionListener(this);
        eTelefone.addActionListener(this);
        confirmar.addActionListener(this);
        apagar.addActionListener(this);

        janela.setSize(600, 450);
        janela.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object src = e.getSource();

        if (src == confirmar) {
            String nomePessoa = eNome.getText().toUpperCase();
            String cpf = eCpf.getText().toUpperCase();
            String dataNasc = eDataNasc.getText().toUpperCase();
            String telefone = eTelefone.getText().toUpperCase();

            TelaCadastroController telaCadastroController = new TelaCadastroController(dados, posi, nomePessoa, cpf,
                    dataNasc, telefone);
            janela.setVisible(false);
        } else {
            TelaCadastroController telaCadastroController = new TelaCadastroController(dados, posi);
            janela.setVisible(false);
        }

    }
}
