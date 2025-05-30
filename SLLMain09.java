public class SLLMain09 {
    public static void main(String[] args) {
        SingleLinkedList09 sll = new SingleLinkedList09();

        // Tambahkan data sesuai gambar
        Mahasiswa09 mhs1 = new Mahasiswa09("22212202", "Cintia", "3C", 3.5);
        Mahasiswa09 mhs2 = new Mahasiswa09("23212201", "Bimon", "2B", 3.8);
        Mahasiswa09 mhs3 = new Mahasiswa09("24212200", "Alvaro", "1A", 4.0);

        sll.addLast(mhs1); // index 0
        sll.addLast(mhs2); // index 1
        sll.addLast(mhs3); // index 2

        System.out.println("data index 1 : ");
        sll.getData(1);

        System.out.println("data mahasiswa an Bimon berada pada index : " + sll.indexOf("Bimon"));
        System.out.println();

        sll.print();

        sll.removeFirst(); // hapus Cintia
        sll.removeLast();  // hapus Alvaro

        sll.print(); // sisa Bimon

        sll.removeAt(0); // hapus Bimon

        sll.print(); // kosong
    }
}