public class Main {
    public static void main(String[] args) {
        int x = 0;
        while (x < 4) {
            System.out.print("a");

            if (x < 1) {
                System.out.print(" ");
            }

            System.out.print("n");

            if (x > 1) {
                System.out.print(" oyster");
                x = x + 2;
            }
            if (x == 1) {
                System.out.print("noys");
            }

            if (x < 1) {
                System.out.print("oise");
            }
            System.out.println();
            x = x + 1;
        }

        Dog d = new Dog();
        d.size = 40;
        d.bark();
        System.out.println(d.size);

        Movie oneM = new Movie();
        oneM.title = "Gone with the Stock";
        oneM.genre = "Tragic";
        oneM.rating = -2;
        Movie twoM = new Movie();
        twoM.title = "Lost in Cubicle Space";
        twoM.genre = "Comedy";
        twoM.rating = 5;
        twoM.playIt();

        DrumKit k = new DrumKit();
        k.playSnare();
        k.snare = false;
        k.playTopHat();
        if(k.snare == true){
            k.playSnare();
        }

        Echo e1 = new Echo();
        Echo e2 = new Echo();
        int i = 0;
        while (i < 4) {
            e1.hello();
            e1.count = e1.count + 1;
            if ( i == 3) {
                e2.count = e2.count + 1;
            }
            if ( i > 0){
                e2.count = e2.count + e1.count;
            }
            i = i + 1;
        }
        System.out.println(e2.count);
    }
}