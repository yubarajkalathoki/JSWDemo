
package com.yubaraj.jsw;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


/**
 *
 * @author Yuba Raj Kalathoki
 */
public class JSWDemo implements Runnable{
private static final Logger LOGGER = LoggerFactory.getLogger(JSWDemo.class);
    public void run() {
        while(true){
            LOGGER.info("JSW Demo is running...");
            try {
                Thread.sleep(1000L);
            } catch (InterruptedException ex) {
                LOGGER.error(ex.toString());
            }
        }
    }
}
