/**
 * C09 L02
 */
package p2;

import p1.Protection;

class Protection2 extends Protection {
    Protection2() {
        System.out.println("derived other package constructor");

        // System.out.println("n = " + n);
        // System.out.println("n_pri = " + n_pri);
        System.out.println("n_pro = " + n_pro);
        System.out.println("n_pub = " + n_pub);
    }
}