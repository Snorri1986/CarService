package dbo;

import dbo.User;
import java.util.List;

/**
 * Description: Interface for fetch user's name
 * @autor Denys Shabelnyk
 * @since 0.3.1.4
 */
public interface IUserService {
    List<User> findByNameEndsWith(String name);
}
