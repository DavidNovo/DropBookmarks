package net.novogrodsky;

import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;
import net.novogrodsky.health.TemplateHealthCheck;
import net.novogrodsky.resources.HelloResource;
import net.novogrodsky.resources.SayingResource;

/**
 * The Application subclass forms the core of the application.  This class
 * pulls together the bundles and provides basic commands.
 */
public class DropBookmarksApplication extends Application<DropBookmarksConfiguration> {

  /**
   * This is the applications main entry point.
   *
   * @param args
   * @throws Exception
   */
  public static void main(final String[] args) throws Exception {
    new DropBookmarksApplication().run(args);
  }

  @Override
  public String getName() {
    return "DropBookmarks";
  }

  /**
   * This initalized the application before it is run, like configuration
   * source provides and such....
   *
   * @param bootstrap
   */
  @Override
  public void initialize(final Bootstrap<DropBookmarksConfiguration> bootstrap) {
    // TODO: application initialization
  }

  /**
   * This method is where resources are registered with the environment.
   *
   * @param configuration
   * @param environment
   */
  @Override
  public void run(final DropBookmarksConfiguration configuration,
                  final Environment environment) {

    // adding the health check to the environment
    final TemplateHealthCheck healthCheck =
        new TemplateHealthCheck(configuration.getTemplate());
    environment.healthChecks().register("template", healthCheck);

    // adding first resource to the environment
    environment.jersey().register(new HelloResource());

    //creating second resource to the environment
    final SayingResource sayingResource = new SayingResource(
        configuration.getTemplate(),
        configuration.getDefaultName()
    );

    // adding second resource to environment
    environment.jersey().register(sayingResource);

  }

}
