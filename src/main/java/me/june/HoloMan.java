package me.june;

/**
 * Created by IntelliJ IDEA.
 * User: june
 * Date: 2019-05-03
 * Time: 23:12
 **/
public class HoloMan {

    String name;

    int howLong;

    @Override
    public String toString() {
        return "HoloMan{" +
                "name='" + name + '\'' +
                ", howLong=" + howLong +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHowLong() {
        return howLong;
    }

    public void setHowLong(int howLong) {
        this.howLong = howLong;
    }
}
