public class SLLMain09 {
    public static void main(String[] args) {
        SingleLinkedList09 sll = new SingleLinkedList09();

        Mahasiswa09 mhs1 = new Mahasiswa09("22304001", "Andi", "TI-1A", 3.6);
        Mahasiswa09 mhs2 = new Mahasiswa09("22304002", "Budi", "TI-1B", 3.4);
        Mahasiswa09 mhs3 = new Mahasiswa09("22304003", "Citra", "TI-1C", 3.8);
        Mahasiswa09 mhs4 = new Mahasiswa09("22304004", "Dina", "TI-1D", 3.2);

        sll.print(); // Linked List Kosong

        sll.addFirst(mhs1);
        sll.print();

        sll.addLast(mhs2);
        sll.print();

        sll.insertAfter("Citra", mhs3);

        sll.insertAt(2, mhs4);
        sll.print();

        

    }
}
