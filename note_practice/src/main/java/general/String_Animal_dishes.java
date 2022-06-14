package general;

public class String_Animal_dishes {
    public static void main(String[] args) {
        String animalName1 = "great blue heron";
        String animalName2 = "chickadee";
        String dish1 = "garlic naan";
        String dish2 = "chocolate cake";

        System.out.println("validateDish(animalName1, dish1) = " + validateDish(animalName1, dish1));
        System.out.println("validateDish(animalName2, dish2) = " + validateDish(animalName2, dish2));
        System.out.println("validateDish(\"animalName2\", \"dish2\") = " + validateDish("animalName2", "dish2"));
    }

    public static boolean validateDish(String name, String dish) {
        return name.charAt(0) == dish.charAt(0) && name.charAt(name.length()-1) == dish.charAt(dish.length()-1);
    }
}
