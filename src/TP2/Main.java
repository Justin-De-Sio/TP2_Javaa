package TP2;

import TP2.jeu.PileEntiers;

public class Main {
    public static void main(String[] args) {
        PileEntiers P1 = new PileEntiers("Pile 1");
        PileEntiers P2 = new PileEntiers("Pile 2");
        PileEntiers P3 = new PileEntiers("Pile 3");

        int n = 5;

        P1.display();
        P2.display();
        P3.display();
        for (int i = n; i > 0; i--) {
            int rNumber = (int) (Math.random() * 10);
            P1.empiler(rNumber);
            if (rNumber % 2 == 0) {
                P2.empiler(rNumber);
            } else {
                P3.empiler(rNumber);
            }
        }
        P1.display();
        P2.display();
        P3.display();


    }
    }

