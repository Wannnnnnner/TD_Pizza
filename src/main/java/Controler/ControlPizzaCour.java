package Controler;

import Modele.ModeleCommande;
import javafx.event.Event;
import javafx.event.EventHandler;

public class ControlPizzaCour implements EventHandler {
    private ModeleCommande mod;
    public ControlPizzaCour(ModeleCommande mod) {
        this.mod = mod;
    }

    @Override
    public void handle(Event event) {

    }
}
