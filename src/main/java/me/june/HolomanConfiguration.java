package me.june;

import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by IntelliJ IDEA.
 * User: june
 * Date: 2019-05-03
 * Time: 23:13
 **/
@Configuration
/**
 * Properties로 설정하는 클래스를 import한다
 */
@EnableConfigurationProperties(HolomanProperties.class)
public class HolomanConfiguration {

    /**
     * 해당 타입의 빈이 없을때만 빈을 등록하도록 설정
     * @return
     */
    @Bean
    @ConditionalOnMissingBean
    public HoloMan holoMan(HolomanProperties properties) {
        HoloMan holoMan = new HoloMan();
        holoMan.setHowLong(properties.getHowlong());
        holoMan.setName(properties.getName());
        return holoMan;
    }
}
