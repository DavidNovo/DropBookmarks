package net.novogrodsky.api;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.hibernate.validator.constraints.Length;

/**
 * This is a POJO. It represents information that will be sent across
 * a request.
 *
 * Also this is immutable.
 *
 * Uses JavaBeans standard.
 * Created by david on 6/7/2017.
 */
public class Saying {
    private long id;

    @Length(max = 3)
    private String content;

    public Saying() {
        // Jackson deserialization
    }

    public Saying(long id, String content) {
        this.id = id;
        this.content = content;
    }

    @JsonProperty
    public long getId() {
        return id;
    }

    @JsonProperty
    public String getContent() {
        return content;
    }
}
