
package org.example.config;


import org.example.aplication.UseCase.CreateUserUseCase;
import org.example.domain.port.out.UserRepositoryPort;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UseCaseConfig {

    @Bean
    public CreateUserUseCase createUserUseCase(
            UserRepositoryPort userRepositoryPort) {

        return new CreateUserUseCase(userRepositoryPort);
    }
}
