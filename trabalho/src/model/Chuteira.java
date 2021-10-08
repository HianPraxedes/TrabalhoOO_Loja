package model;

     /
     * Dados da chuteira
     * @author acer
     * @Version 1.0(Out 2021)
     */


public class Chuteira extends Produto {

     /
     * Guarda os dados cadastrais do chuteira, sendo ela:
     * (1)departamento
     * (2)tipo de trava
     * @param Chuteira
     * @return departamento, tipo de trava
     */

    String departamento;
    String tipoTrava;
    String modeloCadarco;

    public Chuteira() {

    }

    public String getDepartamentDouble() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getTipoTrava() {
        return tipoTrava;
    }

    public void setTipoTrava(String tipoTrava) {
        this.tipoTrava = tipoTrava;
    }

    public String getModeloCadarco() {
        return modeloCadarco;
    }

    public void setModeloCadarco(String modeloCadarco) {
        this.modeloCadarco = modeloCadarco;
    }
}
