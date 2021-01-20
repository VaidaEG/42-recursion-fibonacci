/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rekursija;

/**
 *
 * @author 37067
 */
public class Rekursija {

    /**
     * @param args the command line arguments
     */
    // faktorialas
    public static int fakt(int sk) {
        if (sk < 0) {
            return -1;
        }
        if (sk == 0) {
            return 1;
        }
        return sk * fakt(sk - 1);
    }
    // fibonacci seka
    public static void fib(long sk1, long sk2, long max) {
        System.out.println(sk1);
        long sk3 = sk1 + sk2;
        if (sk3 < max) {
           fib(sk2,sk3,max); 
        } else {
            System.out.println(sk2);
            if(sk3 == max) {
            System.out.println(sk3);
            }
        }
        
        //
    }
    public static void main(String[] args) {
        int f = fakt(5);
//        int sk = 4;
//        int f = 1;
//        for (int i = sk; i >= 1; i--) {
//            f *= i;
//        }
        // spausdiname faktoriala
        System.out.println(f);
        /*
        4! = 4 * 3 * 2 * 1
        3! = 3 * 2 * 1
        2! = 2* 1
        1! = 1
        0! = 1
        */
        // spausdiname fibonacci seka
        fib(1, 1, 21);
    }
    
}
