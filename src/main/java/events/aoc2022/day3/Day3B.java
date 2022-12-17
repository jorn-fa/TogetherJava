package events.aoc2022.day3;

import events.aoc2022.day3.pojo.Group;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static events.aoc2022.helpers.FileReader.ReadFromFile;


public class Day3B{

    //find badge char based on common char in 3 backpack strings
    public static void main(String[] args) throws IOException {
        List<String> source = ReadFromFile("AOC3.Txt");

        List<Group> groups=new ArrayList<>();
        int sum = 0;


        for(int i = 0;i<source.size();i+=3){
            groups.add(new Group(
                    source.get(i),
                    source.get(i+1),
                    source.get(i+2))
            );

        }

        //test
        Group test = new Group("vJrwpWtwJgWrhcsFMMfFFhFp","jqHRNqRjqzjGDLGLrsFMfFZSrLrFZsSL","PmmdzqPrVvPwwTWBwg");
        System.out.println(test.extractedNumber());

        //result
        System.out.println("result " + groups.stream().mapToInt(a -> a.extractedNumber()).sum());



    }

}
