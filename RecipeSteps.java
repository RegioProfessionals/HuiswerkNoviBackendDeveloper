public class RecipeSteps {
//
//    ---------------------------------------
//      Blueprint of the class RecipeSteps
//    ---------------------------------------
//
   private String recipeStep; // restricted access within this Ingredient class

    public RecipeSteps(String recipeStep) {
        this.recipeStep= recipeStep;
    }

//
//    ---------------------------------------
//      Get-instructions to access the variable from a different class
//    ---------------------------------------
//
    public String getRecipeStep(){
        return recipeStep;
    }
//
//    ---------------------------------------
//      Set-instructions to overwrite the variable from a different class
//    ---------------------------------------
//
    public void setRecipeStep(String recipeStep) {
        this.recipeStep = recipeStep;
    }


    public void printStepsInTheClass () {
        System.out.println(ovenPreHeating.getRecipeStep());
    }
}
