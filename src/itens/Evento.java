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
public class Evento implements ItemDashboard {
    public Date inicio;
    public Date fim;
    public int status;
    public String descricao;
    
    public static final int AGENDADO = 1;
    public static final int ANDAMENTO = 2;
    public static final int ENCERRADO = 3;
    
    public Evento(){
        status = AGENDADO;
    }

    public Date getInicio() {
        return inicio;
    }

    public void setInicio(Date inicio) {
        this.inicio = inicio;
    }

    public Date getFim() {
        return fim;
    }

    public void setFim(Date fim) {
        this.fim = fim;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    @Override
    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public String getSituacao() {
        switch(status){
            case AGENDADO: return "Agendado";
            case ANDAMENTO: return "Andamento";
            case ENCERRADO: return "Encerrado";
            default: return "Outro";
        }
    }

    @Override
    public String getInfo1() {
        return "Inicio em: " + inicio;
    }

    @Override
    public String getInfo2() {
        return "Encerramento em: " + fim;
    }
    
}
