// author : Justin DE SIO, Messilva Mazari
public class Main {
    public static void main(String[] args) {
        Hanoi h = new Hanoi();
        h.saisir();
        h.remplir();
        PileEntiers t1 = h.getPileEntiers(1);
        //t1.Depiler();
        //t1.afficherPE();
        PileEntiers t2 = h.getPileEntiers(2);
        //t2.afficherPE();
        PileEntiers t3 = h.getPileEntiers(3);
        //t3.afficherPE();
        int n = h.getNombre();
        System.out.println("Avant le début du jeu");
        t1.display();
        t2.display();
        t3.display();
        System.out.println("");
        h.jeu(n,t1, t3, t2);
        System.out.println("Après la fin du jeu");
        t1.display();
        t2.display();
        t3.display();
    }

    }

