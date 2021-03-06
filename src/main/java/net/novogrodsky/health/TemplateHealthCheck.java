package net.novogrodsky.health;

import com.codahale.metrics.health.HealthCheck;

/**
 * Created by david on 6/7/2017.
 */
public class TemplateHealthCheck extends HealthCheck {
  private final String template;

  public TemplateHealthCheck(String template) {
    this.template = template;
  }

  @Override
  protected Result check() throws Exception {
    final String saying = String.format(template, "TEST");
    if (!saying.contains("TEST")) {
      return Result.unhealthy("the template does not include test name");
    }
    return Result.healthy();
  }
}
