package routes;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

/**
 * Created by oelsabb on 20.10.17.
 */
@Component
public class CamelRoute extends RouteBuilder {
    public void configure() throws Exception {
        from("direct:firstRoute")
                .log("Camel body: ${body}");
    }





}
