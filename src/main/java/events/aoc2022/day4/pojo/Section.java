package events.aoc2022.day4.pojo;

public class Section {
    int sectionOneStart;
    int sectionOneEnd;
    int sectionTwoStart;
    int sectionTwoEnd;

    public Section(String section){
        sectionOneStart=Integer.parseInt(section.split("-|,")[0]);
        sectionOneEnd=Integer.parseInt(section.split("-|,")[1]);
        sectionTwoStart=Integer.parseInt(section.split("-|,")[2]);
        sectionTwoEnd=Integer.parseInt(section.split("-|,")[3]);
    }

    public boolean doesOverlap(){

        if(sectionTwoStart>=sectionOneStart&&sectionOneEnd>=sectionTwoEnd){return true;}
        if(sectionOneStart>=sectionTwoStart&&sectionTwoEnd>=sectionTwoEnd){return true;}



        return false;



    }


    @Override
    public String toString() {
        return "Section{" +
                "sectionOneStart=" + sectionOneStart +
                ", sectionOneEnd=" + sectionOneEnd +
                ", sectionTwoStart=" + sectionTwoStart +
                ", sectionTwoEnd=" + sectionTwoEnd +
                '}';
    }
}
