/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package etag;

/**
 *
 * @author brusg
 */
public class ParVertice {
 
    private String Va;
    private String Vb;
    private int geodesica;

    public ParVertice(String Va, String Vb, int geodesica) {
        this.Va = Va;
        this.Vb = Vb;
        this.geodesica = geodesica;
    }

    public String getVa() {
        return Va;
    }

    public void setVa(String Va) {
        this.Va = Va;
    }

    public String getVb() {
        return Vb;
    }

    public void setVb(String Vb) {
        this.Vb = Vb;
    }

    public int getGeodesica() {
        return geodesica;
    }

    public void setGeodesica(int geodesica) {
        this.geodesica = geodesica;
    }
    
}
