package hello.camel;

import org.apache.camel.component.timer.TimerComponent;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class MyConfig2 {
    @Bean(name = "timer")
    public TimerComponent timerComponent() {
        TimerComponent component = new MyTimerComponent();
        return component;
    }
}
