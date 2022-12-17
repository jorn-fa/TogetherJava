package Helping.Atrolide;

import java.util.Arrays;
import java.util.List;

public class Sorting {

    public static void main(String[] args) {


        CardData card1 = new CardData("test3", 1);
        CardData card2 = new CardData("test2", 111);
        CardData card3 = new CardData("test4", 51);
        CardData card4 = new CardData("test1", 21);


        List<CardData> cards = Arrays.asList(card1, card2, card3, card4);


               cards.stream().
                       sorted((o1,o2)-> o1.compareTo(o2))
                       .forEach(System.out::println);

    }
}