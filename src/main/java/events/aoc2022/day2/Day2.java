package events.aoc2022.day2;

import java.io.IOException;
import java.util.List;

import static events.aoc2022.helpers.FileReader.ReadFromFile;

public class Day2 {

    int WIN = 6;
    int LOSE = 0;
    int TIE = 3;
    String ROCK="ROCK";
    String PAPER="PAPER";
    String SCISSOR="SCISSOR";


    public static void main(String[] args) throws IOException {

        Day2 me= new Day2();
        List<String> source = ReadFromFile("AOC2.txt");
        int score=0;
        for(String line : source) {
            //int add = me.getScore(line);
            int add = me.getScore2(line);
            System.out.println("score="+ add );
            score+=add;
        }

        System.out.println("total="+score);


    }

    private int getScore(String line){
        int hand = 1; // rock
        String leftHand = ROCK;
        String rightHand = ROCK;

        if(line.startsWith("B")){leftHand = PAPER;}
        if(line.startsWith("C")){leftHand = SCISSOR;}
        if(line.endsWith("Y")){rightHand= PAPER;}
        if(line.endsWith("Z")){rightHand= SCISSOR;}



        if(rightHand.equals(PAPER)){hand=2;}
        if(rightHand.equals(SCISSOR)){hand=3;}

        System.out.print(line + "    ->      "   + leftHand + " vs " + rightHand + "=" + hand + "     ");

        if (leftHand.equals(rightHand)){return TIE+hand;}

        if(rightHand.equals(SCISSOR)&&leftHand.equals(ROCK)){return LOSE+hand;}
        if(rightHand.equals(PAPER)&&leftHand.equals(SCISSOR)){return LOSE+hand;}
        if(rightHand.equals(ROCK)&&leftHand.equals(PAPER)){return LOSE+hand;}

        if(leftHand.equals(SCISSOR)&&rightHand.equals(ROCK)){return WIN+hand;}
        if(leftHand.equals(PAPER)&&rightHand.equals(SCISSOR)){return WIN+hand;}
        if(leftHand.equals(ROCK)&&rightHand.equals(PAPER)){return WIN+hand;}

        return 0;

    }



    private int getScore2(String line){

        System.out.println ("line = "+line);
        // x=lose, y=draw, z=win
        //if(line.endsWith("x")){rightHand= ROCK;}
        //if(line.endsWith("Y")){rightHand= PAPER;}
        //if(line.endsWith("Z")){rightHand= SCISSOR;}

        //A Rock B Paper C Scissor
        /* draw     AX
                    BY
                    CZ
            win     AZ
                    BX
                    CY
            lose    AY
                    BZ
                    CX

        */

        //draw
        if(line.endsWith("Y")){
            if(line.startsWith("A")){return getScore("A X");}
            if(line.startsWith("B")){return getScore("B Y");}
            return getScore("C Z");
        }

        //lose
        if(line.endsWith("Z")){
            if(line.startsWith("A")){return getScore("A Y");}
            if(line.startsWith("B")){return getScore("B Z");}
            return getScore("C X");
        }

        //win

        if(line.endsWith("X")){
            if(line.startsWith("A")){return getScore("A Z");}
            if(line.startsWith("B")){return getScore("B X");}
            return getScore("C Y");
        }




        return 0;
    }


}

