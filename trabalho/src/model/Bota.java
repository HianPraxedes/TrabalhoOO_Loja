package model;

/**
 * Dados da bota
 * 
 * @author acer
 * 
 */

public class Bota extends Produto {

    Double circunferenciaCano;
    Double alturaSalto;

    public Bota() {

        /**
         * Guarda os dados cadastrais da bota, sendo ela: (1)circuferencia do cano
         * (2)altura do salto
         * 
         * @param Bota
         * @return CircuferenciaCano, AlturaSalto
         */

    }

    public Double getCircunferenciaCano() {
        return circunferenciaCano;
    }

    public void setCircunferenciaCano(Double circunferenciaCano) {
        this.circunferenciaCano = circunferenciaCano;
    }

    public Double getAlturaSalto() {
        return alturaSalto;
    }

    public void setAlturaSalto(Double alturaSalto) {
        this.alturaSalto = alturaSalto;
    }

}
