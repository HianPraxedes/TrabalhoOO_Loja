package model;

    /
    * Dados da bota
    * @author acer
    * @Version 1.0(Out 2021)
    */

public class Chinelo extends Produto {

    /
     * Guarda os dados cadastrais do chinelo, sendo ela:
     * (1)tipo de correia
     * (2)estetica
     * @param Chinelo
     * @return tipo de correia, estetica
     */

    String tipoCorreia;
    String estetica;

    public Chinelo() {

    }
    public String getTipoCorreia() {
        return tipoCorreia;
    }

    public void setTipoCorreia(String tipoCorreia) {
        this.tipoCorreia = tipoCorreia;
    }

    public String getEstetica() {
        return estetica;
    }

    public void setEstetica(String estetica) {
        this.estetica = estetica;
    }

}
