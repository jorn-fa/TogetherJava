package events.aoc2022.day3;

import events.aoc2022.day3.pojo.Backpack;

import java.io.IOException;
import java.util.List;

import static events.aoc2022.helpers.FileReader.ReadFromFile;

public class Day3 {

    public static void main(String[] args) throws IOException {
        int sum = 0;

        List<String> source = ReadFromFile("AOC3.Txt");

        /* each line is a backpack
        each backpack has 2 compartments, each is half string length
        -> search for an item that is in both compartments
        -> convert to priority,  lowercase is 1 to 26, uppercase is 27 to 52

        * sum of total priority

         */

        Backpack test1 = new Backpack("vJrwpWtwJgWrhcsFMMfFFhFp");
        Backpack test2 = new Backpack("jqHRNqRjqzjGDLGLrsFMfFZSrLrFZsSL");
        Backpack test3 = new Backpack("PmmdzqPrVvPwwTWBwg");
        Backpack test4 = new Backpack("wMqvLMZHhHMvwLHjbvcjnnSBnvTQFn");
        Backpack test5 = new Backpack("ttgJtRGJQctTZtZT");
        Backpack test6 = new Backpack("CrZsJsPPZsGzwwsLwLmpwMDw");

        sum= test1.extractedNumber()+ test2.extractedNumber()+ test3.extractedNumber()+ test4.extractedNumber()+test5.extractedNumber()+test6.extractedNumber();
        System.out.println(sum==157);
        sum=0;

        for(String line:source){
            Backpack pack=new Backpack(line);
            sum+= pack.extractedNumber();
        }



        System.out.println("file result=" + sum);



    }



}
