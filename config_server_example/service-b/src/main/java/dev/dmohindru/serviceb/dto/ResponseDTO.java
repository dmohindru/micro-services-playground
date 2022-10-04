package dev.dmohindru.serviceb.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
@Builder
public class ResponseDTO {
    @JsonProperty(value = "message")
    private String message;

    @JsonProperty(value = "encryptedMessage")
    private String encryptedMessage;

    @JsonProperty(value = "appName")
    private String appName;
}
