package controller;

/
 * Lista de produto pesquisado
 * @author acer
 * @Version 1.0(Out 2021)
 /

import model.Produto;
import view.TelaLista;
import controller.*;

public class TelaListaController {
    private String[] p;
    private int qtdPro;
    private Double[] valor;

    public TelaListaController(DadoController d) {
        
      /
     * Essa  classe adciona um novo produto na lista de produtos
     * @param controle de lista de produtos
     * @return quantidade de produto
     */
        
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

    public String[] getNomePr(int x) {
        String[] s = new String[qtdPro + x];
        for (int i = 0; i < qtdPro + x; i++) {
            s[i] = p[i].toString();
        }
        return s;
    }

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
