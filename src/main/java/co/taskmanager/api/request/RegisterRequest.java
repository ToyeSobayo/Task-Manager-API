package co.taskmanager.api.request;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter

public class RegisterRequest {

    @NotNull
    private String email;

    @NotNull
    private String password;
}
