/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GestioneCircolari;

/**
 *
 * @author Enrico Falco
 */
public class Data {
    private int gg;
    private int mm;
    private int yy;
    private int hh;

    public int getGg() {
        return gg;
    }
    public void setGg(int gg) {
        this.gg = gg;
    }
    public int getMm() {
        return mm;
    }
    public void setMm(int mm) {
        this.mm = mm;
    }
    public int getYy() {
        return yy;
    }
    public void setYy(int yy) {
        this.yy = yy;
    }
    public int getHh() {
        return hh;
    }
    public void setHh(int hh) {
        this.hh = hh;
    }
    public Data(int gg, int mm, int yy, int hh) {
        this.setGg(gg);
        this.setMm(mm);
        this.setYy(yy);
        this.setHh(hh);
    }
    public Data() {
        this.setGg(0);
        this.setMm(0);
        this.setYy(0);
        this.setHh(0);
    }
    public boolean equals(Data other) {
        if (this.getGg() != other.getGg()) {
            return false;
        }
        if (this.getMm() != other.getMm()) {
            return false;
        }
        if (this.getYy() != other.getYy()) {
            return false;
        }
        if (this.getHh() != other.getHh()) {
            return false;
        }
        return true;
    }
    
    
}
