/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GestioneCircolari;

/**
 *
 * @author f.caleffi
 */
public class FileException extends Exception{
    private String matter="";

    public String getTipo() {
        return matter;
    }

  
    public FileException(String matter){
        this.matter=matter;
    }
}
