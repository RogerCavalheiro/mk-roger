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
public class Lutarepescorp {
    private String cenario;

    public String getCenario() {
        return cenario;
    }

    public void setCenario(String cenario) {
        this.cenario = cenario;
    }

    public Reptile getPersonagem1() {
        return personagem1;
    }

    public void setPersonagem1(Reptile personagem1) {
        this.personagem1 = personagem1;
    }

    public Scorpion getPersonagem2() {
        return Personagem2;
    }

    public void setPersonagem2(Scorpion Personagem2) {
        this.Personagem2 = Personagem2;
    }

    public Integer getDano() {
        return dano;
    }

    public void setDano(Integer dano) {
        this.dano = dano;
    }

    public Integer getCombo() {
        return combo;
    }

    public void setCombo(Integer combo) {
        this.combo = combo;
    }
    private Reptile personagem1;
    private Scorpion Personagem2;
    private Integer dano;
    private Integer combo;
    
    
    public Lutarepescorp(){
        this.cenario = "Arena";
        this.personagem1 = new Reptile();
        this.Personagem2 = new Scorpion();
        this.dano = 5;
        this.combo = 20;
        
    }
    public void acertagolpe(String Lutador){
        if(Lutador.equals("p1"))
            this.Personagem2.setVida(this.Personagem2.getVida()-this.dano);
        
    }
   public void acertacombo(String Lutador){
       if (Lutador.equals("p1"))
           this.Personagem2.setVida(this.Personagem2.getVida()-this.combo);
   }

   
   
}
