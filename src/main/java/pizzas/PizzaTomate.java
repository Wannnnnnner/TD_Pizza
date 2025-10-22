package pizzas;

import javafx.scene.layout.StackPane;

public class PizzaTomate implements Pizza {
    public double prix;
    public String nomIm;
    public String description;

    public PizzaTomate(){
        this.prix = 6.50;
        this.nomIm = "Pizza Base Tomate";
        this.description = "Une base de pizza avec de la tomate";
    }

    public MyImage getPizzaIm(){
        return new MyImage(nomIm,new StackPane());// FAUX JE SAIS PAS D'OU DOIT VENIR LE STACKPANE
    }

    @Override
    public double cout() {
        return this.prix;
    }

    @Override
    public String getDescription() {
        return this.description;
    }
}
