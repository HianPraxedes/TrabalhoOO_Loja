package model;

    /
    * Dados da sapatilha
    * @author acer
    * @Version 1.0(Out 2021)
    */

import java.util.Scanner;

public class Sapatilha extends Produto {
    
     /
     * Guarda os dados cadastrais da sapatilha , sendo ela:
     * (1)tipo de bico
     * (2)material
     * @param Sapatilha
     * @return tipo de bico, material
     */

    private String tipoBico;
    private String material;    

    public Sapatilha() {

    }
    public String getTipoBico() {
        return tipoBico;
    }

    public void setTipoBico(String tipoBico) {
        this.tipoBico = tipoBico;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

}
