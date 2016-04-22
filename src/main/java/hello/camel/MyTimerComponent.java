package hello.camel;

import org.apache.camel.Endpoint;
import org.apache.camel.component.timer.TimerComponent;

import java.util.Map;

public class MyTimerComponent extends TimerComponent {
    @Override
    protected Endpoint createEndpoint(String uri, String remaining, Map<String, Object> parameters) throws Exception {
        // periodが設定されていない場合、ここで設定してあげる
        if (!parameters.containsKey("period"))
            parameters.put("period", "5s");
        return super.createEndpoint(uri, remaining, parameters);
    }
}
