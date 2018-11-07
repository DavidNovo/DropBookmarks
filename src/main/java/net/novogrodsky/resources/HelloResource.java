package net.novogrodsky.resources;

import com.codahale.metrics.annotation.Timed;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * Each resource class is associated with a URI.
 *
 * <p>This resource returns information defined in this class.
 * Created by dnovogrodsky on 11/14/16.
 */
@Path("/Hello")
public class HelloResource {

  /**
   * This method returns a string.
   * It is annotated with @Timed so metrics will be created.
   *
   * @return
   */
  @GET
  @Timed
  @Produces(MediaType.TEXT_PLAIN)
  public String getGreeting() {
    return "Hello World";
  }
}
