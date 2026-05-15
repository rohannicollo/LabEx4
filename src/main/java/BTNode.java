// Rohan Nicollo M. Teope, Sean Gabriel DR. Bolalin
// Course: ICS 2605
// Section: 1CSD
// Lab Exercise 4

public class BTNode<T> {
    
    public T info;
    public int level;
    public BTNode<T> left;
    public BTNode<T> right;
    
    public BTNode() {
        this.info = null;
        left = null;
        right = null; 
    }
    
    public BTNode(T info) {
        this.info = info;
        left = null;
        right = null;
    }
    
    public String toString() {
        
        if (info == null) {
            return "";
        }
        
        String result = "[K=" + info.toString();
        
        if (left != null) {
            result += " L=" + left.toString();
        }
        
        if (right != null) {
            result += " R=" + right.toString();
        }
        
        result += "]";
        
        return result;
        
    }
}
