/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassesMetier;

import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 *
 * @author jacqu
 */
public class Trader
{
    // A vous de jouer
    
    private int idTrader;
    private String nomTrader;
    private ArrayList<Action> lesActionsAchetes;

    public Trader(int unId, String unNom)
    {
        this.idTrader=unId;
        this.nomTrader=unNom;
        lesActionsAchetes=new ArrayList<Action>();
    }
    
    /**
     * @return the idTrader
     */
    public int getIdTrader() {
        return idTrader;
    }

    /**
     * @param idTrader the idTrader to set
     */
    public void setIdTrader(int idTrader) {
        this.idTrader = idTrader;
    }

    /**
     * @return the nomTrader
     */
    public String getNomTrader() {
        return nomTrader;
    }

    /**
     * @param nomTrader the nomTrader to set
     */
    public void setNomTrader(String nomTrader) {
        this.nomTrader = nomTrader;
    }

    /**
     * @return the lesActionsAchetes
     */
    public ArrayList<Action> getLesActionsAchetes() {
        return lesActionsAchetes;
    }

    /**
     * @param lesActionsAchetes the lesActionsAchetes to set
     */
    public void setLesActionsAchetes(ArrayList<Action> lesActionsAchetes) {
        this.lesActionsAchetes = lesActionsAchetes;
    }
}
