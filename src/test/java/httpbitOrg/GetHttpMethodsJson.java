package httpbitOrg;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import com.github.imifou.jsonschema.module.addon.annotation.JsonSchema;

import java.util.HashMap;
import java.util.Map;

@Data
public class GetHttpMethodsJson {
    @JsonSchema(required = true)
    private Args args;
    @JsonSchema(required = true)
    private Headers headers;
    @JsonSchema(required = true)
    private String origin;
    @JsonSchema(required = true)
    private String url;

    @Data
    public static class Headers {
        @JsonSchema(required = true)
        @JsonProperty(value = "Accept")
        private String accept;
        @JsonSchema(required = true)
        @JsonProperty(value = "Accept-Encoding")
        private String acceptEncoding;
        @JsonSchema(required = true)
        @JsonProperty(value = "Accept-Language")
        private String acceptLanguage;
        @JsonSchema(required = true)
        @JsonProperty(value = "Content-Type")
        private String contentType;
        @JsonSchema(required = true)
        @JsonProperty(value = "Host")
        private String host;
        @JsonSchema(required = true)
        private String referer;
        @JsonSchema(required = true)
        @JsonProperty(value = "User-Agent")
        private String userAgent;
        @JsonSchema(required = true)
        @JsonProperty(value = "X-Amzn-Trace-Id")
        private String xAmznTraceId;
    }

    @Data
    public static class Args {
        @JsonSchema()
        private Map<String, Object> additionalProperties = new HashMap<>();
    }
}