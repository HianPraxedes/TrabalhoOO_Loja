package controller;

 /
 * tela que controla cadastro do usuário 
 * @author acer
 * @Version 1.0(Out 2021)
 */

import java.awt.event.ActionEvent;

import javax.swing.JButton;

import model.Pessoa;
import view.TelaCadastroPessoa;

public class TelaCadastroPessoaController {
    
     /
     * TelaCadastroPessoaController realiza acontabilidade de um novo cadastro e retorna para o view
     * @param controle de cadastro do usuário 
     * @return novo cadastro no banco de cadastrados
     */

    private final TelaCadastroPessoa view;

    public TelaCadastroPessoaController(TelaCadastroPessoa view) {
        super();
        this.view = view;
    }

    public void fazerCadastro(ActionEvent e){

        JButton botaoPressionado = (JButton) e.getSource();
    
        

        if(botaoPressionado == view.getConfirmar()){

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
