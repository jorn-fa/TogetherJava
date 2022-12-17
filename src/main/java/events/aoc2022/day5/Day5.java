package events.aoc2022.day5;

import events.aoc2022.day5.pojo.Ship;


import java.io.IOException;
import java.util.List;

import static events.aoc2022.helpers.FileReader.ReadFromFile;

public class Day5 {


    public static void main(String[] args) throws IOException {

        List<String> source = ReadFromFile("AOC5.Txt");

        Ship ship=new Ship();
        //bottom to top, case ignored
        //TEST CASE
       // ship.addStack("zn");
        //ship.addStack("mcd");
        //ship.addStack("p");

        ship.addStack("bpnqhdrt");
        ship.addStack("wgbjtv");
        ship.addStack("nrhdsvmq");
        ship.addStack("pznmc");
        ship.addStack("dzb");
        ship.addStack("vcwz");
        ship.addStack("gzncvqls");
        ship.addStack("lgjmdnv");
        ship.addStack("tpmfzcg");


//        ship.printDetails();
//        ship.moveItems9001(1,2,1);
//        ship.printDetails();
//        ship.moveItems9001(3,1,3);
//        ship.moveItems9001(2,2,1);
//        ship.moveItems9001(1,1,2);


        //skip initial graphic lines
        for (int i = 10; i <source.size();i++){
            String[] split = source.get(i).split("\\D+");
            ship.moveItems9001(Integer.valueOf(split[1]),Integer.valueOf(split[2]),Integer.valueOf(split[3]));
        }
        ship.printDetails();




    }
}
