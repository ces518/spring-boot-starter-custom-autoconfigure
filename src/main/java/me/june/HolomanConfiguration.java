package me.june;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by IntelliJ IDEA.
 * User: june
 * Date: 2019-05-03
 * Time: 23:13
 **/
@Configuration
public class HolomanConfiguration {

    @Bean
    public HoloMan holoMan() {
        HoloMan holoMan = new HoloMan();
        holoMan.setHowLong(100);
        holoMan.setName("june");
        return holoMan;
    }
}
