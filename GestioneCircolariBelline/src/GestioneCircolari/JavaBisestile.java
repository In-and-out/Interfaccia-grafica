/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GestioneCircolari;

/**@author Matteo Gagliardi && Francesco Caleffi
 */
public class JavaBisestile {

    /**
 *
 * @auth
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
    /**
     * Verifica che l'anno sia bisestile
     * @param i
     * @return 
     */
    static boolean isBisestile(int i) {
        if((i % 4 == 0 && i % 100 != 0) || (i%100==0 && i % 400 == 0) ) //se l'anno è secolare e divisibile per 400, oppure non secolare e divisibile per 4
        {
            return true;     //ritorna true
        }
        if((i<=1500 && i%100==0)){   //se l'anno è precedente o uguale al 1500, ed è divisibile per 100
            return true;   //ritorna true
        }
        return false;  //altrimenti ritorna false
    }

    
}
