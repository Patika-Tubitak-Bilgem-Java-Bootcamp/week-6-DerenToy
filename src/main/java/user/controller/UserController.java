package user.controller;

import common.dto.MessageResponse;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import user.dto.AddUserRequestDTO;
import user.service.UserService;


@RestController
@Validated
@RequestMapping("/users")
// @CrossOrigin(origins = "http://localhost:3000", allowedHeaders = "*")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping
    public MessageResponse addUser(@RequestBody final AddUserRequestDTO request) {
        return userService.addUser(request.toUser());
    }
}
