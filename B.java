// File: bpack/B.java
package bpack;

import apack.A;

public class B extends A {
    public void display() {
        // System.out.println("Default: " + defaultVar);  // Not accessible (different package, non-subclass)
        System.out.println("Protected: " + protectedVar); // Accessible (subclass)
        // System.out.println("Private: " + privateVar);  // Not accessible (private to class A)
        System.out.println("Public: " + publicVar);       // Accessible
    }
}

