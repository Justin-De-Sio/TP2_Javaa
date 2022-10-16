import java.util.Scanner;

public class Hanoi {

    private int nombre = 0;
    private PileEntiers tour1;
    private PileEntiers tour2;
    private PileEntiers tour3;

    public Hanoi() {
        tour1 = new PileEntiers("Tour 1");
        tour2 = new PileEntiers("Tour 2");
        tour3 = new PileEntiers("Tour 3");
    }

    public void saisir() {
        Scanner in = null;
        in = new Scanner(System.in);
        System.out.print("Saisir le nombre de diqsues : ");
        nombre = in.nextInt();
        while (nombre <= 0) {
            System.out.print("Erreur lore de la saisie du nombre, le nombre doit être strictement positif ! Veuillez réessayer : ");
            nombre = in.nextInt();
        }
        System.out.println(nombre);
        return;
    }

    public void remplir() {
        int n = nombre;
        while (n >= 0) {
            tour1.empiler(n);
            n--;
        }
        tour1.display();
        System.out.println("");
        return;
    }

    public PileEntiers getPileEntiers(int n){
        switch (n) {
            case 1:
                return tour1;
            case 2:
                return tour2;
            case 3:
                return tour3;
        }
        return null;
    }

    public int getNombre(){
        return nombre;
    }

    public void deplacer(PileEntiers src, PileEntiers dst){
        int n = src.depiler();
        Integer i = Integer.valueOf(n);
        dst.empiler(i);
    }

    public void jeu(int n, PileEntiers tour1, PileEntiers  tour3, PileEntiers  tour2) {




        if(n == -1){
            //System.out.println("Tour 1 vide");
            return ;
        }

        else {
            this.jeu(n-1, tour1, tour2, tour3);

            //System.out.println("Bougez le disque " + n + " de " + tour1 + " à " + tour3);

            deplacer(tour1, tour3);
            this.jeu(n-1, tour2, tour3, tour1);

        }


        return;
    }
}