public class Ingredient {
//
//    ---------------------------------------
//      Blueprint of the class Ingredient
//    ---------------------------------------
//
    private double amount; // restricted access within this Ingredient class
    private String unit; // restricted access within this Ingredient class
    private String name; // restricted access within this Ingredient class

    public Ingredient(double amount, String unit, String name) {
        this.amount = amount;
        this.unit = unit;
        this.name = name;
    }
    public Ingredient() {

    }
//
//    ---------------------------------------
//      Get-instructions to access the variable from a different class
//    ---------------------------------------
//
    public String getName(){
        return name;
    }
    public double getAmount() {
        return amount;
    }
    public String getUnit() {
        return unit;
    }
//
//    ---------------------------------------
//      Set-instructions to overwrite the variable from a different class
//    ---------------------------------------
//
    public void setName(String name) {
        this.name = name;
    }
    public void setAmount(double amount) {
        this.amount = amount;
    }
    public void setUnit(String unit) {
        this.unit = unit;
    }

    //    public String toString(){
//        return "nummer: "+ this.number + " street: "+ this.street + " zipcode: "+ this.zipcode + "city: "+ this.city;


    RecipeSteps ovenPreHeating = new RecipeSteps("1. - Verwarm de oven van te voren op 170 graden Celsius (boven en onderwarmte)");
    RecipeSteps eggPreparation = new RecipeSteps("2. - Klop het ei los en verdeel deze in twee delen. De ene helft is voor het deeg, het andere deel is voor het bestrijken van de appeltaart.");
    RecipeSteps doughMixing = new RecipeSteps("3. - Meng de boter, bastard suiker, zelfrijzend bakmeel, een helft van het ei, vanille suiker en een snufje zout tot een stevig deeg en verdeel deze in 3 gelijke delen.");
    RecipeSteps prepareTheApples = new RecipeSteps("4. - Schil nu de appels en snij deze in plakjes. Vermeng in een kopje de suiker en kaneel.");
    RecipeSteps prepareTheSpringformPan = new RecipeSteps("5. - Vet de springvorm in en bestrooi deze met bloem.");
    RecipeSteps fillTheSpringformPanWithDough = new RecipeSteps("6. - Gebruik een deel van het deeg om de bodem van de vorm te bedekken. Gebruik een deel van het deeg om de rand van de springvorm te bekleden. Strooi het paneermeel op de bodem van de beklede vorm. De paneermeel neemt het vocht van de appels op.");
    RecipeSteps fillTheSpringformWithApples = new RecipeSteps("7. - Doe de heft van de appels in de vorm en strooi hier 1/3 van het kaneel-suiker mengsel overheen. Meng de ander helft van de appels met het overgebleven kaneel-suiker mengsel en leg deze in de vorm.");
    RecipeSteps prepareTheDoughGrid = new RecipeSteps("8. - Rol het laatste deel van de deeg uit tot een dunne lap en snij stroken van ongeveer 1 cm breed.");
    RecipeSteps placeTheDoughGridOnTheSpringformPan = new RecipeSteps("9. - Leg de stroken kruislings op de appeltaart. Met wat extra deegstroken werk je de rand rondom af. Gebruik het overgebleven ei om de bovenkant van het deeg te bestrijken.");
    RecipeSteps bakeTheCake = new RecipeSteps("10. - Zet de taart iets onder het midden van de oven. Bak de taart in 60 minuten op 170 graden Celsius (boven en onderwarmte) gaar en goudbruin.");
}
