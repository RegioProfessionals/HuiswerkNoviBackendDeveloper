public class Ingredient {
    public double amount;
    public String unit;
    public String name;

    public Ingredient(double amount, String unit, String name) {
        this.amount = amount;
        this.unit = unit;
        this.name = name;
    }
    public Ingredient() {

    }
    // getters
    public String getName(){
        return this.name;
    }
    public double getAmount() {
        return this.amount;
    }
    public String getUnit() {
        return this.unit;
    }

    // setters

    public void setName(String name) {
        this.name = name;
    }
    public void setAmount(double amount) {
        this.amount = amount;
    }
    public void setUnit(int unit) {
        this.name = name;
    }

    //    public String toString(){
//        return "nummer: "+ this.number + " street: "+ this.street + " zipcode: "+ this.zipcode + "city: "+ this.city;

}
