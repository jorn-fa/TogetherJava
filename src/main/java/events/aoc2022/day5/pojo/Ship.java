package events.aoc2022.day5.pojo;


import java.util.ArrayList;

import java.util.List;
import java.util.Locale;
import java.util.Stack;
import java.util.stream.Collectors;

public class Ship {

//    List<List<Character>> stacks=new ArrayList<List<Character>>();
    List<Stack> stacks = new ArrayList<>();

    public void addStack(String stack) {
        List<Character> letters = stack.toUpperCase(Locale.ROOT).chars().mapToObj(c -> (char) c).collect(Collectors.toList());

        Stack temp = new Stack();
        letters.forEach(a->temp.add(a));
        stacks.add(temp);
    }


    public void printDetails(){
        stacks.forEach(a-> System.out.println(a));
        System.out.println("***************");
    }


    void moveItem(int source,int destination){
        stacks.get(--destination).add(stacks.get(--source).pop());
    }


    /**
     * move 1 item each time for x repeats
     * @param times
     * @param source
     * @param destination
     */
    public void moveItems(int times, int source, int destination) {

        for(int i=0;i<times;i++){
            moveItem(source,destination);
        }
    }


    /**
     * move a whole stack at once of x size
     * @param times
     * @param source
     * @param destination
     */
    public void moveItems9001(int times, int source, int destination) {
        Stack temp = new Stack();
        stacks.add(temp);
        int tempNumber=stacks.size();
        for(int i=0;i<times;i++){
            moveItem(source,tempNumber);
        }



        for(int i=0;i<times;i++){
            moveItem(tempNumber,destination);
        }
        stacks.remove(stacks.size()-1);


    }


}
