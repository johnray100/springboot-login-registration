package jay.springbootloginregistration.Repository;

import jay.springbootloginregistration.Model.User;
import jay.springbootloginregistration.Model.UserDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);

    User save(UserDto userDto);
}
