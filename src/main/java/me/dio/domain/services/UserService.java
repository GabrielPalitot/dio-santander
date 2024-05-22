package me.dio.domain.services;

import me.dio.domain.model.User;

import java.util.List;
import java.util.Optional;

public interface UserService {
    User findById(Long id);
    User create(User user);

}
