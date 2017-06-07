package net.novogrodsky.resources;

import com.codahale.metrics.annotation.ExceptionMetered;
import com.codahale.metrics.annotation.Metered;
import com.codahale.metrics.annotation.Timed;
import net.novogrodsky.api.Saying;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicLong;

/**
 * A Resource class is the heart of a dropwizard application.
 * This uses a class level @Path annotation.
 * Created by david on 6/7/2017.
 */
@Path("/hello-saying")
@Produces(MediaType.APPLICATION_JSON)
public class SayingResource {
    private final String template;
    private final String defaultName;
    private final AtomicLong counter;


    public SayingResource(String template, String defaultName) {
        this.counter = new AtomicLong();
        this.template = template;
        this.defaultName = defaultName;
    }

    /**
     * This method is mapped to the @GET HTTP verb.  see the annotation
     * QueryParam; it is used to map the query parameter to the variable name.
     * also note that if there is no name, the default from the template is used.
     *
     * @param name
     * @return
     */
    @GET
    @Timed
    public Saying sayHello(@QueryParam("name") Optional<String> name){
        final String value = String.format(template, name.orElse(defaultName));
        return new Saying(counter.incrementAndGet(), value);
    }
}
