package lesson7.javaLessons;

public class Cat {
    private String name;
    private int appetite;
    private boolean satiety;

    public Cat(String name, int appetite, boolean satiety){
        this.name = name;
        this.appetite = appetite;
        this.satiety = satiety;
    }

    public void eat(Plate p){
        if(p.decreaseFood(appetite)){
            this.satiety = true;
        } else {
            this.satiety = false;
        }
    }

    public int getAppetite() {
        return appetite;
    }

    public void setAppetite(int appetite) {
        this.appetite = appetite;
    }
    public void info(){
        System.out.printf("name: %s%nappetite: %s%nsatiety: %b%n", this.name,this.appetite, this.satiety);
    }
    public boolean getSatiety(){
        return satiety;
    }


}
