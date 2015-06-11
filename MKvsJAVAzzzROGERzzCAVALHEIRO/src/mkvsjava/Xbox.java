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
public class Xbox {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Reptile p1 = new Reptile();
        p1.setAgarrar("[LB]");
        p1.setChuteforte("(X)");
        p1.setChutefraco("(Y)");
        p1.setDefesa("[RB]");
        p1.setEspecial("[LB]+[RB]");
        p1.setSocoforte("(B)");
        p1.setSocofraco("(A)");
        
        Scorpion p2 =new Scorpion();
        p2.setAgarrar("[LB]");
        p2.setChuteforte("(X)");
        p2.setChutefraco("(Y)");
        p2.setDefesa("[RB]");
        p2.setEspecial("[LB]+[RB]");
        p2.setSocoforte("(B)");
        p2.setSocofraco("(A)");
        
        Subzero p3 = new Subzero();
        p2.setAgarrar("[LB]");
        p2.setChuteforte("(X)");
        p2.setChutefraco("(Y)");
        p2.setDefesa("[RB]");
        p2.setEspecial("[LB]+[RB]");
        p2.setSocoforte("(B)");
        p2.setSocofraco("(A)");
        
        
        System.out.println("Soco Forte : " + p1.getSocoforte());
                System.out.println("Soco Fraco : " + p1.getSocofraco());
                        System.out.println("Chute Forte : " + p1.getChuteforte());
                                System.out.println("Chute Fraco : " + p1.getChutefraco());
                                        System.out.println("Agarrar : " + p1.getAgarrar());
                                                System.out.println("Defesa : " + p1.getDefesa());
                                                        System.out.println("Especial : " + p1.getEspecial());
                                                        
        System.out.println("°°°°°°°°°ºººººº°°ººººConfiguração Dos Botõesºº°°°°ºººº°°°°°ºººº°°°°°°ºº");
        
        System.out.println("Soco Forte: "+p1.getSocoforte());
        System.out.println("Soco Fraco: "+p1.getSocofraco());
        System.out.println("Chute Forte: "+p1.getChuteforte());
        System.out.println("Chute Fraco: "+p1.getChutefraco());
        System.out.println("Agarrar: "+p1.getAgarrar());
        System.out.println("Defesa: "+p1.getDefesa());
        System.out.println("Especial: "+p1.getEspecial());
                                                            
        System.out.println("===-_-_-_-_-_-_-_-_-_-Skills-_-_-_-_-_-_-_-_-_-_-===");
        
        System.out.println("                      REPTILE                       ");
        
        System.out.println("Invisivel: "+ p1.invisivel());
        System.out.println("Acido: "+p1.acido());
        System.out.println("Bola Rapida"+p1.bolarapida());
        System.out.println("Bola Lenta"+p1.bolalenta());
        System.out.println("Combo 1"+p1.combo1());
        System.out.println("Combo 2"+p1.combo2());
        System.out.println("Fatality 1"+p1.fatality1());
        System.out.println("Falatity 2"+p1.fatality2());
        System.out.println("                      SCORPION                      ");
        System.out.println("Spear: "+p2.spear());
        System.out.println("Teleforte: "+p2.teleporte());
        System.out.println("combo1: "+p2.combo1());
        System.out.println("combo2: "+p2.combo2());
        System.out.println("Fatality1:"+p2.fatality1());
        System.out.println("Fatality2:"+p2.fatality2());                        
        
        System.out.println("                      SUBZERO                       ");
        
        System.out.println("SnowBall:"+ p3.snowball());
        System.out.println("Slip"+ p3.slip());
        System.out.println("combo1:"+p3.combo1());
        System.out.println("combo2:"+p3.combo2());
        System.out.println("fatality1:"+p3.fatality1());
        System.out.println("fatality2"+p3.fatality2());
        
        
        
        Lutarepescorp rs = new Lutarepescorp();
        rs.setCenario("Arena");
        rs.setPersonagem1(p1);
        rs.setPersonagem2(p2);
        
        rs.acertagolpe("p1");
        System.out.println("personagem 1 acertou golpe");
        System.out.println("personagem 1"+ rs.getPersonagem1().getVida());
        System.out.println("personagem 1 :"+rs.getPersonagem1().getVida()+"\n personagem 2:"+rs.getPersonagem2().getVida()+"\n");
        
        rs.acertagolpe("p1");
        System.out.println("personagem 1  - acertou combo");
        System.out.println("personagem 1 :"+rs.getPersonagem1().getVida()+ "\n personagem2"+rs.getPersonagem2().getVida()+"\n");
        rs.acertagolpe("p2");
        System.out.println("personagem 1 - acertou golpe ");
        System.out.println("p2");
        System.out.println("personagem 1 "+rs.getPersonagem1().getVida()+ "\n personagem2:"+rs.getPersonagem2().getVida()+"\n");
        
        
        
        
        
        






    }
    
}
