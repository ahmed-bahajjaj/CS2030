public class Burger extends Food {
    private String cat;
    private String name;
    private int price;
    private int id;

    public Burger(String cat, String name, int price) {
        this.cat = cat;
        this.name = name;
        this.price = price;
        id = super.count;
        super.count++;
    }

    public String getName() {
        return this.name;
    }

    public int getPrice() {
        return price;
    }

    public String getCat() {
        return cat;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "#" + id + " " + cat + ": " + name + " (" + price + ")";
    }
}
