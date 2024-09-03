package org.example.jwtwithspringbootbackend.service;

import org.example.jwtwithspringbootbackend.dto.UserDTO;

public interface UserService {
    int saveUser(UserDTO userDTO);
    UserDTO searchUser(String username);

}
