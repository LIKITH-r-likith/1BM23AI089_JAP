// File: cpack/C.java
package cpack;

import apack.A;

public class C {
    public void display() {
        A a = new A();
        // System.out.println("Default: " + a.defaultVar);   // Not accessible (different package)
        // System.out.println("Protected: " + a.protectedVar); // Not accessible (not a subclass)
        // System.out.println("Private: " + a.privateVar);     // Not accessible (private to A)
        System.out.println("Public: " + a.publicVar);         // Accessible
    }
}


