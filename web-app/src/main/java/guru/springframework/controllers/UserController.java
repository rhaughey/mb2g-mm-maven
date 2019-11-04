package guru.springframework.controllers;

import guru.springframework.domain.UserCommand;
import guru.springframework.entities.User;

/**
 * Created by rfh on 11/4/2019
 */
public class UserController {

    User saveUser(UserCommand command) {
        return new User();
    }
}
