import java.util.Scanner;
class Catur{
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Masukkan kordinat spawn: ");
        Benteng pionBenteng = new Benteng(sc.nextInt(), sc.nextInt());
        Papan.tampilkanPapan(pionBenteng);
        while (true) {
            System.out.println("1. Maju");
            System.out.println("2. Mundur");
            System.out.println("3. Ke Kanan");
            System.out.println("4. Ke Kiri");
            System.out.println("5. Ganti warna");
            System.out.println("6. Exit");
            System.out.print("Pilih menu: ");
            pilihMenu(sc.nextInt(), pionBenteng);
            System.out.println("Posisi : "+pionBenteng.getPosX()+", "+pionBenteng.getPosY());
        }
    }
    static void pilihMenu(int pilihan, Benteng pionBenteng) {
        if(pilihan == 1){
            System.out.print("Maju berapa langkah? : ");
            pionBenteng.maju(sc.nextInt());
        }
        if(pilihan == 2){
            System.out.print("Mundur berapa langkah? : ");
            pionBenteng.mundur(sc.nextInt());
        }
        if (pilihan == 3) {
            System.out.print("Ke kanan berapa langkah? : ");
            pionBenteng.kanan(sc.nextInt());
        }
        if (pilihan == 4) {
            System.out.print("Ke kiri berapa langkah? : ");
            pionBenteng.kiri(sc.nextInt());
        }
        if (pilihan == 5) {
            System.out.print("Masukkan warna baru : ");
            pionBenteng.setWarna(sc.next());
        }
        if (pilihan == 6) {
            System.out.println("Bye");
            System.exit(0);
        } else {
            System.out.println("Pilih salah satu dari menu berikut:");
        }
        if (pilihan > 0 && pilihan < 7) {
            Papan.tampilkanPapan(pionBenteng);
        }
    }
}
class Papan{
    // static private int[][] papan = new int[8][8];
    static void tampilkanPapan(Benteng pionBenteng) {
        for (int i = 7; i >= 0; i--) {
            for (int j = 0; j < 8; j++) {
                System.out.print('|');
                if (j == pionBenteng.getPosX()-1 && i == pionBenteng.getPosY()-1) {
                    System.out.print(pionBenteng.getPion());
                } else if (i%2 != 0) {
                    if (j%2 == 0) {
                        System.out.print(' ');
                    } else {
                        System.out.print('#');
                    }
                } else {
                    if (j%2 == 0) {
                        System.out.print('#');
                    } else {
                        System.out.print(' ');
                    }
                }
            }
            System.out.println('|');
        }
    }
}