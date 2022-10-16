import java.util.ArrayList;

// author : Justin DE SIO, Messilva Mazari
public class Main {
    public static void main(String[] args) {
        Pile P1 = new Pile("Pile 1");
        Pile P2 = new Pile("Pile 2");
        Pile P3 = new Pile("Pile 3");
        final int n = 5;

        // remplir P1 avec n valeur aléatoire distinct entre 0 et 9 et décroissant
        ArrayList<Integer> listeTemp = new ArrayList<>();
          for (int i = 0; i < n; i++) {
                int val = (int) (Math.random() * 10);
                while (listeTemp.contains(val)) {
                    val = (int) (Math.random() * 10);
                }
                listeTemp.add(val);
            }
          listeTemp.sort((o1, o2) -> o2 - o1);
        // remplir la pile avec les valeurs de la liste
        for (int i = 0; i < n; i++) {
            P1.empiler(listeTemp.get(i));

        }

        P1.display();

        // remplir la pile 2 si la valeur est paire et la pile 3 si la valeur est impaire
        for (int i = 0; i < n; i++) {
            int val = (int) P1.depiler();
            if (val % 2 == 0) {
                P2.empiler(val);
            } else {
                P3.empiler(val);
            }
        }

        P2.display();
        P3.display();
        //resolution du probleme
        resolutionGenerale(n,P1,P2,P3);
        P1.display();






    }

    private static void resolutionGenerale(int n, Pile D, Pile I, Pile A) {
        if (n == 1) {
            A.empiler(D.depiler());
        } else {
            resolutionGenerale(n - 1, D, A, I);
            A.empiler(D.depiler());
            resolutionGenerale(n - 1, I, D, A);
        }
    }

}
