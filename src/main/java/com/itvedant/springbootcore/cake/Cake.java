package com.itvedant.springbootcore.cake;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Cake {
    Flavor flavor;
    Cream cream;

    Cake(Flavor flavor){
        this.flavor = flavor;
        System.out.println("\nCake Object Created\n");
        flavor.getFlavor();
    }

    @Autowired
    public void setCream(Cream cream){
        this.cream = cream;
        cream.getName();
    }
}