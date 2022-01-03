package com.kodilla.patterns.strategy.social;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class UserTestSuite {

    @Test
    void testDefaultSharingStrategies(){
        //Given
        User johnni3 = new Millenials("John");
        User sK8 = new YGeneration("Marian");
        User freak = new ZGeneration("Jacuś");

        //When
        String johnni3Social = johnni3.sharePost();
        System.out.println("John is " + johnni3Social);
        String sK8Social = sK8.sharePost();
        System.out.println("Marian is " + sK8Social);
        String freakSocial = freak.sharePost();
        System.out.println("Jacuś is " + freakSocial);

        //Then
        assertEquals("using Twitter.",johnni3Social);
        assertEquals("using Facebook.",sK8Social);
        assertEquals("using Snapchat.",freakSocial);
    }

    @Test
    void testIndividualSharingStrategy(){
        //Given
        User freak = new Millenials("Jacuś");

        //When
        String freakSocial = freak.sharePost();
        System.out.println("Jacuś is " + freakSocial);
        freak.setSocialPublisher(new FacebookPublisher());
        freakSocial = freak.sharePost();
        System.out.println("Jacuś is " + freakSocial);

        //Then
        assertEquals("using Facebook.",freakSocial);
    }
}
