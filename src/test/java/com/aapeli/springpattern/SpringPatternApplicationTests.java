package com.aapeli.springpattern;

import com.aapeli.springpattern.creational.prototype.ProtoFalse;
import com.aapeli.springpattern.creational.prototype.ProtoTrue;


import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;


@SpringBootTest
class SpringPatternApplicationTests {

    @Autowired
    ProtoTrue protoTrue1;
    @Autowired
    ProtoTrue protoTrue2;
    @Autowired
    ProtoFalse protoFalse1;
    @Autowired
    ProtoFalse protoFalse2;

    @Test
    public void testMe() {
       // Assert.assertSame(protoFalse2, protoFalse1);
    }

}
