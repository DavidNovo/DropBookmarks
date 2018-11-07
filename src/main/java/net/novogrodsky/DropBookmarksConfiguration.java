package net.novogrodsky;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.dropwizard.Configuration;
import org.hibernate.validator.constraints.NotEmpty;

/**
 * Each Dropwizard application has it own subclass of the
 * Configuration class.  This class specifices environment-specific
 * parameters.  These parameters are defined in a YAML configuration file.
 * TheYAML file is deseralized to an instance of the applications's configuartion
 * class and validated.
 */
public class DropBookmarksConfiguration extends Configuration {
  // TODO: implement service configuration

  // these are pulled from the deseralized YAML file
  @NotEmpty
  private String template;

  @NotEmpty
  private String defaultName = "Stranger";

  // these are getters and setters associated with the above variables
  @JsonProperty
  public String getTemplate() {
    return template;
  }

  @JsonProperty
  public String getDefaultName() {
    return defaultName;
  }

  @JsonProperty
  public void setDefaultName(String name) {
    this.defaultName = name;
  }
}
