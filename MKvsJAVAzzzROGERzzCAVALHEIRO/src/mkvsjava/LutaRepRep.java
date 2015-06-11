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
public class LutaRepRep {
    private String cenario;
    private Reptile personagem2;
    private Reptile Personagem2;

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

    public Reptile getPersonagem2(Reptile personagem2) {
        return personagem2;
    }

    public void setPersonagem2(Reptile Personagem2) {
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
    
    private Integer dano;
    private Integer combo;
    
    
    public LutaRepRep(){
        this.cenario = "Arena";
        this.personagem1 = new Reptile();
        this.Personagem2 = new Reptile();
        this.dano = 5;
        this.combo = 20;
        
    }
    public void acertagolpe(String Lutador){
        if(Lutador.equals("p1"))
            this.Personagem2.setVida(this.Personagem2.getVida()-this.dano);
        
    }
   public void acertacombo(String Lutador){
       if (Lutador.equals("p2"))
           this.Personagem2.setVida(this.Personagem2.getVida()-this.combo);
   }

   
   
}
