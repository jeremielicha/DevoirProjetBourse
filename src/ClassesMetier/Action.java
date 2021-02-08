/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassesMetier;

/**
 *
 * @author jacqu
 */
public class Action
{
    // A vous de jouer
    private int idAction;
    private String nomAction;
    private double valeurActuelAction;
    private double prixAchatAction;
    private int quantiteAcheteAction;

    public Action(int unId, String unNom, double laValeurActuel, double lePrixAchat, int uneQuantiteAchete)
    {
        this.idAction=unId;
        this.nomAction=unNom;
        this.valeurActuelAction=laValeurActuel;
        this.prixAchatAction=lePrixAchat;
        this.quantiteAcheteAction=uneQuantiteAchete;
    }
    
    
    /**
     * @return the idAction
     */
    public int getIdAction() {
        return idAction;
    }

    /**
     * @param idAction the idAction to set
     */
    public void setIdAction(int idAction) {
        this.idAction = idAction;
    }

    /**
     * @return the nomAction
     */
    public String getNomAction() {
        return nomAction;
    }

    /**
     * @param nomAction the nomAction to set
     */
    public void setNomAction(String nomAction) {
        this.nomAction = nomAction;
    }

    /**
     * @return the valeurActuelAction
     */
    public double getValeurActuelAction() {
        return valeurActuelAction;
    }

    /**
     * @param valeurActuelAction the valeurActuelAction to set
     */
    public void setValeurActuelAction(double valeurActuelAction) {
        this.valeurActuelAction = valeurActuelAction;
    }

    /**
     * @return the prixAchatAction
     */
    public double getPrixAchatAction() {
        return prixAchatAction;
    }

    /**
     * @param prixAchatAction the prixAchatAction to set
     */
    public void setPrixAchatAction(double prixAchatAction) {
        this.prixAchatAction = prixAchatAction;
    }

    /**
     * @return the quantiteAcheteAction
     */
    public int getQuantiteAcheteAction() {
        return quantiteAcheteAction;
    }

    /**
     * @param quantiteAcheteAction the quantiteAcheteAction to set
     */
    public void setQuantiteAcheteAction(int quantiteAcheteAction) {
        this.quantiteAcheteAction = quantiteAcheteAction;
    }
}
