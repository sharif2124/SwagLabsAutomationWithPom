package com.swagLabs.util;

public class General {
    static final public int WAIT_TIME=20;
    public static void waitForDomStable(){
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
