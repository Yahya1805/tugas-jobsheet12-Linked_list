import java.util.Scanner;

public class MainQueue09 {
    public static void main(String[] args) {
        QueueLinkedList queue = new QueueLinkedList();
        Scanner sc = new Scanner(System.in);

        int pilih;
        do {
            System.out.println("\n==== MENU LAYANAN KEMAHASISWAAN ====");
            System.out.println("1. Tambahkan Mahasiswa ke Antrian");
            System.out.println("2. Panggil Mahasiswa");
            System.out.println("3. Lihat Antrian Terdepan");
            System.out.println("4. Lihat Antrian Terakhir");
            System.out.println("5. Tampilkan Semua Antrian");
            System.out.println("6. Kosongkan Antrian");
            System.out.println("7. Cek Antrian Kosong");
            System.out.println("8. Cek Antrian Penuh");
            System.out.println("9. Jumlah Mahasiswa dalam Antrian");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            pilih = sc.nextInt(); sc.nextLine();

            switch (pilih) {
                case 1:
                    System.out.print("Masukkan NIM: ");
                    String nim = sc.nextLine();
                    System.out.print("Masukkan Nama: ");
                    String nama = sc.nextLine();
                    queue.enqueue(new MahasiswaTugas09(nim, nama));
                    break;
                case 2:
                    queue.dequeue();
                    break;
                case 3:
                    queue.peek();
                    break;
                case 4:
                    queue.peekRear();
                    break;
                case 5:
                    queue.printQueue();
                    break;
                case 6:
                    queue.clear();
                    break;
                case 7:
                    System.out.println(queue.isEmpty() ? "Antrian kosong." : "Antrian tidak kosong.");
                    break;
                case 8:
                    System.out.println(queue.isFull() ? "Antrian penuh." : "Antrian belum penuh.");
                    break;
                case 9:
                    System.out.println("Jumlah mahasiswa dalam antrian: " + queue.count());
                    break;
                case 0:
                    System.out.println("Keluar dari program...");
                    break;
                default:
                    System.out.println("Menu tidak tersedia.");
            }
        } while (pilih != 0);
    }
}
