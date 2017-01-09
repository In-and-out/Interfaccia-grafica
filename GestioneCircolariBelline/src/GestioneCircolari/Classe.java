/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GestioneCircolari;

/**
 *
 * @author enrico
 */
public class Classe {
    private int annoClasse;
    private char sezone;
    private String articolazione;

    public int getAnnoClasse() {
        return annoClasse;
    }
    public void setAnnoClasse(int annoClasse) {
        this.annoClasse = annoClasse;
    }
    public char getSezone() {
        return sezone;
    }
    public void setSezone(char sezone) {
        this.sezone = sezone;
    }
    public String getArticolazione() {
        return articolazione;
    }
    public void setArticolazione(String articolazione) {
        this.articolazione = articolazione;
    }
    
    public Classe(){
        this.setAnnoClasse(0);
        this.setArticolazione("");
        this.setSezone(' ');
    }
    public Classe(int classe, String articolazione, char sezione){
        this.setAnnoClasse(classe);
        this.setArticolazione(articolazione);
        this.setSezone(sezione);
    }
    
    public boolean equals(Classe clas){
        if(this.getAnnoClasse()==clas.getAnnoClasse()&&this.getSezone()==clas.getSezone()&&this.getArticolazione().equals(clas.getArticolazione()))
            return true;
        return false;
    }
    
}
