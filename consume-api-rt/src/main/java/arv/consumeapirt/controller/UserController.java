package arv.consumeapirt.controller;

import arv.consumeapirt.models.*;
import arv.consumeapirt.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ArvikV
 * @version 1.0
 * @since 07.06.2022
 */
@RestController
public class UserController {
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/getAll")
    public User[] getMessageInfo() {
        return userService.getAllUsers();
    }
}
