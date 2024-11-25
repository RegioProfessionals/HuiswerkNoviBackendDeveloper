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


    RecipeSteps ovenPreHeating = new RecipeSteps("Test 1");
    RecipeSteps eggPreparation = new RecipeSteps("Test 2");
    RecipeSteps doughMixing = new RecipeSteps("Test 3");
    RecipeSteps prepareTheApples = new RecipeSteps("Test 4");
    RecipeSteps prepareTheSpringformPan = new RecipeSteps("Test 5");
    RecipeSteps fillTheSpringformPanWithDough = new RecipeSteps("Test 6");
    RecipeSteps fillTheSpringformWithApples = new RecipeSteps("Test 7");
    RecipeSteps prepareTheDoughGrid = new RecipeSteps("Test 8");
    RecipeSteps placeTheDoughGridOnTheSpringformPan = new RecipeSteps("Test 9");
    RecipeSteps bakeTheCake = new RecipeSteps("Test 10");

    public void printStepsInTheClass () {
        System.out.println(ovenPreHeating.getRecipeStep());
        System.out.println(eggPreparation.getRecipeStep());
        System.out.println(doughMixing.getRecipeStep());
        System.out.println(prepareTheApples.getRecipeStep());
        System.out.println(prepareTheSpringformPan.getRecipeStep());
        System.out.println(fillTheSpringformPanWithDough.getRecipeStep());
        System.out.println(fillTheSpringformWithApples.getRecipeStep());
        System.out.println(prepareTheDoughGrid.getRecipeStep());
        System.out.println(placeTheDoughGridOnTheSpringformPan.getRecipeStep());
        System.out.println(bakeTheCake.getRecipeStep());
    }

}
