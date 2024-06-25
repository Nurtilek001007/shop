package kz.shop.service;

import kz.shop.model.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Optional;

public interface UserService {
    List<User> getAllUsers();
    Optional<User> getUserById(Long id);
    void createUser(User user);
    User updateUser(User user);
    void deleteUser(Long id);
    Page<User> searchUsersByName(String name, Pageable pageable);
}
