package model;

/**
 * Dados da chinelo
 * 
 * @author acer
 *
 */

public class Chinelo extends Produto {

    /**
     * Guarda os dados cadastrais do chinelo, sendo ela: (1)tipo de correia
     * (2)estetica
     * 
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
