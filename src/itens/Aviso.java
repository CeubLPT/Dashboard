/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package itens;

import dashboard.ItemDashboard;
import java.util.Date;

/**
 *
 * @author Alexandre.Torres
 */
public class Aviso implements ItemDashboard {
    
    private String texto;
    private Date criacao;

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public Date getCriacao() {
        return criacao;
    }

    public void setCriacao(Date criacao) {
        this.criacao = criacao;
    }
    

    @Override
    public String getSituacao() {
        return "";
    }

    @Override
    public String getDescricao() {
        return "AVISO";
    }

    @Override
    public String getInfo1() {
       return getTexto();
    }

    @Override
    public String getInfo2() {
        return "";
    }
    
}
