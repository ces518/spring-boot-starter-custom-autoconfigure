package me.june;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * Created by IntelliJ IDEA.
 * User: june
 * Date: 2019-05-04
 * Time: 19:42
 **/
@ConfigurationProperties("holoman")
public class HolomanProperties {

    private String name;
    private int howlong;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHowlong() {
        return howlong;
    }

    public void setHowlong(int howlong) {
        this.howlong = howlong;
    }
}
