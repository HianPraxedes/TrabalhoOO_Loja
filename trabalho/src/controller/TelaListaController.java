package controller;

import model.Produto;
import view.TelaLista;
import controller.*;

/**
 * Lista de produto pesquisado
 * 
 * @author acer
 * 
 */
public class TelaListaController {
    private String[] p;
    private int qtdPro;
    private Double[] valor;

    /**
     * Essa classe adciona um novo produto na lista de produtos
     * 
     * @param d
     */
    public TelaListaController(DadoController d) {
        p = d.getNomePro();
        qtdPro = d.getQtdPro();
        valor = d.getValor();
    }

    public int getQtdPro() {
        return qtdPro;
    }

    public void setQtdPro(int qtdPro) {
        this.qtdPro = qtdPro;
    }

    /**
     * Selecionas o nome dos produtos
     * 
     * @param x
     * @return lista dos produtos
     */
    public String[] getNomePr(int x) {
        String[] s = new String[qtdPro + x];
        for (int i = 0; i < qtdPro; i++) {
        	if(p[i].toString().equals(null)) {	
        	}else {
        		s[i] = p[i].toString();
        	}
        }
        return s;
    }

    /**
     * Restringe os nomes de produtos que pode entrar na lista
     * 
     * @param nome
     * @param x
     * @return lista dos produtos
     */

    public String[] getNomePro(String nome, int x) {
        String[] s = new String[qtdPro];
        for (int i = 0; i < qtdPro; i++) {
            if (nome.equals("x")) {
            } else {
                if (nome.equalsIgnoreCase(p[i].toString())) {
                    s[i] = p[i].toString();
                }
            }
        }
        return s;
    }

    /**
     * Restring os produtos que podem entrar na lista pelo valor
     * 
     * @param v
     * @param x
     * @return
     */
    public String[] getValorPro(Double v, int x) {
        String[] s = new String[qtdPro + x];
        for (int i = 0; i < qtdPro + x; i++)
            if (v == 0.0) {
            } else {
                if (v <= valor[i]) {
                    s[i] = p[i].toString();
                }
            }
        return s;
    }
}
