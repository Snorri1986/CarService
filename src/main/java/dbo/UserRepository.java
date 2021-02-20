package dbo;

import dbo.User;
import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Description: Interface for fetch user's name
 * @autor Denys Shabelnyk
 * @since 0.3.1.4
 */
@Repository
public interface UserRepository extends CrudRepository<User,String> {
    @Query("SELECT NAME FROM TESTTABLE")
    List<User> findByNameEndsWith(String chars);
}
