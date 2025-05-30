public class SingleLinkedList09 {
    NodeMahasiswa09 head, tail;

    public boolean isEmpty() {
        return head == null;
    }

    public void print() {
        if (isEmpty()) {
            System.out.println("Linked List Kosong");
        } else {
            NodeMahasiswa09 temp = head;
            while (temp != null) {
                temp.data.tampilInformasi();
                System.out.println("-------------------");
                temp = temp.next;
            }
        }
    }

    public void addFirst(Mahasiswa09 input) {
        NodeMahasiswa09 ndInput = new NodeMahasiswa09(input);
        if (isEmpty()) {
            head = tail = ndInput;
        } else {
            ndInput.next = head;
            head = ndInput;
        }
    }

    public void addLast(Mahasiswa09 input) {
        NodeMahasiswa09 ndInput = new NodeMahasiswa09(input);
        if (isEmpty()) {
            head = tail = ndInput;
        } else {
            tail.next = ndInput;
            tail = ndInput;
        }
    }

    public void insertAfter(String key, Mahasiswa09 input) {
        NodeMahasiswa09 temp = head;
        while (temp != null && !temp.data.nim.equals(key)) {
            temp = temp.next;
        }
        if (temp != null) {
            NodeMahasiswa09 ndInput = new NodeMahasiswa09(input);
            ndInput.next = temp.next;
            temp.next = ndInput;
            if (ndInput.next == null) {
                tail = ndInput;
            }
        }
    }

    public void insertAt(int index, Mahasiswa09 input) {
        if (index == 0) {
            addFirst(input);
        } else {
            NodeMahasiswa09 temp = head;
            for (int i = 0; i < index - 1 && temp != null; i++) {
                temp = temp.next;
            }
            if (temp != null) {
                NodeMahasiswa09 ndInput = new NodeMahasiswa09(input);
                ndInput.next = temp.next;
                temp.next = ndInput;
                if (ndInput.next == null) {
                    tail = ndInput;
                }
            }
        }
    }

    public Mahasiswa09 getData(int index) {
        NodeMahasiswa09 temp = head;
        for (int i = 0; i < index && temp != null; i++) {
            temp = temp.next;
        }
        return (temp != null) ? temp.data : null;
    }

    public int indexOf(String nim) {
        NodeMahasiswa09 temp = head;
        int index = 0;
        while (temp != null) {
            if (temp.data.nim.equals(nim)) {
                return index;
            }
            temp = temp.next;
            index++;
        }
        return -1;
    }

    public void removeFirst() {
        if (!isEmpty()) {
            head = head.next;
            if (head == null) tail = null;
        }
    }

    public void removeLast() {
        if (!isEmpty()) {
            if (head == tail) {
                head = tail = null;
            } else {
                NodeMahasiswa09 temp = head;
                while (temp.next != tail) {
                    temp = temp.next;
                }
                temp.next = null;
                tail = temp;
            }
        }
    }

    public void remove(int index) {
        if (index == 0) {
            removeFirst();
        } else {
            NodeMahasiswa09 temp = head;
            for (int i = 0; i < index - 1 && temp != null; i++) {
                temp = temp.next;
            }
            if (temp != null && temp.next != null) {
                temp.next = temp.next.next;
                if (temp.next == null) {
                    tail = temp;
                }
            }
        }
    }
}
