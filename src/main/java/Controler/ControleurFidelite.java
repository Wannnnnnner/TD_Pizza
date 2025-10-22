package Controler;

import javafx.event.Event;
import javafx.event.EventHandler;

public class ControleurFidelite extends EventHandler {
    private ModelCommande mod;
    public ControleurFidelite(ModeleCommande mod) {
        this.mod = mod;
    }

    @Override
    public void handle(Event event) {

    }
}
