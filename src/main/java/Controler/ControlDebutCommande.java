package Controler;

import Modele.ModeleCommande;
import javafx.event.Event;
import javafx.event.EventHandler;

public class ControlDebutCommande implements EventHandler {
    private ModeleCommande mod;
    public ControlDebutCommande(ModeleCommande mod) {
        this.mod = mod;
    }

    @Override
    public void handle(Event event) {

    }
}
