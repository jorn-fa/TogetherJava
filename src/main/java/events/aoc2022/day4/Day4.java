package events.aoc2022.day4;

import events.aoc2022.day4.pojo.Section;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static events.aoc2022.helpers.FileReader.ReadFromFile;

public class Day4 {

    public static void main(String[] args) throws IOException {

        List<String> source = ReadFromFile("AOC4.Txt");
        List<String> testing = Arrays.asList("2-4,6-8", "2-3,4-5", "5-7,7-9","2-8,3-7","6-6,4-6","2-6,4-8");

        //space cleaning, check for sections that overlap

        List<Section>sections = new ArrayList<>();
        //testing.forEach(a-> sections.add(new Section(a)));
        source.forEach(a-> sections.add(new Section(a)));



        for (Section section : sections){
            System.out.println(section);
            System.out.println(section.doesOverlap());
        }

        System.out.println(sections.stream().filter(a->a.doesOverlap()==true).count());



    }

}
