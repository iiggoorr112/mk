

public enum DishType {


    BURGER("Бургер");

    private String name;

    DishType(String name) {
        this.name = name;
    }


    public String getName() {
        return name;
    }
}
