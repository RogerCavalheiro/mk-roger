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
public class Scorpion {
     private String socoforte;
     private String socofraco;
     private String chuteforte;
     private String chutefraco;
     private String defesa;
     

    public String getSocoforte() {
        return socoforte;
    }

    public void setSocoforte(String socoforte) {
        this.socoforte = socoforte;
    }

    public String getSocofraco() {
        return socofraco;
    }

    public void setSocofraco(String socofraco) {
        this.socofraco = socofraco;
    }

    public String getChuteforte() {
        return chuteforte;
    }

    public void setChuteforte(String chuteforte) {
        this.chuteforte = chuteforte;
    }

    public String getChutefraco() {
        return chutefraco;
    }

    public void setChutefraco(String chutefraco) {
        this.chutefraco = chutefraco;
    }

    public String getDefesa() {
        return defesa;
    }

    public void setDefesa(String defesa) {
        this.defesa = defesa;
    }

    public String getAgarrar() {
        return agarrar;
    }

    public void setAgarrar(String agarrar) {
        this.agarrar = agarrar;
    }


     private String agarrar;
     private String especial;
     private Integer vida;

    public Integer getVida() {
        return vida;
    }

    public void setVida(Integer vida) {
        this.vida = vida;
    }
     public String invisivel(){
         return "baixo, cima," + socofraco;
     }

    public String getEspecial() {
        return especial;
    }

    public void setEspecial(String especial) {
        this.especial = especial;
    }
     public String spear(){
         return "esquerda, esquerda,"+ socofraco;
     }
     public String teleporte(){
         return "esquerda, direita,"+socoforte;
     }
    
    public String combo1(){
        return "cima,"+socofraco + socoforte + socoforte;
    }
    public String combo2(){
        return "direita"+chutefraco + chuteforte +chuteforte;
    }
    public String fatality1(){
        return defesa + defesa + agarrar;
    }
    public String fatality2(){
        return agarrar + "cima" + chuteforte;
    }
    private String ult(){
        return "cima, direita,"+ chutefraco + especial;
    }
  
    public Scorpion(){
        this.agarrar = null;
        this.chuteforte = null;
        this.chutefraco = null;
        this.socofraco = null;
        this.socoforte = null;
        this.defesa = null;
        this.especial = null;
        this.vida = 100;
    }
}
