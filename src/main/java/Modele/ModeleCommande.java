package Modele;

import Fidelite.*;
import Observateur.*;
import Pizza.*;

import javafx.beans.Observable;

import java.util.ArrayList;

public class ModeleCommande implements Sujet{
    private int nbPizza;
    private ArrayList<Pizza> listPizza;
    private int numPizzaCourante;
    private double prixCommande;
    private ArrayList<Observateur> observateurs;
    private StrategyFidelite taux;

    public ModeleCommande() {
        this.nbPizza = 0;
        this.listPizza = new ArrayList<>();
        this.numPizzaCourante = 0;
        this.prixCommande = 0;
        this.observateurs = new ArrayList<>();
    }

    public void ajouterPizza(String naturePizza){
        if(this.nbPizza != 4) {
            this.nbPizza++;
            switch (naturePizza) {
                case "Creme":
                    this.listPizza.add(new PizzaCreme());
                    break;
                case "Tomate":
                    this.listPizza.add(new PizzaTomate());
                    break;
            }
            this.numPizzaCourante++;
            calculPrixCommande();
        }
    }

    public void calculPrixCommande(){
        this.prixCommande = 0;
        for(Pizza p : this.listPizza){
            this.prixCommande += p.cout();
        }
    }

    public int getNbPizza() {
        return nbPizza;
    }

    public double getPrixCommande() {
        return prixCommande;
    }

    public ArrayList<Pizza> getListPizza() {
        return listPizza;
    }

    public int getNumPizzaCourante() {
        return numPizzaCourante;
    }

    public void setNumPizzaCourante(int numPizzaCourante) {
        this.numPizzaCourante = numPizzaCourante;
    }

    public void setFidelite(StrategyFidelite fidelite){
        this.taux = fidelite;
    }

    public void enregistrerObservateur(Observateur e){
        this.observateurs.add(e);
    }

    public void supprimerObservateur(Observateur e){
        this.observateurs.remove(e);
    }

    public void notifierObservateurs(){
        for(Observateur e : this.observateurs){
            e.actualiser(this);
        }
    }
}
