public class ApplePieRecipe {
//    ---------------------------------------
//      Blueprint of the class ApplePieRecipe
//    ---------------------------------------
//
//    public String recipeStep;
////
//    public ApplePieRecipe(String recipeStep) {
//        this.recipeStep = recipeStep;
//    }
//    public ApplePieRecipe() {
//    }
//
//    ---------------------------------------
//      Instantiate objects of the class Ingredient
//    ---------------------------------------
//
    Ingredient unsaltedButter = new Ingredient(200, "gram", "Unsalted butter");
    Ingredient whiteCasterSugar = new Ingredient(200, "gram", "White caster sugar");
    Ingredient selfRaisingFlour = new Ingredient(400, "gram", "Self raising flour");
    Ingredient egg = new Ingredient(1, "stuk(s)", "Egg");
    Ingredient vanillaSugar = new Ingredient(8, "gram", "Vanilla sugar");
    Ingredient salt = new Ingredient(1, "snuf", "Salt");
    Ingredient sweetAndSourApples = new Ingredient(1.5, "kilo", "Sweet and sour apples");
    Ingredient granulatedSugar = new Ingredient(75, "gram", "Granulated sugar");
    Ingredient cinnamon = new Ingredient(3, "thee spoons", "Cinnamon");
    Ingredient breadCrumbs = new Ingredient(15, "gram", "Bread crumbs");

//    ---------------------------------------
//      Methods of the class ApplePieRecipe
//    ---------------------------------------
//
//    ---------------------------------------
//      Methods to print every single step
//    ---------------------------------------
//
//
    public static void ovenPreHeating() {
        System.out.println("1. - Verwarm de oven van te voren op 170 graden Celsius (boven en onderwarmte)");
    }
    public static void eggPreparation() {
        System.out.println("2. - Klop het ei los en verdeel deze in twee delen. De ene helft is voor het deeg, het andere deel is voor het bestrijken van de appeltaart.");
    }
    public static void doughMixing() {
        System.out.println("3. - Meng de boter, bastard suiker, zelfrijzend bakmeel, een helft van het ei, vanille suiker en een snufje zout tot een stevig deeg en verdeel deze in 3 gelijke delen.");
    }
    public static void prepareTheApples() {
        System.out.println("4. - Schil nu de appels en snij deze in plakjes. Vermeng in een kopje de suiker en kaneel.");
    }
    public static void prepareTheSpringformPan() {
        System.out.println("5. - Vet de springvorm in en bestrooi deze met bloem.");
    }
    public static void fillTheSpringformPanWithDough() {
        System.out.println("6. - Gebruik een deel van het deeg om de bodem van de vorm te bedekken. Gebruik een deel van het deeg om de rand van de springvorm te bekleden. Strooi het paneermeel op de bodem van de beklede vorm. De paneermeel neemt het vocht van de appels op.");
    }
    public static void fillTheSpringformWithApples() {
        System.out.println("7. - Doe de heft van de appels in de vorm en strooi hier 1/3 van het kaneel-suiker mengsel overheen. Meng de ander helft van de appels met het overgebleven kaneel-suiker mengsel en leg deze in de vorm.");
    }
    public static void prepareTheDoughGrid() {
        System.out.println("8. - Rol het laatste deel van de deeg uit tot een dunne lap en snij stroken van ongeveer 1 cm breed.");
    }
    public static void placeTheDoughGridOnTheSpringformPan() {
        System.out.println("9. - Leg de stroken kuislings op de appeltaart. Met wat extra deegstroken werk je de rand rondom af. Gebruik het overgebleven ei om de bovenkant van het deeg te bestrijken.");
    }
    public static void bakeTheCake() {
        System.out.println("10. - Zet de taart iets onder het midden van de oven. Bak de taart in 60 minuten op 170 graden Celsius (boven en onderwarmte) gaar en goudbruin.");
    }
//
//    ---------------------------------------
//      Method to print all the steps with one method
//    ---------------------------------------
//
    public static void printSteps() {
        ovenPreHeating();
        eggPreparation();
        doughMixing();
        prepareTheApples();
        prepareTheSpringformPan();
        fillTheSpringformPanWithDough();
        fillTheSpringformWithApples();
        prepareTheDoughGrid();
        placeTheDoughGridOnTheSpringformPan();
        bakeTheCake();
    }

//
//    ---------------------------------------
//      Methods to print the ingredients
//    ---------------------------------------
//

    public void printIngredients() {
        System.out.println(unsaltedButter.getAmount() + " " + unsaltedButter.getUnit() + " " + unsaltedButter.getName());
        System.out.println(whiteCasterSugar.getAmount() + " " + whiteCasterSugar.getUnit() + " " + whiteCasterSugar.getName());
        System.out.println(selfRaisingFlour.getAmount() + " " + selfRaisingFlour.getUnit() + " " + selfRaisingFlour.getName());
        System.out.println(egg.getAmount() + " " + egg.getUnit() + " " + egg.getName());
        System.out.println(vanillaSugar.getAmount() + " " + vanillaSugar.getUnit() + " " + vanillaSugar.getName());
        System.out.println(salt.getAmount() + " " + salt.getUnit() + " " + salt.getName());
        System.out.println(sweetAndSourApples.getAmount() + " " + sweetAndSourApples.getUnit() + " " + sweetAndSourApples.getName());
        System.out.println(granulatedSugar.getAmount() + " " + granulatedSugar.getUnit() + " " + granulatedSugar.getName());
        System.out.println(cinnamon.getAmount() + " " + cinnamon.getUnit() + " " + cinnamon.getName());
        System.out.println(breadCrumbs.getAmount() + " " + breadCrumbs.getUnit() + " " + breadCrumbs.getName());
    }
}


