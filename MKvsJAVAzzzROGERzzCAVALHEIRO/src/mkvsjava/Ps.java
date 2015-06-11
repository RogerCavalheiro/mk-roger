/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mkvsjava;

/**
 *
 * @author Roger
 */
public class Ps {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Reptile pe1 = new Reptile();
        pe1.setSocoforte("circulo");
            pe1.setAgarrar("R1");
                pe1.setChuteforte("triangulo");
                   pe1.setChutefraco("quadrado");
                      pe1.setDefesa("L1");
                         pe1.setSocofraco("X");
                              pe1.setEspecial("R1 + L1");
                            
                            System.out.println("°°°°°°°°°ºººººº°°ººººConfiguração Dos Botõesºº°°°°ºººº°°°°°ºººº°°°°°°ºº");
        
        System.out.println("Soco Forte: "+pe1.getSocoforte());
        System.out.println("Soco Fraco: "+pe1.getSocofraco());
        System.out.println("Chute Forte: "+pe1.getChuteforte());
        System.out.println("Chute Fraco: "+pe1.getChutefraco());
        System.out.println("Agarrar: "+pe1.getAgarrar());
        System.out.println("Defesa: "+pe1.getDefesa());
        System.out.println("Especial: "+pe1.getEspecial());
                                                            
        System.out.println("===-_-_-_-_-_-_-_-_-_-Skills-_-_-_-_-_-_-_-_-_-_-===");
        System.out.println("Invisivel: "+ pe1.invisivel());
        System.out.println("Acido: "+pe1.acido());
        System.out.println("Bola Rapida"+pe1.bolarapida());
        System.out.println("Bola Lenta"+pe1.bolalenta());
        System.out.println("Combo 1"+pe1.combo1());
        System.out.println("Combo 2"+pe1.combo2());
        System.out.println("Fatality 1"+pe1.fatality1());
        System.out.println("Falatity 2"+pe1.fatality2());
    }
           
}