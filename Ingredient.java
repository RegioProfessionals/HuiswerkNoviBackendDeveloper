public class Ingredient {
    private double amount;
    private int unit;
    private String name;

    public Ingredient(double amount, int unit, String name) {
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
    public int getUnit() {
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


//- 200 gram ongezouten roomboter
//- 200 gram witte bastard suiker
//- 400 gram zelfrijzend bakmeel
//- 1 stuk(s) ei
//- 8 gram vanillesuiker
//- 1 snuf zout
//- 1.5 kilo zoetzure appels
//- 75 gram kristal suiker
//- 3 theelepels kaneel
//- 15 gram paneermeel
//}
