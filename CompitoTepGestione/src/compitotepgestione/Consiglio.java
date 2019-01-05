/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compitotepgestione;

import java.util.Date;

/**
 *
 * @author thelo
 */
public class Consiglio {
    String classe;
    Date data;
    Date ora;
    String luogo;
    boolean soloDoccenti;

    
    public Consiglio(String classe, Date data, Date ora, String luogo, boolean soloDoccenti) {
        this.classe = classe;
        this.data = data;
        this.ora = ora;
        this.luogo = luogo;
        this.soloDoccenti = soloDoccenti;
    }

    public String getClasse() {
        return classe;
    }

    public void setClasse(String classe) {
        this.classe = classe;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public Date getOra() {
        return ora;
    }

    public void setOra(Date ora) {
        this.ora = ora;
    }

    public String getLuogo() {
        return luogo;
    }

    public void setLuogo(String luogo) {
        this.luogo = luogo;
    }

    public boolean isSoloDoccenti() {
        return soloDoccenti;
    }

    public void setSoloDoccenti(boolean soloDoccenti) {
        this.soloDoccenti = soloDoccenti;
    }

    @Override
    public String toString() {
        return "Consiglio{" + "classe=" + classe + ", data=" + data + ", ora=" + ora + ", luogo=" + luogo + ", soloDoccenti=" + soloDoccenti + '}';
    }
   
    
    
    
}
