package events.aoc2022.day3.pojo;

import java.util.Arrays;

public class Backpack {

    String firstCompartment;
    String secondCompartment;

    private char common;


    public Backpack(String source){
        secondCompartment=source.substring(source.length()/2);
        firstCompartment=source.substring(0,source.length()/2);

    }

    @Override
    public String toString() {
        return "Backpack{" +
                "firstCompartment=" + firstCompartment +
                ", secondCompartment=" + secondCompartment +
                '}';
    }

    //find char in common in both sections
    //97-122 = lowercase
    //65-90 uppercase
    public int getCommon(){
        for(char a : firstCompartment.toCharArray()){
            if (secondCompartment.indexOf(a)>-1){common=a;}
        }

        return common;
    }

    public int extractedNumber() {
        getCommon();
        if((int)common<91){
            return (int) common - 64 + 26;
        }
        return (int) common - 96;
    }

}
