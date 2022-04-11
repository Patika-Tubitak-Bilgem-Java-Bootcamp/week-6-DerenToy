package user.dto;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.ToString;
import org.hibernate.validator.constraints.Range;
import user.entity.User;

import javax.validation.constraints.*;
import java.util.ArrayList;

@RequiredArgsConstructor
@Getter
@ToString
public class AddUserRequestDTO {

    @NotEmpty(message = "Username cannot be empty!")
    private final String username;

    @NotEmpty(message = "Email cannot be empty!")
    private final String email;

    @NotEmpty(message = "Password cannot be empty!")
    private final String password;

    public User toUser() {
        return new User(email, username, password, new ArrayList<>());
    }
}

