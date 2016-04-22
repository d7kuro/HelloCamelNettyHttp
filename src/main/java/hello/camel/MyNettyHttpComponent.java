package hello.camel;

import org.apache.camel.Endpoint;
import org.apache.camel.component.netty4.NettyConfiguration;
import org.apache.camel.component.netty4.http.NettyHttpComponent;
import org.apache.camel.component.netty4.http.NettyHttpEndpoint;

import java.util.Map;

public class MyNettyHttpComponent extends NettyHttpComponent {
    @Override
    protected Endpoint createEndpoint(String uri, String remaining, Map<String, Object> parameters) throws Exception {
        Endpoint endpoint = super.createEndpoint(uri, remaining, parameters);
        NettyHttpEndpoint nettyHttpEndpoint = (NettyHttpEndpoint) endpoint;
        NettyConfiguration configuration = nettyHttpEndpoint.getConfiguration();
        if (configuration.getPort() == -1) {
            if (remaining.startsWith("http:")) {
                configuration.setPort(80);
            } else if (remaining.startsWith("https:")) {
                configuration.setPort(443);
            }
        }
        return nettyHttpEndpoint;
    }
}
