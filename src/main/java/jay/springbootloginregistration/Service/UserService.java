package jay.springbootloginregistration.Service;

import jay.springbootloginregistration.Model.User;
import jay.springbootloginregistration.Model.UserDto;

public interface UserService {

    User findByUsername(String username);

    User save(UserDto userDto);
}
