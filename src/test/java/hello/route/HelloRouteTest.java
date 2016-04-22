package hello.route;

import org.apache.camel.Exchange;
import org.apache.camel.spring.Main;
import org.apache.camel.test.spring.CamelSpringTestSupport;
import org.junit.Test;
import org.springframework.context.support.AbstractApplicationContext;

public class HelloRouteTest extends CamelSpringTestSupport {

    @Override
    protected AbstractApplicationContext createApplicationContext() {
        Main main = null;
        try {
            main = new Main();
            main.start();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return main.getApplicationContext();
    }

    @Test
    public void ルートにデータを流す() throws Exception {
//        Exchange exchange = createExchangeWithBody(null);
//        template.send("direct:in", exchange);
//        throwIfException(exchange);
        Thread.sleep(10000000);
    }

    /**
     * ルート上で例外が発生した場合は例外を投げる
     */
    private void throwIfException(Exchange exchange) throws Exception {
        Exception exception = exchange.getException();
        if (exception != null)
            throw exception;
    }
}