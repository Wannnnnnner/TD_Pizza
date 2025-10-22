package Controler;

import Modele.ModeleCommande;
import javafx.event.Event;
import javafx.event.EventHandler;

public class ControlPizzaCour extends EventHandler {
    private ModeleCommande mod;
    public ControlPizzaCour(ModeleCommande mod) {
        this.mod = mod;
    }

    @Override
    public void handle(Event event) {

    }
}
