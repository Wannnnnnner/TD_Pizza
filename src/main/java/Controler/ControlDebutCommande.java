package Controler;

import javafx.event.Event;
import javafx.event.EventHandler;

public class ControlDebutCommande extends EventHandler {
    private ModelCommande mod;
    public ControlDebutCommande(ModeleCommande mod) {
        this.mod = mod;
    }

    @Override
    public void handle(Event event) {

    }
}
