package controller;

/
 * controle de Pessoa cadastrada
 * @author acer
 * @Version 1.0(Out 2021)
 */

import java.awt.event.ActionEvent;

import javax.swing.JButton;

import view.TelaPessoa;

import view.TelaCadastroPessoa;

public class TelaPessoaController {
    
    /
     * Verifica se o usuário está cadastrado
     * se estiver: será redirecionado para outra tela
     * senão: será redirecionado para tela de cadastro de pessoa
     * @param verifica o cadastro
     * @return tela de cadaatro de pessoa
     */
    
    private final TelaPessoa view;
    

    public TelaPessoaController(TelaPessoa view) {
        super();
        this.view = view;
    }

    public void verificacaoCadastro(ActionEvent e){

        JButton botaoPressionado = (JButton) e.getSource();

        if(botaoPressionado == view.getSim()){
            
        } else {
            TelaCadastroPessoa telaCadastro = new TelaCadastroPessoa();
        }

    }

    public TelaPessoa getView() {
        return view;
    }
}
