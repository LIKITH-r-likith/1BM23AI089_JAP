// File: dpack/ProtectedDemo.java
package dpack;

import bpack.B;
import cpack.C;

public class ProtectedDemo {
    public static void main(String[] args) {
        B bObj = new B();
        C cObj = new C();

        System.out.println("From class B:");
        bObj.display();

        System.out.println("From class C:");
        cObj.display();
    }
}
