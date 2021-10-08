package controller;

import java.awt.event.ActionEvent;

import javax.swing.JButton;

import model.Pessoa;
import view.TelaCadastroPessoa;

/**
 * tela que controla cadastro do usuario. * TelaCadastroPessoaController realiza
 * a contabilidade de um novo cadastro e retorna para o view
 * 
 * @author acer
 * 
 */
public class TelaCadastroPessoaController {

    private final TelaCadastroPessoa view;

    /**
     * Recebe a a pasta view para os dados serem usados nessa classe
     * 
     * @param view
     */
    public TelaCadastroPessoaController(TelaCadastroPessoa view) {
        super();
        this.view = view;
    }

    public void fazerCadastro(ActionEvent e) {

        JButton botaoPressionado = (JButton) e.getSource();

        if (botaoPressionado == view.getConfirmar()) {

            String nomePessoa = view.getENome().getText();
            String cpf = view.getECpf().getText();
            String dataNasc = view.getEDataNasc().getText();
            String telefone = view.getETelefone().getText();

            Pessoa novaPessoa = new Pessoa(nomePessoa, cpf, dataNasc, telefone);
            view.getJanela().setVisible(false);
        }
    }

    public TelaCadastroPessoa getView() {
        return view;
    }
}
