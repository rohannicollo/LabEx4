// Rohan Nicollo M. Teope
// Sean 
// ICS2605
// 1CSD
// Lab Exercise 4

import java.util.Scanner;

public class LabEx4 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("""
                           Teope, Rohan Nicollo M.
                           Sean
                           """);
        
        System.out.print("Enter t: ");
        int t = sc.nextInt();
        sc.nextLine();
        
        switch (t) {
            
            case 1 -> {
                
                BT<Integer> t0 = new BT<>();
                BT<Integer> t1 = new BT<>();
                BT<Character> t2 = new BT<>();
                
                BTNode<Integer> btn2 = new BTNode<>(2);
                BTNode<Integer> btn4 = new BTNode<>(4);
                
                BTNode<Integer> btn1 = new BTNode<>(1);
                btn1.right = btn2;
                BTNode<Integer> btn5 = new BTNode<>(5);
                btn5.left = btn4;
                
                BTNode<Integer> btn3 = new BTNode<>(3);
                btn3.left = btn1;
                btn3.right = btn5;
                
                t1.setRoot(btn3);
                
                BTNode<Character> btnE = new BTNode<>('E');
                BTNode<Character> btnF = new BTNode<>('F');
                BTNode<Character> btnG = new BTNode<>('G');
                
                BTNode<Character> btnV = new BTNode<>('V');
                btnV.right = btnE;
                BTNode<Character> btnZ = new BTNode<>('Z');
                BTNode<Character> btnD = new BTNode<>('D');
                btnD.left = btnF;
                btnD.right = btnG;
                BTNode<Character> btnT = new BTNode<>('T');
                
                BTNode<Character> btnH = new BTNode<>('H');
                btnH.left = btnV;
                btnH.right = btnZ;
                BTNode<Character> btnA = new BTNode<>('A');
                btnA.left = btnD;
                BTNode<Character> btnM = new BTNode<>('M');
                btnM.left = btnT;
                
                BTNode<Character> btnC = new BTNode<>('C');
                btnC.right = btnH;
                BTNode<Character> btnX = new BTNode<>('X');
                btnX.left = btnA;
                btnX.right = btnM;
                
                BTNode<Character> btnS = new BTNode<>('S');
                btnS.left = btnC;
                btnS.right = btnX;
                
                t2.setRoot(btnS);
                
                t0.computeLevels();
                t1.computeLevels();
                t2.computeLevels();
                
                System.out.println(t0);
                System.out.println(t1);
                System.out.println(t2);
            }
        }
    }
}
