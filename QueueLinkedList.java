public class QueueLinkedList {
    NodeTugas09 front, rear;
    int size = 0;
    final int MAX = 10; // batas maksimal antrian

    public boolean isEmpty() {
        return front == null;
    }

    public boolean isFull() {
        return size >= MAX;
    }

    public void enqueue(MahasiswaTugas09 mhs) {
        if (isFull()) {
            System.out.println("Antrian penuh!");
            return;
        }
        NodeTugas09 newNode = new NodeTugas09(mhs);
        if (isEmpty()) {
            front = rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
        size++;
        System.out.println("Mahasiswa " + mhs.nama + " telah ditambahkan ke antrian.");
    }

    public void dequeue() {
        if (isEmpty()) {
            System.out.println("Antrian kosong!");
            return;
        }
        System.out.println("Memanggil mahasiswa: " + front.data.nama);
        front = front.next;
        size--;
        if (front == null) rear = null;
    }

    public void peek() {
        if (isEmpty()) {
            System.out.println("Antrian kosong!");
        } else {
            System.out.println("Antrian terdepan: " + front.data);
        }
    }

    public void peekRear() {
        if (isEmpty()) {
            System.out.println("Antrian kosong!");
        } else {
            System.out.println("Antrian terakhir: " + rear.data);
        }
    }

    public void printQueue() {
        if (isEmpty()) {
            System.out.println("Antrian kosong!");
        } else {
            System.out.println("Daftar Mahasiswa Dalam Antrian:");
            NodeTugas09 current = front;
            int i = 1;
            while (current != null) {
                System.out.println(i++ + ". " + current.data);
                current = current.next;
            }
        }
    }

    public void clear() {
        front = rear = null;
        size = 0;
        System.out.println("Antrian telah dikosongkan.");
    }

    public int count() {
        return size;
    }
}
