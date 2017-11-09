/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dashboard;

import itens.Aviso;
import itens.Evento;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Alexandre.Torres
 */
public class Dashboard {

    ArrayList<ItemDashboard> itens = new ArrayList<>();
    
    public static void main(String[] args) {
        Dashboard dash = new Dashboard();
        
        Evento e1 = new Evento();
        Evento e2 = new Evento();
        Aviso a1 = new Aviso();
        Aviso a2 = new Aviso();
        Aviso a3 = new Aviso();
        
        e1.setDescricao("Apresentação de projeto final 1");
        e1.setInicio(new Date(2017, 11, 12));
        e1.setFim(new Date(2017, 11, 12));
        
        e2.setDescricao("Apresentação de projeto final 2");
        e2.setInicio(new Date(2017, 11, 12));
        e2.setFim(new Date(2017, 11, 12));
        
        a1.setCriacao(new Date());
        a1.setTexto( "PRESTEM ATENÇÃO NA AULA!!!");
        
        a2.setCriacao(new Date());
        a2.setTexto("SAIA DO WHATS. SE NÃO ESTÁ ENTENDENDO, PERGUNTE! NÃO FIQUE CONVERSANDO");

        a3.setCriacao(new Date());
        a3.setTexto("ISSO É UM RECADO. NÃO É SÓ UM EXEMPLO!");

        dash.registraItem(e1);
        dash.registraItem(e2);
        dash.registraItem(a1);
        dash.registraItem(a2);
        dash.registraItem(a3);
        dash.inicia();
                
    }
    
    public void registraItem( ItemDashboard item){
        itens.add( item );
    }
    
    public void inicia(){
        for (ItemDashboard item : itens){
            System.out.println( item.getDescricao());
            System.out.println("--------------------");
            System.out.println(item.getSituacao());
            System.out.println(item.getInfo1());
            System.out.println(item.getInfo2());
        }
    }
    
}
