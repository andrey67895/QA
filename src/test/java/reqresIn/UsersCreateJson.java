package reqresIn;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.github.imifou.jsonschema.module.addon.annotation.JsonSchema;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UsersCreateJson {
    @JsonSchema(required = true)
    private String name;
    @JsonSchema(required = true)
    private String job;
    @JsonSchema(required = true)
    private String id;
    @JsonSchema(required = true)
    @JsonProperty(value = "createdAt")
    private String createdAt;
}
