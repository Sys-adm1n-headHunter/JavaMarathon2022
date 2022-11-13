package day12.task4;

import java.util.ArrayList;
import java.util.List;

public class MusicBand {
    private String name;
    private int year;
    private List<String> bandMembers = new ArrayList<>();

    public MusicBand(String name, int year, List<String> bandMembers) {
        this.name = name;
        this.year = year;
        this.bandMembers = bandMembers;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public List<String> getBandMembers() {
        return bandMembers;
    }

    public void setBandMembers(List<String> bandMembers) {
        this.bandMembers = bandMembers;
    }

    @Override
    public String toString() {
        return "{name='" + name + '\'' +
                ", year=" + year +
                '}';
    }

    public static void transferMembers(MusicBand A, MusicBand B) {
        B.bandMembers.addAll(A.bandMembers);
        A.bandMembers.clear();
    }

    public void printMembers() {
        System.out.println("Группа " + name + " , состав группы" + this.bandMembers);
    }

}
