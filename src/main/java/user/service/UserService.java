package user.service;

import common.dto.MessageResponse;
import common.enums.MessageType;
import org.springframework.stereotype.Service;
import user.entity.User;
import user.repository.UserRepository;

@Service
public class UserService {

    private final UserRepository userRepository;

    private static final String USER_ADDED_MESSAGE = "User has been added successfully!";
    private static final String USER_ALREADY_EXISTS_MESSAGE = "User already exists!";

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public MessageResponse addUser(User newUser) {
        if (userRepository.existsByUsername(newUser.getUsername())) {
            return new MessageResponse(MessageType.ERROR, USER_ALREADY_EXISTS_MESSAGE);
        }
        userRepository.save(newUser);
        return new MessageResponse(MessageType.SUCCESS, USER_ALREADY_EXISTS_MESSAGE);
    }

}
