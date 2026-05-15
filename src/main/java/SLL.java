// Rohan Nicollo M. Teope
// Sean Gabriel DR. Bolalin
// Course: ICS 2605
// Section: 1CSD
// Lab Exercise 4

public class SLL<T> {
    private SLLNode<T> head, tail;
    
    public SLL () {
        head = tail = null;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public String toString() {
        String result  = "";
        for (SLLNode<T> i = head; i != null; i = i.next) {  
            result += i.toString() + " ";
        }
        return result;
    }
    
    public int size() {
        int cnt = 0;
        SLLNode<T> n = head;
        while (n != null) {
            cnt++;
            n = n.next;
        }
        return cnt;
    }

    public SLLNode<T> find(T info) { 
        for (SLLNode<T> i = head; i != null; i = i.next) {  
            if (info.equals(i.info)) {
                return i;
            }
        }
        return null;
    }

    public void addToHead(T info) {
        if (isEmpty()) {
            head = tail = new SLLNode<>(info);
        }
        else {
            head = new SLLNode<>(info, head);
        }
    }

    public void addToTail(T info) {
        if (isEmpty()) {
            head = tail = new SLLNode<>(info);
        }
        else {
            tail.next = new SLLNode<>(info);
            tail = tail.next;
        }
    }

    public T deleteFromHead() {
        if (isEmpty()) {
            return null;
        }
        SLLNode<T> nodeToBeDeleted = head;
        if (head == tail) {
            head = tail = null;
        }
        else {
            head = head.next;
        }
        return nodeToBeDeleted.info;
    }

    public T deleteFromTail() {
        if (isEmpty()) {
            return null;
        }
        SLLNode<T> nodeToBeDeleted = tail;
        if (head == tail) {
            head = tail = null;
        }
        else {
            SLLNode<T> i = head;
            while (i.next != tail) {
                i = i.next;
            }
            tail = i;
            i.next = null;
        }
        return nodeToBeDeleted.info;
    }

    public T delete(T info) { 
        if (isEmpty()) {
            return null;
        }
        if (info.equals(head.info)) {
            return deleteFromHead();
        }
        else if (info.equals(tail.info)) {
            return deleteFromTail();
        }
        SLLNode<T> prev = head;
        SLLNode<T> curr = head.next;
        while (curr != null && !info.equals(curr.info)) {
            prev = curr;
            curr = curr.next;
        }
        if (curr == null) {
            return null;
        }
        prev.next = curr.next;
        return curr.info;
    }
    
    public void insertDesc(T info) {
        if (isEmpty() || ((Comparable)info).compareTo(head.info) >= 0) {
            addToHead(info);
            return;
        }
        else if (((Comparable)info).compareTo(tail.info) <= 0) {
            addToTail(info);
            return;
        }
        SLLNode<T> curr = head;
        SLLNode<T> next = head.next;
        while (curr != null && ((Comparable)info).compareTo(next.info) < 0) {
            curr = next;
            next = next.next;
        }
        SLLNode<T> node = new SLLNode(info, next);
        curr.next = node;
    }
    
    public void tailAdd(SLL<T> resultList, SLLNode<T> ptr) {
        if ( resultList.tail == null || ((Comparable)resultList.tail.info).compareTo(ptr.info) != 0) {
            resultList.addToTail(ptr.info);
        }
    }
    
    public SLL<T> mergeWithoutDups(SLL<T> list) {
        SLL<T> resultList = new SLL<>();
        SLLNode<T> ptr1 = this.head;
        SLLNode<T> ptr2 = list.head;
        while (ptr1 != null && ptr2 != null) {
            if (((Comparable)ptr1.info).compareTo(ptr2.info) > 0) {
                tailAdd(resultList, ptr1);
                ptr1 = ptr1.next;
            }
            else if (((Comparable)ptr1.info).compareTo(ptr2.info) < 0) {
                tailAdd(resultList, ptr2);
                ptr2 = ptr2.next;
            }
            else {
                tailAdd(resultList, ptr2);
                ptr2 = ptr2.next;
                ptr1 = ptr1.next;
            }
        }
        while (ptr1 != null) {
            tailAdd(resultList, ptr1);
            ptr1 = ptr1.next;
        }
        while (ptr2 != null) {
            tailAdd(resultList, ptr2);
            ptr2 = ptr2.next;
        }
        return resultList;
    }
}
