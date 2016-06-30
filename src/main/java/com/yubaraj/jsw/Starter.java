package com.yubaraj.jsw;

/**
 *
 * @author Yuba Raj Kalathoki
 */
public class Starter {

    public static void main(String[] args) {
        JSWDemo jSWDemo = new JSWDemo();
        Thread thread = new Thread(jSWDemo);
        thread.start();
    }
}
