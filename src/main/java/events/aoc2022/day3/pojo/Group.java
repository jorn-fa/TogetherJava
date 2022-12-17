package events.aoc2022.day3.pojo;

public class Group {

    String backpack1;
    String backpack2;
    String backpack3;
    private char common;

    public Group(String pack1,String pack2,String pack3){
        this.backpack1=pack1;
        this.backpack2=pack2;
        this.backpack3=pack3;
    }


    public char findCommon(){
        String longest=backpack1;
        String other1=backpack2;
        String other2=backpack3;

        if(backpack2.length()>longest.length()){
            longest=backpack2;
            other1=backpack1;
            other2=backpack3;
        }
        if(backpack3.length()>longest.length()){
            longest=backpack3;
            other1=backpack1;
            other2=backpack2;
        }


        for(char a : longest.toCharArray()){
            if (other1.indexOf(a)>-1 && (other2.indexOf(a)>-1)) {
                common=a;
                return common;
            }
        }
        return ' ';
    }

    public int extractedNumber() {
        findCommon();
        if((int)common<91){
            return (int) common - 64 + 26;
        }
        return (int) common - 96;
    }

}
