package tacos.security;

import lombok.AllArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import lombok.Data;

import tacos.UserTaco;

@Data
@AllArgsConstructor
public class RegistrationForm {
    private String username;
    private String password;
    private String fullname;
    private String street;
    private String city;
    private String state;
    private String zip;
    private String phone;
    public UserTaco toUser(PasswordEncoder passwordEncoder) {
        return new UserTaco(
                username, passwordEncoder.encode(password),
                fullname, street, city, state, zip, phone);
    }
}