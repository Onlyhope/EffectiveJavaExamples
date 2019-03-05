import builder.NutritionFacts;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        NutritionFacts chickenFacts = new
                NutritionFacts.Builder(2, 10)
                .calories(100)
                .sodium(35)
                .carbohydrate(27)
                .fat(2)
                .build();

        System.out.println(chickenFacts);
    }
}
