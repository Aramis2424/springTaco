//package tacos;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.ApplicationArguments;
//import org.springframework.boot.ApplicationRunner;
//import org.springframework.boot.CommandLineRunner;
//import org.springframework.stereotype.Component;
//import tacos.data.IngredientRepository;
//import tacos.Ingredient.Type;
//
//@Component
//public class DataLoader implements CommandLineRunner {
//    private final IngredientRepository repo;
//
//    // Инъекция зависимости через конструктор
//    @Autowired
//    public DataLoader(IngredientRepository ingredientRepository) {
//        this.repo = ingredientRepository;
//    }
//
//    @Override
//    public void run(String... args) throws Exception {
//        System.out.println("QWERTYUIOP");
//        repo.save(new Ingredient("FLTO", "Flour Tortilla", Type.WRAP));
//        repo.save(new Ingredient("COTO", "Corn Tortilla", Type.WRAP));
//        repo.save(new Ingredient("GRBF", "Ground Beef", Type.PROTEIN));
//        repo.save(new Ingredient("CARN", "Carnitas", Type.PROTEIN));
//        repo.save(new Ingredient("TMTO", "Diced Tomatoes", Type.VEGGIES));
//        repo.save(new Ingredient("LETC", "Lettuce", Type.VEGGIES));
//        repo.save(new Ingredient("CHED", "Cheddar", Type.CHEESE));
//        repo.save(new Ingredient("JACK", "Monterrey Jack", Type.CHEESE));
//        repo.save(new Ingredient("SLSA", "Salsa", Type.SAUCE));
//        repo.save(new Ingredient("SRCR", "Sour Cream", Type.SAUCE));
//    }
//}
