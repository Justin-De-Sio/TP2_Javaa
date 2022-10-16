// author : Justin DE SIO, Messilva Mazari
public class Main {
    public static void main(String[] args) {
        Pile P1 = new Pile("Pile 1");
        Pile P2 = new Pile("Pile 2");
        Pile P3 = new Pile("Pile 3");
        for (int i = 0; i < 5; i++) {
            Integer element = (int) (Math.random() * 10);
            P1.empiler(element);
            if (element % 2 == 0) {
                P2.empiler(element);
            } else {
                P3.empiler(element);
            }
        }
        P1.displayAll();
        P2.displayAll();
        P3.displayAll();
    }
}
