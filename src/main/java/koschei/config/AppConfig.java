package koschei.config;

import koschei.models.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "koschei")
public class AppConfig {

    @Bean
    public static Island2 getIsland(Wood3 wood) {
        return new Island2(wood);
    }
    @Bean
    public static Rabbit4 getRabbit(Duck5 duck5) {
        return new Rabbit4(duck5);
    }
    @Bean
    public static Egg6 getEgg(Needle7 needle7){
        return new Egg6(needle7);
    }
}
