package controller;

import java.awt.event.ActionEvent;

import javax.swing.JButton;

import view.TelaMenu;

/**
 * Controle do Menu de usuarios. TelaMenuController controla o usuario escolhido
 * no menu valida que tal usuario sera escolhido
 * 
 * @author acer
 * 
 */
public class TelaMenuController {
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
