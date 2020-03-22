package com.company;

/*

1619 And without interrupt weakly
Find out how the program works.
Make it so that in the ourInterruptMethod method you can make the TestThread thread end by itself.
The interrupt method cannot be used.

Requirements:
1. The Solution class must have a public static method ourInterruptMethod without parameters.
2. The run method should print "he-he" every half a second until ourInterruptMethod method is called.
3. You need to change the while loop condition in the run method.
4. The main method must create a Thread object passing the TestThread object to the constructor.
5. The main method should call the start method on an Thread object.
6. The main method should call ourInterruptMethod method.


 */

import java.util.ArrayList;
import java.util.List;


public class Solution {
    public static boolean working = true;

    public static void main(String[] args) throws InterruptedException {
        Thread t = new Thread(new TestThread());
        t.start();
        Thread.sleep(3000);
        ourInterruptMethod();
    }

    public static void ourInterruptMethod() {
        working = false;
    }

    public static class TestThread implements Runnable {
        public void run() {
            while (working) {
                try {
                    System.out.println("he-he");
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                }
            }
        }
    }
}



