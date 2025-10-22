package Pizza;

import javafx.scene.layout.StackPane;
import JavaFX.MyImage;

public class PizzaCreme implements Pizza{
    public double prix;
    public String nomIm;
    public String description;

    public PizzaCreme(){
        this.prix = 6.00;
        this.nomIm = "Pizza Base Creme";
        this.description = "Une base de pizza avec de la crème";
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
