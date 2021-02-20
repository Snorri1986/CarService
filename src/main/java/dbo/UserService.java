package dbo;

import dbo.User;
import dbo.UserRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Description: Service class for user
 * @autor Denys Shabelnyk
 * @since 0.3.1.4
 */
public class UserService implements IUserService {

    @Autowired
    private UserRepository repository;

    @Override
    public List<User> findByNameEndsWith(String name) {

        List<User> users = (List<User>) repository.findByNameEndsWith(name);
        return users;
    }

}
