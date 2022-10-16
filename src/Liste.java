import java.util.ArrayList;

public class Liste {

    private  ArrayList<Object> liste;
    private int position;

    public Liste() {
        this.liste = new ArrayList<>();
        this.position = 0;
    }


    public void dernier() {
        this.position = liste.size() - 1;
    }

    public void premier() {
        this.position = 0;
    }


    public void ajouter(Object element) {
        liste.add(element);
    }


    public Object supprimer() {
        if (!liste.isEmpty()) {
            Object element = liste.get(this.position);
            liste.remove(this.position);
            return element;
        }else{
            System.out.println("La liste est vide");
            return null;
        }
    }

    public Object suivant() {
        if (this.position < liste.size() - 1) {
            Object element = liste.get(this.position);
            this.position++;
            return element;
        } else {
            System.out.println("Vous etes a la fin de la liste");
            return null;
        }
    }
    public void displayAll(){
        for (Object element : liste) {
            System.out.println(element);
        }
    }
}
