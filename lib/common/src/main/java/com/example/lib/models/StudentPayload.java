package com.example.lib.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.validator.constraints.Length;

@Builder(toBuilder = true)
@AllArgsConstructor(access = AccessLevel.PUBLIC)
@NoArgsConstructor
@Getter
@Setter
@Data
public class StudentPayload {

    @NotNull
    @Min(0)
    @JsonProperty(required = true)
    private Long id;

    @javax.validation.constraints.NotNull
    @Length(min = 3, max = 25, message = "invalid value")
    @JsonProperty(required = true)
    private String fullName;

    @NotNull
    @Min(0)
    @JsonProperty(required = true)
    private Long age;

    @Override
    public String toString() {
        return "StudentPayload{" +
            "id=" + id +
            ", fullName='" + fullName + '\'' +
            ", age=" + age +
            '}';
    }
}
