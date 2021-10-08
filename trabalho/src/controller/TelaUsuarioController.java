package controller;

/
 * Lista de usuários 
 * @author acer
 * @Version 1.0(Out 2021)
 /


import model.*;
import view.*;

public class TelaUsuarioController {
    
        /
     * mostrar os dados da lista de usuários pré-cadastrado no sistema
     * @param lista de usuários
     * @return dados pré-cadastrados
     */
            
    private String[] a;
    private int qtdPessoa;
    private String[] tipoUser;

    public TelaUsuarioController(DadoController d) {
        a = d.getPessoas();
        qtdPessoa = d.getQtdPessoas();
        tipoUser = d.getTipoUser();
    }

    public int getQtdPessoa() {
        return qtdPessoa;
    }

    public void setQtdPessoa(int qtdPessoa) {
        this.qtdPessoa = qtdPessoa;
    }

    public String[] getNomeP(int x, int y) {
        String[] s = new String[qtdPessoa + y];
        if (x == 1) {
            for (int i = 0; i < qtdPessoa + y; i++) {
                if (tipoUser[i].equalsIgnoreCase("CLIENTE")) {
                    if (a[i].toString().equals("x")) {
                    } else {
                        s[i] = a[i].toString();
                    }
                }
            }
        } else {
            for (int i = 0; i < qtdPessoa + y; i++) {
            	if(tipoUser[i].equalsIgnoreCase(null)) {
            		}else {
            			if (tipoUser[i].equalsIgnoreCase("VENDEDOR")) {
                			if (a[i].toString().equals("x")) {
                			} else {
                				s[i] = a[i].toString();		
                			}
            		}
                }
            }
        }
        return s;
    }

}
