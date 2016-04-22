package hello.route;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

/**
 * Created by daikuro on 2016/04/22.
 */
@Component
public class HelloRoute extends RouteBuilder {

    @Override
    public void configure() throws Exception {
        from("direct:in")
                .to("netty4-http:http://camel.apache.org")
                .to("log:test");

        from("timer:test1")
                .to("log:test2");
    }
}
