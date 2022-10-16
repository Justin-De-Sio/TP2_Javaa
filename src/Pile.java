public class Pile {

    protected Liste maListe;
    protected String PileName;

    public Pile(String PileName) {
        this.maListe = new Liste();
        this.PileName = PileName;

    }

    public void empiler(Object element) {
        maListe.dernier();
        maListe.ajouter(element);
        System.out.println("Empiler " + element + " dans " + this.PileName);
    }

    public Object depiler() {
        maListe.dernier();
        Object element = maListe.supprimer();
        System.out.println("Depiler " + element + " dans " + this.PileName);
        return element;
    }
    void displayAll(){
        System.out.println("Affichage de la pile " + this.PileName);
        maListe.displayAll();
    }



}