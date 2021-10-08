package controller;



import java.awt.event.ActionEvent;

import javax.swing.JButton;

import view.*;
import controller.*;
import model.*;
/**
 * tela controle de cadastros
 * 
 * @author acer
 * 
 */
public class TelaCadastroController {
    
  /**
     * Guarda lista dos dados cadastrados do sistema
     * 
     * @param d
     * @param o
     * @param pos
     * @param nP
     * @param c
     * @param dN
     * @param tel
     * @param y
     */
    public TelaCadastroController(DadoController d, int o, int pos, String nP, String c, String dN, String tel, int y,String[] dado) {

        d.getPessoas()[d.getNumPessoasCad() + y] = nP;
        d.getCpf()[d.getNumPessoasCad() + y] = c;
        d.getTipoDatNas()[d.getNumPessoasCad() + y] = dN;
        d.getTel()[d.getNumPessoasCad() + y] = tel;
        if (o == 1) {
            d.getTipoUser()[d.getNumPessoasCad() + y] = "CLIENTE";
        } else {
            d.getTipoUser()[d.getNumPessoasCad() + y] = "VENDEDOR";
        }

        dado[0]=d.getPessoas()[d.getNumPessoasCad() + y];
        dado[1]= d.getCpf()[d.getNumPessoasCad() + y];
        dado[2]=d.getTel()[d.getNumPessoasCad() + y];

    }

    public TelaCadastroController(DadoController d, int pos, String nP, String c, String dN, String tel) {

        if (nP.equals(null)) {
        } else {
            d.getPessoas()[pos] = nP;
        }
        if (c.equals(null)) {
        } else {
            d.getCpf()[pos] = c;
        }
        if (dN.equals(null)) {
        } else {
            d.getTipoDatNas()[pos] = dN;
        }
        if (tel.equals(null)) {
        } else {
            d.getTel()[pos] = tel;
        }
    }

    public TelaCadastroController(DadoController dados, int posi) {

        dados.getPessoas()[posi] = "x";
        dados.getCpf()[posi] = "x";
        dados.getTipoDatNas()[posi] = "x";
        dados.getTel()[posi] = "x";

    }

    public TelaCadastroController(int x, int y, DadoController d, String nome, String marca, String id, int tamanho,
            String cor, Double valorProduto, int quantidade, String tipoBico, String material,String[] nomeP) {

        d.getNomePro()[d.getQtdPro() + x] = nome;
        d.getMarca()[d.getQtdPro() + x] = marca;
        d.getId()[d.getQtdPro() + x] = id;
        d.getTamanho()[d.getQtdPro() + x] = tamanho;
        d.getCor()[d.getQtdPro() + x] = cor;
        d.getValor()[d.getQtdPro() + x] = valorProduto;
        d.getQTdProEst()[d.getQtdPro() + x] = quantidade;
        if (y == 1) {
            d.getTipBico()[d.getQtdPro() + x] = tipoBico;
            d.getMat()[d.getQtdPro() + x] = material;
        } else {
            d.getTipoCorrreia()[d.getQtdPro() + x] = tipoBico;
            d.getEstet()[d.getQtdPro() + x] = material;
        }
        
        nomeP[0]= d.getNomePro()[d.getQtdPro() + x];
    }

    public TelaCadastroController(int x, int y, DadoController d, String nome, String marca, String id, int tamanho,
            String cor, Double valorProduto, int quantidade, Double circunfe, Double alturaSalto,String[] valorP) {
        d.getNomePro()[d.getQtdPro() + x] = nome;
        d.getMarca()[d.getQtdPro() + x] = marca;
        d.getId()[d.getQtdPro() + x] = id;
        d.getTamanho()[d.getQtdPro() + x] = tamanho;
        d.getCor()[d.getQtdPro() + x] = cor;
        d.getValor()[d.getQtdPro() + x] = valorProduto;
        d.getQTdProEst()[d.getQtdPro() + x] = quantidade;
        d.getCircunfCano()[d.getQtdPro() + x] = circunfe;
        d.getAltSalto()[d.getQtdPro() + x] = alturaSalto;
        
        valorP[0] = String.valueOf(d.getValor()[d.getQtdPro() + x]);
    }

    public TelaCadastroController(int x, int y, DadoController d, String nome, String marca, String id, int tamanho,
            String cor, Double valorProduto, int quantidade, String departamento, String tipoTrava,
            String modeloCadar) {
        d.getNomePro()[d.getQtdPro() + x] = nome;
        d.getMarca()[d.getQtdPro() + x] = marca;
        d.getId()[d.getQtdPro() + x] = id;
        d.getTamanho()[d.getQtdPro() + x] = tamanho;
        d.getCor()[d.getQtdPro() + x] = cor;
        d.getValor()[d.getQtdPro() + x] = valorProduto;
        d.getQTdProEst()[d.getQtdPro() + x] = quantidade;
        d.getDepart()[d.getQtdPro() + x] = departamento;
        d.getTipoTrava()[d.getQtdPro() + x] = tipoTrava;
        d.getModelCadarco()[d.getQtdPro() + x] = modeloCadar;
    }

    public TelaCadastroController(int x, int y, DadoController d, String nome, String marca, String id, int tamanho,
            String cor, Double valorProduto, int quantidade, Double alturaCano, String modelo, String[] qtdP) {
        d.getNomePro()[d.getQtdPro() + x] = nome;
        d.getMarca()[d.getQtdPro() + x] = marca;
        d.getId()[d.getQtdPro() + x] = id;
        d.getTamanho()[d.getQtdPro() + x] = tamanho;
        d.getCor()[d.getQtdPro() + x] = cor;
        d.getValor()[d.getQtdPro() + x] = valorProduto;
        d.getQTdProEst()[d.getQtdPro() + x] = quantidade;
        d.getAltCano()[d.getQtdPro() + x] = alturaCano;
        d.getModel()[d.getQtdPro() + x] = modelo;
        
        qtdP[0] = String.valueOf(d.getQTdProEst()[d.getQtdPro() + x]);

    }

    public TelaCadastroController(DadoController d, int posi, int op, String nomeProduto, String marca, String id,
            int tamanho, String cor, Double valorProduto, int quantidade, String tipoBico, String material,
            Double circunferenciaC, Double alturaS, String departamento, String tipoTrava, String modeloCadarco,
            String tipoCorreia, String estetica, Double alturaCano, String modelo) {

        d.getNomePro()[posi] = nomeProduto;
        d.getMarca()[posi] = marca;
        d.getId()[posi] = id;
        d.getTamanho()[posi] = tamanho;
        d.getCor()[posi] = cor;
        d.getValor()[posi] = valorProduto;
        d.getQTdProEst()[posi] = quantidade;

        if (op == 1) {
            d.getTipBico()[posi] = tipoBico;
            d.getMat()[posi] = material;

        } else if (op == 2) {
            d.getCircunfCano()[posi] = circunferenciaC;
            d.getAltSalto()[posi] = alturaS;
        } else if (op == 3) {
            d.getDepart()[posi] = departamento;
            d.getTipoTrava()[posi] = tipoTrava;
            d.getModelCadarco()[posi] = modeloCadarco;

        } else if (op == 4) {
            d.getTipoCorrreia()[posi] = tipoCorreia;
            d.getEstet()[posi] = estetica;

        } else {
            d.getAltCano()[posi] = alturaCano;
            d.getModel()[posi] = modelo;

        }
    }
    public TelaCadastroController(DadoController d, int posi,int op) {

        d.getNomePro()[posi] = "x";
        d.getMarca()[posi] = "x";
        d.getId()[posi] = "x";
        d.getTamanho()[posi] = 0;
        d.getCor()[posi] = "x";
        d.getValor()[posi] = 0.0;
        d.getQTdProEst()[posi] = 0;

        if (op == 1) {
            d.getTipBico()[posi] = "x";
            d.getMat()[posi] = "x";

        } else if (op == 2) {
            d.getCircunfCano()[posi] = 0.0;
            d.getAltSalto()[posi] = 0.0;
        } else if (op == 3) {
            d.getDepart()[posi] = "x";
            d.getTipoTrava()[posi] = "x";
            d.getModelCadarco()[posi] = "x";

        } else if (op == 4) {
            d.getTipoCorrreia()[posi] = "x";
            d.getEstet()[posi] = "x";

        } else {
            d.getAltCano()[posi] = 0.0;
            d.getModel()[posi] = "x";

        }

    }
}
