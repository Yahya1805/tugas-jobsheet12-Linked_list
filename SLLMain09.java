import java.util.Scanner;

public class SLLMain09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SingleLinkedList09 sll = new SingleLinkedList09();

        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumlah = sc.nextInt();
        sc.nextLine(); // Buang newline

        for (int i = 0; i < jumlah; i++) {
            System.out.println("Mahasiswa ke-" + (i + 1));
            System.out.print("NIM   : ");
            String nim = sc.nextLine();
            System.out.print("Nama  : ");
            String nama = sc.nextLine();
            System.out.print("Kelas : ");
            String kelas = sc.nextLine();
            System.out.print("IPK   : ");
            double ipk = sc.nextDouble();
            sc.nextLine(); // Buang newline

            Mahasiswa09 mhs = new Mahasiswa09(nim, nama, kelas, ipk);
            sll.addLast(mhs); // atau sll.addFirst(mhs);
        }

        System.out.println("\nIsi Linked List:");
        sll.print();

        sc.close();
    }
}