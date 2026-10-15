
package org.example.aplication.UseCase;

import org.example.domain.model.User;
import org.example.domain.port.out.UserRepositoryPort;

import java.util.UUID;

public class CreateUserUseCase {

    private final UserRepositoryPort userRepository;

    public CreateUserUseCase(UserRepositoryPort userRepository) {
        this.userRepository = userRepository;
    }

    public User execute(String name, String email, String password) {
        User user = new User(
                UUID.randomUUID(),
                name,
                email,
                password
        );

        return userRepository.save(user);
    }
}
