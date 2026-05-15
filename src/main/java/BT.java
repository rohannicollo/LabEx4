// Rohan Nicollo M. Teope, Sean Gabriel DR. Bolalin
// Course: ICS 2605
// Section: 1CSD
// Lab Exercise 4

import java.util.*;

public class BT<T extends Comparable<? super T>> {
    
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
    
    public int countLessPostorder(BTNode<T> n, T k) {
        
        if (n == null)
		{
            return 0;
        }

        int nodeCount = 0;
        
        int leftCount = countLessPostorder(n.left, k);
        int rightCount = countLessPostorder(n.right, k);
        
        if (n.info != null && n.info.compareTo(k) < 0)
		{
            nodeCount = 1;
        }
        
        return leftCount + rightCount + nodeCount;
        
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
        
        if (root == null)
        {
            return "ht=undefined (tree is empty.)";
        }
        
        return "ht=" + height + " " + root.toString();
        
    }
}
