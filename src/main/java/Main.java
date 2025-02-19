public class Main {
    public static void main(String[] args) {
        Pile maPile = new Pile(10);
        if (!maPile.est_vide()) System.out.println("NOK");

        maPile.empiler(5);
        if (maPile.est_vide()) System.out.println("NOK");

        int element = maPile.depiler();
        if (!maPile.est_vide()) System.out.println("NOK");
        if (element != 5) System.out.println("NOK");


        maPile.empiler(1);
        maPile.empiler(2);
        maPile.empiler(3);
        if (maPile.est_vide()) System.out.println("NOK");

        element = maPile.depiler();
        if (element != 3) System.out.println("NOK");

        element = maPile.depiler();
        if (element != 2) System.out.println("NOK");

        element = maPile.depiler();
        if (element != 1) System.out.println("NOK");

        if (!maPile.est_vide()) System.out.println("NOK");

        // Test de la pile pleine
        for (int i = 0; i < 10; i++) {
            maPile.empiler(i);
        }
        if (!maPile.est_plein()) System.out.println("NOK");

        // Dépiler tous les éléments
        for (int i = 9; i >= 0; i--) {
            element = maPile.depiler();
            if (element != i) System.out.println("NOK");
        }
        if (!maPile.est_vide()) System.out.println("NOK");

        System.out.println("Fin");
    }
}