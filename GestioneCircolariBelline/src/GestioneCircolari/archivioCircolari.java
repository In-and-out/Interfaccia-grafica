/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GestioneCircolari;

import java.text.SimpleDateFormat;

/**
 *
 * @author Matteo Gagliardi
 */
public class archivioCircolari {
    private Circolare [] arrayCircolari;
    private int MAX_ARRAY;
    private int dim;

    public int getDim() {
        return dim;
    }

    public void setDim(int dim) {
        this.dim = dim;
    }
    
    
    public Circolare getCircolare(int i){
        return arrayCircolari[i];
    }
    
    public archivioCircolari (){
        MAX_ARRAY=10;
        arrayCircolari=new Circolare[MAX_ARRAY];
        dim=0;
    }
    public archivioCircolari (int dimensione){
        MAX_ARRAY=dimensione;
        arrayCircolari=new Circolare[MAX_ARRAY];
        dim=0;
    }
    
    public boolean aggiungiCircolare(Circolare circ){
        for(int i = 0; i< MAX_ARRAY;i++){
            if(arrayCircolari[i]==null){
                arrayCircolari[i]=new Circolare(circ);
                this.setDim(this.getDim()+1);
                return true;
            }
        }
        
        return false;
    }
    public Circolare[] ricercaCircolare(Data data){
        Circolare [] a;
        a = new Circolare[MAX_ARRAY];
        int j=0;
        for(int i=0;i<arrayCircolari.length-1;i++)
        {
            if(arrayCircolari[i].getData().equals(data))
                a[j++]=new Circolare(arrayCircolari[i]);   
        }
        return a;
    }
    public Circolare[] ricercaCircolare(char tipo){
        Circolare [] a;
        a = new Circolare[MAX_ARRAY];
        int j=0;
        for(int i=0;i<arrayCircolari.length-1;i++)
        {
            if(arrayCircolari[i].getTipo() == tipo)
                a[j++]=new Circolare(arrayCircolari[i]);   
        }
        return a;
    }
    public Circolare[] ricercaCircolare(Classe classe){
        Circolare [] a;
        a = new Circolare[MAX_ARRAY];
        int j=0;
        for(int i=0;i<arrayCircolari.length-1;i++)
        {
            if(arrayCircolari[i].getClasse().equals(classe))
                a[j++]=new Circolare(arrayCircolari[i]);   
        }
        return a;
    }
    public Circolare[] ricercaCircolare(Circolare circolare){
        Circolare[] a;
        a=new Circolare[MAX_ARRAY];
        int j=0;
        for(int i=0;i<arrayCircolari.length-1;i++)
        {
            if(arrayCircolari[i].equals(circolare))
                a[j++]=new Circolare(arrayCircolari[i]);                
        }
        return a;
    }
    public void eliminaCircolare(int i){
         arrayCircolari[i]=null;
    }
    
    public void modificaCircolare(int i,Classe clas, char tipo, Data data, String motivazione, String annotazioni, int numero){
        if(arrayCircolari[i]!=null){
             arrayCircolari[i].modificaCircolare(clas, tipo, data, motivazione, annotazioni, numero);
        }
       
    }
    
    public int getLenght(){
        return dim;
    }
    
    
}
