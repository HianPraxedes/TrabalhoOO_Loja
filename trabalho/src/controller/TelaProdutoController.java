package controller;

/
 * Controle da telaProduto
 * @author acer
 * @Version 1.0(Out 2021)
 */

import model.Produto;

public class TelaProdutoController {
    
    /
     * recebe a quantidade de produtos cadastrados
     * @return quantidade de produtos cadastrados
     */
    
    private String[] p;
    private int qtdProdutosCadas;
    private String[] id;
    private String[] marc;
    private int[] tamanho;
    private Double[] valor;
    private String[] cor;
    private String[] cat;
    private String[] alturaCan;
    private String[] circfC;
    private String[] alturaSal;
    private String[] depart;
    private String[] tipoTrava;
    private String[] modelCadar;
    private String[] tipCorreia;
    private String[] estet;
    private String[] material;
    private String[] model;
    private int[] qtdProdutos;

    public TelaProdutoController(){
       
    }

    public int getQtdProdutosCadas() {
        return qtdProdutosCadas;
    }

    public void setQtdProdutosCadas(int qtdProdutosCadas) {
        this.qtdProdutosCadas = qtdProdutosCadas;
    }
}
