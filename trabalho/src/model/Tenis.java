package model;

	/
 	* Dados do tenis
 	* @author acer
 	* @Version 1.0(Out 2021)
 	*/

public class Tenis extends Produto {
	
	 /
    	 * Guarda os dados cadastrais do tenis, sendo elas:
    	 * (1)altura do cano
    	 * (2)modelo
    	 * @param tenis
    	 * @return altura do cano, modelo
    	 */ 

	
	Double alturaCano;
	String modelo;
    
	public Tenis() {
		
	}
    
    public double getAlturaCano() {
        return alturaCano;
    }

    public void setAlturaCano(double alturaCano) {
        this.alturaCano = alturaCano;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
}

