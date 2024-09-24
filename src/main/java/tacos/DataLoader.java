package tacos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;
import tacos.data.IngredientRepository;
import tacos.Ingredient.Type;
import tacos.data.UserRepository;
import tacos.security.RegistrationForm;

@Component
public class DataLoader implements CommandLineRunner {
    private final IngredientRepository repoIngr;
    private final UserRepository repoUser;
    private final PasswordEncoder encoder;

    // Инъекция зависимости через конструктор
    @Autowired
    public DataLoader(IngredientRepository ingredientRepository, UserRepository repoUser, PasswordEncoder encoder) {
        this.repoIngr = ingredientRepository;
        this.repoUser = repoUser;
        this.encoder = encoder;
    }

    @Override
    public void run(String... args) throws Exception {
        repoIngr.save(new Ingredient("FLTO", "Flour Tortilla", Type.WRAP));
        repoIngr.save(new Ingredient("COTO", "Corn Tortilla", Type.WRAP));
        repoIngr.save(new Ingredient("GRBF", "Ground Beef", Type.PROTEIN));
        repoIngr.save(new Ingredient("CARN", "Carnitas", Type.PROTEIN));
        repoIngr.save(new Ingredient("TMTO", "Diced Tomatoes", Type.VEGGIES));
        repoIngr.save(new Ingredient("LETC", "Lettuce", Type.VEGGIES));
        repoIngr.save(new Ingredient("CHED", "Cheddar", Type.CHEESE));
        repoIngr.save(new Ingredient("JACK", "Monterrey Jack", Type.CHEESE));
        repoIngr.save(new Ingredient("SLSA", "Salsa", Type.SAUCE));
        repoIngr.save(new Ingredient("SRCR", "Sour Cream", Type.SAUCE));

        if (repoUser.findByUsername("qwer") == null)
            repoUser.save(new RegistrationForm("qwer", "1234", "RomanBolvan", "dinDon",
                    "qaz", "qw", "123", "3258362694").toUser(encoder));
    }
}
