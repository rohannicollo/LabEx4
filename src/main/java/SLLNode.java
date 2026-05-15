// Rohan Nicollo M. Teope
// Sean Gabriel DR. Bolalin
// Course: ICS 2605
// Section: 1CSD
// Lab Exercise 4

public class SLLNode<T> {
    public T info;
    public SLLNode<T> next;
    
    public SLLNode(T info) {
        this.info = info;
        next = null;
    }
    
    public SLLNode (T info, SLLNode<T> next) {
        this.info = info;
        this.next = next;
    }
    
    public String toString() {
        return info == null ? "null" : info.toString();
    }
}
