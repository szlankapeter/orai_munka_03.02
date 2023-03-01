package tombbel;

import java.util.Random;

public class DobasKettoKockaval {

    private static Random rnd = new Random();
    
    public static void main(String[] args) {
        /* 1 lehetséges kimenet 5 dobá esetén */
//        System.out.println(" 5 ****** (2 db)");
//        System.out.println("11 *** (1 db)");
//        System.out.println("12 ****** (2 db)");
        
        int[] dobasok = kettoKockavalDob(5);
        statisztika(dobasok);
    }

    private static int[] kettoKockavalDob(int db) {
        int[] dobasok = new int[13];
        for (int i = 0; i < db; i++) {
            int dobas = rnd.nextInt(2,13);
            dobasok[dobas]++; //dobasok[dobas] = dobasok[dobas] + 1;
        }
        return dobasok;

    }

    private static void statisztika(int[] adatok) {
        for (int i = 0; i < adatok.length; i++) {
            System.out.print(i + " "); //index
            System.out.println("arányos csillagok...");
        }
    }
    
}
