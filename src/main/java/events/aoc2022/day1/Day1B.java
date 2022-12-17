package events.aoc2022.day1;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;


public class Day1B {



        public static void main(String[] args) throws IOException {
            // read file
            List<String> lines;
            lines = Files.readAllLines(Path.of("src/main/resources/AOC1.Txt"));

            //split into sections,  file groups are seperated by double enter
            Map<Integer, List<String>> groups = new HashMap<>();

            int counter = 0;
            int last = -1; //-1 to grab first line
            for (int i = 0; i < lines.size(); i++) {
                if (lines.get(i).isEmpty()) {
                    groups.put(++counter, lines.subList(last + 1, i));  // counter double enter
                    last = i;
                }
            }
            groups.put(++counter, lines.subList(last + 1, lines.size()));  // last group - cannot split on new line

            //convert to map with total
            Map<Integer, Integer> totals = new HashMap<>();

            for (int i = 1; i <= groups.size(); i++) {
                //System.out.println(groups.get(i));
                Integer sum = groups.get(i).stream().mapToInt(Integer::valueOf)
                        .sum();
                totals.put(i, sum);
            }

            //get the 3 top entries as sum

            SortedSet<Integer> values = new TreeSet<>(totals.values());

            for (Integer value : values) {
                System.out.println(value);
            }

        }
    }


