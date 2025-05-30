public class SingleLinkedList09 {
    
    NodeMahasiswa09 head, tail;

    public boolean isEmpty() {
        return head == null;
    }

    public void print() {
        if (isEmpty()) {
            System.out.println("Linked list kosong");
        } else {
            NodeMahasiswa09 temp = head;
            System.out.println("Isi Linked List:");
            while (temp != null) {
                temp.data.tampilInformasi();
                temp = temp.next;
            }
        }
        System.out.println();
    }

    public void addFirst(Mahasiswa09 input) {
        NodeMahasiswa09 ndInput = new NodeMahasiswa09(input, null);
        if (isEmpty()) {
            head = tail = ndInput;
        } else {
            ndInput.next = head;
            head = ndInput;
        }
    }

    public void addLast(Mahasiswa09 input) {
        NodeMahasiswa09 ndInput = new NodeMahasiswa09(input, null);
        if (isEmpty()) {
            head = tail = ndInput;
        } else {
            tail.next = ndInput;
            tail = ndInput;
        }
    }

    public void insertAfter(String key, Mahasiswa09 input) {
        NodeMahasiswa09 temp = head;
        while (temp != null) {
            if (temp.data.nama.equalsIgnoreCase(key)) {
                NodeMahasiswa09 ndInput = new NodeMahasiswa09(input, temp.next);
                temp.next = ndInput;
                if (ndInput.next == null) {
                    tail = ndInput;
                }
                break;
            }
            temp = temp.next;
        }
    }

    public void insertAt(int index, Mahasiswa09 input) {
        if (index < 0) {
            System.out.println("Indeks salah");
        } else if (index == 0) {
            addFirst(input);
        } else {
            NodeMahasiswa09 temp = head;
            for (int i = 0; i < index - 1; i++) {
                if (temp != null) temp = temp.next;
            }
            if (temp != null) {
                temp.next = new NodeMahasiswa09(input, temp.next);
                if (temp.next.next == null) {
                    tail = temp.next;
                }
            }
        }
    }

    public void getData(int index){
        NodeMahasiswa09 temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        temp.data.tampilInformasi();
    }

    public int indexOf(String key){
        NodeMahasiswa09 temp = head;
        int index = 0;
        while (temp != null && !temp.data.nama.equalsIgnoreCase(key)) {
            temp = temp.next;
            index++;
        }

        if (temp == null) {
            return -1; // Not found
        } else {
            return index; // Found at index
        }
    }

    public void removeFirst() {
        if (isEmpty()) {
            System.out.println("Linked list kosong, tidak dapat dihapus!");
        } else if (head == tail) {
            head = tail = null;
        } else {
            head = head.next;
        }
    }

    public void removeLast(){
        if (isEmpty()) {
            System.out.println("Linked list kosong, tidak dapat dihapus!");
        } else if (head == tail) {
            // Jika hanya 1 elemen
            head = tail = null;
        } else {
            NodeMahasiswa09 temp = head;
            while (temp.next != null && temp.next != tail) {
                temp = temp.next;
            }
            temp.next = null;
            tail = temp;
        }
    }

    public void remove(String key) {
        if (isEmpty()) {
            System.out.println("Linked list kosong, tidak dapat dihapus!");
        } else {
            NodeMahasiswa09 temp = head;
            while (temp != null) {
                if ((temp.data.nama.equalsIgnoreCase(key)) && (temp == head)) {
                    this.removeFirst();
                    break;
                } else if (temp.data.nama.equalsIgnoreCase(key)) {
                    temp.next = temp.next.next;
                    if (temp.next == null) {
                        tail = temp; // Update tail if last node is removed
                    }
                    break;
                }
                temp = temp.next;
            }
        }
    }

    public void removeAt(int index){
        if (index == 0) {
            removeFirst();
        } else {
            NodeMahasiswa09 temp = head;
            for (int i = 0; i < index -1; i++){
                temp = temp.next;
            }
            temp.next = temp.next.next;
        }
    }
}
