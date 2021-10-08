package controller;

/
 * controle do Menu de usuários
 * @author acer
 * @Version 1.0(Out 2021)
 */

import java.awt.event.ActionEvent;

import javax.swing.JButton;

import view.TelaMenu;

public class TelaMenuController {
    
    /
     * TelaMenuController controla o usuário escolhido no menu
     * valida que tal usuário será escolhido
     * @param controle da tela menu
     * @return escolha de usuário para tela menu no view
     */

    private final TelaMenu view;

    public TelaMenuController(TelaMenu view) {
        super();
        this.view = view;
    }

    public void EscolhaUsuario(ActionEvent e) {

        JButton botaoPressionado = (JButton) e.getSource();

       
    }

    public TelaMenu getView() {
        return view;
    }
}
