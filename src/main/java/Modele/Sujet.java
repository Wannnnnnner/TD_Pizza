package Modele;

public interface Sujet {
    public void enregistrerObservateur(Observateur);

    public void supprimerObservateur(Observateur);

    public void notifierObservateurs();
}
