package com.aapeli.springpattern.creational.singleton;

import org.springframework.stereotype.Component;

/**
 * @author jamesoladimeji
 * @created 02/12/2021 - 5:48 PM
 * @project IntelliJ IDEA
 */
@Component
public class SingB {

    public String makeSing() {
        return SingA.getInstance().getName("james");
    }

}
