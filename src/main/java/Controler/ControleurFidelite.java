package Controler;

import Modele.ModeleCommande;
import javafx.event.Event;
import javafx.event.EventHandler;

public class ControleurFidelite implements EventHandler {
    private ModeleCommande mod;
    public ControleurFidelite(ModeleCommande mod) {
        this.mod = mod;
    }

    @Override
    public void handle(Event event) {

    }
}
