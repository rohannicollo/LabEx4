// Rohan Nicollo M. Teope, Sean Gabriel DR. Bolalin
// Course: ICS 2605
// Section: 1CSD
// Lab Exercise 4

import java.util.*;

public class BT<T> {
    
    public BTNode<T> root;
    public int height;
    
    public BT() {
        root = null;
        height = -1;
    }
    
    public void setRoot(BTNode<T> n) {
        root = n;
        height = 0;
    }
    
    public void computeLevels() {
        
        if (root != null) {
            
            Queue<BTNode<T>> que = new LinkedList<>();
            int level = 0;
            que.add(root);
            
            while (!que.isEmpty()) {
                
                int size = que.size();
                
                for (int i = 0; i < size; i++) {
                    
                    BTNode<T> n = que.remove();
                    n.level = level;
                    System.out.println("K=" + n.info + " level=" + n.level);
                    
                    if (n.left != null) {
                        que.add(n.left);
                    }
                    
                    if (n.right != null) {
                        que.add(n.right);
                    }
                    
                }
                
                level++;
                
            }
            
            height = level - 1;
            
        }
    }
    
    public String toString() {
        
        if (root == null) {
            return "ht=undefined (tree is empty.)";
        }
        
        return "ht=" + height + " " + root.toString();
        
    }
}
