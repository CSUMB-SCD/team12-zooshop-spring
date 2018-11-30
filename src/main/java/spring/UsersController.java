package spring;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class UsersController {
    @Autowired
    private UsersRepository userRepository;

    @CrossOrigin(origins = "*")
    @PutMapping(value = "/credit/{username}/{credit}")
    public Users setCredits(
            @PathVariable("username") String username,
            @PathVariable("credit") Double credit) {
        Users users = userRepository.findByusername(username);
        users.setCredit(credit);
        userRepository.save(users);
        return users;
    }

    @CrossOrigin(origins = "*")
    @GetMapping ("/users")
    public List<Users> getAll() {
        return userRepository.findAll();
    }
}