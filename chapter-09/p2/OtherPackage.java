/**
 * C09 L02
 */
package p2;

import p1.Protection;

class OtherPackage {
    OtherPackage() {
        p1.Protection p = new Protection();
        System.out.println("other package constructor");

        // System.out.println("n = " + p.n);

        // System.out.println("n_pri = " + p.n_pri);
        // System.out.println("n_pro = " + p.n_pro);
        System.out.println("n_pub = " + p.n_pub);
    }
}