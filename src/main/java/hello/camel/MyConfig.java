package hello.camel;

import org.apache.camel.component.netty4.http.NettyHttpComponent;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class MyConfig {
    // to("netty4-http:xxxxx")は自分のコンポーネントに書き換える
    @Bean(name = "netty4-http")
    public NettyHttpComponent netty4http() {
        NettyHttpComponent component = new MyNettyHttpComponent();
        return component;
    }
}
